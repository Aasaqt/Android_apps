package second.com.example.admin.survey;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class seventh extends ActionBarActivity implements OnClickListener{
    RadioGroup choice;
    RadioButton selectedRadioButton,other;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        Button button=(Button)findViewById(R.id.next);
        choice = (RadioGroup) findViewById(R.id.radiogroup);

        other = (RadioButton) findViewById(R.id.option5);
        text = (EditText) findViewById(R.id.option6);
        choice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                              @Override
                                              public void onCheckedChanged(RadioGroup group, int checkedId) {
                                                  if(checkedId==R.id.option5){
                                                      text.setVisibility(View.VISIBLE);
                                                  }else{
                                                      text.setVisibility(View.INVISIBLE);
                                                  }
                                              }
                                          }
        );
        button.setOnClickListener(this);
    }



    public void onClick(View v) {
        int selectId = choice.getCheckedRadioButtonId();
        selectedRadioButton = (RadioButton) findViewById(selectId);
        String name = getIntent().getExtras().getString("Name_Person");
        String name_refree = getIntent().getExtras().getString("Name_Refree");
        String address = getIntent().getExtras().getString("Address");
        String email = getIntent().getExtras().getString("Email");
        String phone = getIntent().getExtras().getString("Phone");
        String other_sixth = getIntent().getExtras().getString("Other_Sixth");
        String sixth= getIntent().getExtras().getString("Sixth");
        String rent = getIntent().getExtras().getString("Rent");
        if(other.isChecked()){

            if(text.getText().toString().matches("")){
                Toast.makeText(seventh.this, "Fill the other option", Toast.LENGTH_LONG).show();
            }else{
                Intent i = new Intent(this, eighth.class);
                i.putExtra("Name_Person",name);
                i.putExtra("Address",address);
                i.putExtra("Name_Refree",name_refree);
                i.putExtra("Email",email);
                i.putExtra("Phone",phone);
                i.putExtra("Sixth",sixth);
                i.putExtra("Rent",rent);
                i.putExtra("Other_sixth",other_sixth);
                i.putExtra("Other_Seventh",selectedRadioButton.getText().toString() + "," + text.getText().toString());
                startActivity(i);
                finish();
            }

        }else if(choice.getCheckedRadioButtonId() == -1){

            Toast.makeText(seventh.this,"Fill the entry",Toast.LENGTH_LONG).show();
        }else {
            Intent i = new Intent(this, eighth.class);

            i.putExtra("Name_Person",name);
            i.putExtra("Address",address);
            i.putExtra("Name_Refree",name_refree);
            i.putExtra("Email",email);
            i.putExtra("Phone",phone);
            i.putExtra("Sixth",sixth);
            i.putExtra("Rent",rent);
            i.putExtra("Other_sixth",other_sixth);
            i.putExtra("Seventh",selectedRadioButton.getText().toString());
            //Toast.makeText(this,name +"\n"+name_refree+"\n"+address +"\n"+email+"\n"+other_sixth +"\n"+sixth, Toast.LENGTH_LONG).show();
            startActivity(i);
            finish();
        }
    }
}
