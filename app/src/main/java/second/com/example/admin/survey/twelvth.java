package second.com.example.admin.survey;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;


public class twelvth extends ActionBarActivity implements OnClickListener{
    RadioGroup choice;
    RadioButton selectedRadioButton,other;
    EditText text;
    CheckBox chk1,chk2,chk3,chk4,chk5,chk6,chk7,chk8,chk9,chk10,chk11,chk12,chk13,chk14,chk15;
    ArrayList<String> list ;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelvth);
        Button button=(Button)findViewById(R.id.next);
        //choice = (RadioGroup) findViewById(R.id.radiogroup);
        chk1=(CheckBox)findViewById(R.id.option1);
        chk2=(CheckBox)findViewById(R.id.option2);
        chk3=(CheckBox)findViewById(R.id.option3);
        chk4=(CheckBox)findViewById(R.id.option4);
        chk5=(CheckBox)findViewById(R.id.option5);
        chk6=(CheckBox)findViewById(R.id.option6);
        chk7=(CheckBox)findViewById(R.id.option7);
        chk8=(CheckBox)findViewById(R.id.option8);
        chk9=(CheckBox)findViewById(R.id.option9);
        chk10=(CheckBox)findViewById(R.id.option10);
        chk11=(CheckBox)findViewById(R.id.option11);
        chk12=(CheckBox)findViewById(R.id.option12);
        chk13=(CheckBox)findViewById(R.id.option13);
        chk14=(CheckBox)findViewById(R.id.option14);
        chk15=(CheckBox)findViewById(R.id.option15);
        list = new ArrayList<String>();
        //other = (RadioButton) findViewById(R.id.option15);
        text = (EditText) findViewById(R.id.edittext);
        /*choice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                              @Override
                                              public void onCheckedChanged(RadioGroup group, int checkedId) {
                                                  if(checkedId==R.id.option15){
                                                      text.setVisibility(View.VISIBLE);
                                                  }else{
                                                      text.setVisibility(View.INVISIBLE);
                                                  }
                                              }
                                          }
        );*/
        button.setOnClickListener(this);
    }
    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.option1:
                list.add(chk1.getText().toString());


                break;
            case R.id.option2:
                list.add(chk2.getText().toString());

                break;

            case R.id.option3:
                list.add(chk3.getText().toString());

                break;
            case R.id.option4:
                list.add(chk4.getText().toString());

                break;
            case R.id.option5:
                list.add(chk5.getText().toString());

                break;
            case R.id.option6:
                list.add(chk6.getText().toString());

                break;
            case R.id.option7:
                list.add(chk7.getText().toString());


                break;
            case R.id.option8:
                list.add(chk8.getText().toString());

                break;

            case R.id.option9:
                list.add(chk9.getText().toString());

                break;
            case R.id.option10:
                list.add(chk10.getText().toString());

                break;
            case R.id.option11:
                list.add(chk11.getText().toString());

                break;
            case R.id.option12:
                list.add(chk12.getText().toString());

                break;
            case R.id.option13:
                list.add(chk13.getText().toString());

                break;
            case R.id.option14:
                list.add(chk14.getText().toString());

                break;

            case R.id.option15:

                text.setVisibility(View.VISIBLE);
                String add = chk15.getText().toString() +text.getText().toString();
                //Toast.makeText(this,add,Toast.LENGTH_LONG).show();
                list.add(add);
                //list.add(edittext.getText().toString());
                break;
            /*case R.id.option8:
                list.add(chk8.getTag().toString());

                break;
            case R.id.checkBox9:
                list.add(chk9.getTag().toString());

                break;*/

        }
    }
    public void onClick(View v){
        //int selectId = choice.getCheckedRadioButtonId();
        //selectedRadioButton = (RadioButton) findViewById(selectId);
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
        //String other_tenth=getIntent().getExtras().getString("Other_Tenth");
        String tenth=getIntent().getExtras().getString("Tenth");
        //String other_eleventh=getIntent().getExtras().getString("Other_Eleventh");
        String eleventh=getIntent().getExtras().getString("Eleventh");
        /*if(other.isChecked()){

            if(text.getText().toString().matches("")){
                Toast.makeText(twelvth.this, "Fill the other option", Toast.LENGTH_LONG).show();
            }else{
                Intent i = new Intent(this, thirteenth.class);
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
                //i.putExtra("Other_Tenth",other_tenth);
                i.putExtra("Tenth",tenth);
                //i.putExtra("Other_Eleventh",other_eleventh);
                i.putExtra("Eleventh",eleventh);
                i.putExtra("Other_Twelvth",selectedRadioButton.getText().toString() + "," + text.getText().toString());
                startActivity(i);
                finish();
            }

        }else if(choice.getCheckedRadioButtonId() == -1){

            Toast.makeText(twelvth.this,"Fill the entry",Toast.LENGTH_LONG).show();
        }*/
        for(int i=0;i<list.size();i++){
            value = value +", "+list.get(i);

        }
        if(list.isEmpty()){
            Toast.makeText(this,"Fill atleast one entry",Toast.LENGTH_LONG).show();
        }else {
            Intent i = new Intent(this, thirteenth.class);
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
            //i.putExtra("Other_Tenth",other_tenth);
            i.putExtra("Tenth",tenth);
            //i.putExtra("Other_Eleventh",other_eleventh);
            i.putExtra("Eleventh",eleventh);
            i.putExtra("Twelvth",value);
            startActivity(i);
            finish();
        }
    }
}
