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

public class thirteenth extends ActionBarActivity implements OnClickListener{
    RadioGroup choice;
    RadioButton selectedRadioButton,other;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteenth);
        Button button=(Button)findViewById(R.id.next);
        choice = (RadioGroup) findViewById(R.id.radiogroup);

        other = (RadioButton) findViewById(R.id.option9);
        text = (EditText) findViewById(R.id.edittext);
        choice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                              @Override
                                              public void onCheckedChanged(RadioGroup group, int checkedId) {
                                                  if(checkedId==R.id.option9){
                                                      text.setVisibility(View.VISIBLE);
                                                  }else{
                                                      text.setVisibility(View.INVISIBLE);
                                                  }
                                              }
                                          }
        );
        button.setOnClickListener(this);

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
        String other_ninth=getIntent().getExtras().getString("Other_Ninth");
        String ninth=getIntent().getExtras().getString("Ninth");
        String other_tenth=getIntent().getExtras().getString("Other_Tenth");
        String tenth=getIntent().getExtras().getString("Tenth");
        String other_eleventh=getIntent().getExtras().getString("Other_Eleventh");
        String eleventh=getIntent().getExtras().getString("Eleventh");
        String other_twelvth=getIntent().getExtras().getString("Other_Twelvth");
        String twelvth=getIntent().getExtras().getString("Twelvth");
        if(other.isChecked()){

            if(text.getText().toString().matches("")){
                Toast.makeText(thirteenth.this, "Fill the other option", Toast.LENGTH_LONG).show();
            }else{
                Intent i = new Intent(this, fourteenth.class);
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
                i.putExtra("Other_Ninth",other_ninth);
                i.putExtra("Ninth",ninth);
                i.putExtra("Other_Tenth",other_tenth);
                i.putExtra("Tenth",tenth);
                i.putExtra("Other_Eleventh",other_eleventh);
                i.putExtra("Eleventh",eleventh);
                i.putExtra("Other_Twelvth",other_twelvth);
                i.putExtra("Twelvth",twelvth);
                i.putExtra("Other_Thirteenth",selectedRadioButton.getText().toString() + "," + text.getText().toString());
                startActivity(i);
                finish();
            }

        }else if(choice.getCheckedRadioButtonId() == -1){

            Toast.makeText(thirteenth.this,"Fill the entry",Toast.LENGTH_LONG).show();
        }else {
            Intent i = new Intent(this, fourteenth.class);
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
            i.putExtra("Other_Ninth",other_ninth);
            i.putExtra("Ninth",ninth);
            i.putExtra("Other_Tenth",other_tenth);
            i.putExtra("Tenth",tenth);
            i.putExtra("Other_Eleventh",other_eleventh);
            i.putExtra("Eleventh",eleventh);
            i.putExtra("Other_Twelvth",other_twelvth);
            i.putExtra("Twelvth",twelvth);
            i.putExtra("Thirteenth",selectedRadioButton.getText().toString());
            startActivity(i);
            finish();
        }
    }
}
