package second.com.example.admin.survey;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ninth extends ActionBarActivity implements OnClickListener{
    RadioGroup choice;
    RadioButton selectedRadioButton,other;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);
        Button button=(Button)findViewById(R.id.next);
        button.setOnClickListener(this);
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
    }


    public void onClick(View v){
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
        String other_seven=getIntent().getExtras().getString("Other_Seventh");
        String seven=getIntent().getExtras().getString("Seventh");
        String other_eighth=getIntent().getExtras().getString("Other_Eighth");
        String eighth=getIntent().getExtras().getString("Eighth");
        if(other.isChecked()){

            if(text.getText().toString().matches("")){
                Toast.makeText(ninth.this, "Fill the other option", Toast.LENGTH_LONG).show();
            }else{
                Intent i = new Intent(this, tenth.class);
                i.putExtra("Name_Person",name);
                i.putExtra("Address",address);
                i.putExtra("Name_Refree",name_refree);
                i.putExtra("Email",email);
                i.putExtra("Phone",phone);
                i.putExtra("Sixth",sixth);
                i.putExtra("Rent",rent);
                i.putExtra("Other_sixth",other_sixth);
                i.putExtra("Other_Seventh",other_seven);
                i.putExtra("Seventh",seven);
                i.putExtra("Other_Eighth",other_eighth);
                i.putExtra("Eighth",eighth);
                i.putExtra("Other_Ninth",selectedRadioButton.getText().toString() + "," + text.getText().toString());
                startActivity(i);
                finish();
            }

        }else if(choice.getCheckedRadioButtonId() == -1){

            Toast.makeText(ninth.this,"Fill the entry",Toast.LENGTH_LONG).show();
        }else {
            Intent i = new Intent(this, tenth.class);
            i.putExtra("Name_Person",name);
            i.putExtra("Address",address);
            i.putExtra("Name_Refree",name_refree);
            i.putExtra("Email",email);
            i.putExtra("Phone",phone);
            i.putExtra("Sixth",sixth);
            i.putExtra("Rent",rent);
            i.putExtra("Other_sixth",other_sixth);
            i.putExtra("Other_Seventh",other_seven);
            i.putExtra("Seventh",seven);
            i.putExtra("Other_Eighth",other_eighth);
            i.putExtra("Eighth",eighth);
            i.putExtra("Ninth",selectedRadioButton.getText().toString());
            startActivity(i);
            finish();
        }
    }
}
