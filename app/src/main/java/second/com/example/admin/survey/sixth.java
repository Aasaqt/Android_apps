package second.com.example.admin.survey;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class sixth extends ActionBarActivity implements OnClickListener{
    RadioGroup choice;
    RadioButton selectedRadioButton,other;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        Button button=(Button)findViewById(R.id.next);
        choice = (RadioGroup) findViewById(R.id.radiogroup);

        other = (RadioButton) findViewById(R.id.option4);
        text = (EditText) findViewById(R.id.option5);
        choice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                              @Override
                                              public void onCheckedChanged(RadioGroup group, int checkedId) {
                                                    if(checkedId==R.id.option4){
                                                        text.setVisibility(View.VISIBLE);
                                                    }else{
                                                        text.setVisibility(View.INVISIBLE);
                                                    }
                                              }
                                          }
                );
        /*if(other.isChecked() == true){
            choice.clearCheck();
        }*/

        //Boolean check = other.isChecked();
        button.setOnClickListener(this);
    }


    public void onClick(View v) {

        String name = getIntent().getExtras().getString("Name_Person");
        String name_refree = getIntent().getExtras().getString("Name_Refree");
        String address = getIntent().getExtras().getString("Address");
        String email = getIntent().getExtras().getString("Email");
        String phone = getIntent().getExtras().getString("Phone");
        int selectId = choice.getCheckedRadioButtonId();
        selectedRadioButton = (RadioButton) findViewById(selectId);

        if(other.isChecked()){

            if(text.getText().toString().matches("")){
                Toast.makeText(sixth.this,"Fill the other option",Toast.LENGTH_LONG).show();
            }else{
                Intent i = new Intent(this, rent.class);
                //i.putExtra("sixth","other");
                i.putExtra("Other_Sixth",selectedRadioButton.getText().toString() + "," + text.getText().toString());
                i.putExtra("Name_Person",name);
                i.putExtra("Address",address);
                i.putExtra("Name_Refree",name_refree);
                i.putExtra("Email",email);
                i.putExtra("Phone",phone);
                startActivity(i);
                finish();
            }

        }else if(choice.getCheckedRadioButtonId() == -1){

            Toast.makeText(sixth.this,"Fill the entry",Toast.LENGTH_LONG).show();
        }else {
            //other.setSelected(false);
            Intent i = new Intent(this, rent.class);

            i.putExtra("Sixth",selectedRadioButton.getText().toString());
            i.putExtra("Name_Person",name);
            i.putExtra("Address",address);
            i.putExtra("Name_Refree",name_refree);
            i.putExtra("Email",email);
            i.putExtra("Phone",phone);

            //Toast.makeText(this,selectedRadioButton.getText().toString()+" , "+text.getText().toString(),Toast.LENGTH_LONG).show();
            startActivity(i);
            finish();
        }


    }
}
