package second.com.example.admin.survey;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class tenth extends ActionBarActivity implements OnClickListener{
    TextView text;
    EditText edittext;
    CheckBox chk1,chk2,chk3,chk4,chk5,chk6,chk7;
    ArrayList<String> list ;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        Button button=(Button)findViewById(R.id.next);

        chk1=(CheckBox)findViewById(R.id.option1);
        chk2=(CheckBox)findViewById(R.id.option2);
        chk3=(CheckBox)findViewById(R.id.option3);
        chk4=(CheckBox)findViewById(R.id.option4);
        chk5=(CheckBox)findViewById(R.id.option5);
        chk6=(CheckBox)findViewById(R.id.option6);
        chk7=(CheckBox)findViewById(R.id.option7);

        list = new ArrayList<String>();

//        other = (CheckBox) findViewById(R.id.option7);
        //text = (TextView) findViewById(R.id.question);
        edittext = (EditText) findViewById(R.id.option8);
        /*choice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                              @Override
                                              public void onCheckedChanged(RadioGroup group, int checkedId) {
                                                  if(checkedId==R.id.option7){
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

                edittext.setVisibility(View.VISIBLE);
                String add = chk7.getText().toString() +edittext.getText().toString();
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

            /*if(chk1.isChecked()) {
                list.add(chk1.getTag().toString());
            }
            if(chk2.isChecked()){
                list.add(chk2.getTag().toString());
            }
            if(chk3.isChecked()){

            }

                list.add(chk3.getTag().toString());


                list.add(chk4.getTag().toString());


                list.add(chk5.getTag().toString());


                list.add(chk6.getTag().toString());


                text.setVisibility(View.VISIBLE);
                list.add(chk7.getTag().toString() +"," +text.getText().toString());
*/

        //String value = null;
                /*for (String str : list) {
                    text.setText(text.getText().toString()+str);
                    //Toast.makeText(this,str,Toast.LENGTH_LONG).show();
                }*/
        for(int i=0;i<list.size();i++){
            value = value +", "+list.get(i);

        }

                //String[] value = list.toArray(new String[list.size()]);
                Toast.makeText(this,value,Toast.LENGTH_LONG).show();
                //int selectId = choice.getCheckedRadioButtonId();
                //selectedRadioButton = (CheckBox) findViewById(selectId);
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

                /*if(other.isChecked()){

                    if(text.getText().toString().matches("")){
                        Toast.makeText(tenth.this, "Fill the other option", Toast.LENGTH_LONG).show();
                    }else{
                        Intent i = new Intent(this, eleventh.class);
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
                        //i.putExtra("Other_Tenth",selectedRadioButton.getText().toString() + "," + text.getText().toString());
                        startActivity(i);
                        finish();
                    }

                }else if(choice.getCheckedRadioButtonId() == -1){

                    Toast.makeText(tenth.this,"Fill the entry",Toast.LENGTH_LONG).show();
                }else {*/
        if(list.isEmpty()){
            Toast.makeText(this,"Fill atleast one entry",Toast.LENGTH_LONG).show();
        }else {
            Intent i = new Intent(this, eleventh.class);
            i.putExtra("Name_Person", name);
            i.putExtra("Address", address);
            i.putExtra("Name_Refree", name_refree);
            i.putExtra("Email", email);
            i.putExtra("Phone", phone);
            i.putExtra("Sixth", sixth);
            i.putExtra("Rent", rent);
            i.putExtra("Other_sixth", other_sixth);
            i.putExtra("Other_Seventh", other_seven);
            i.putExtra("Seventh", seven);
            i.putExtra("Other_Eighth", other_eighth);
            i.putExtra("Eighth", eighth);
            i.putExtra("Other_Ninth", other_ninth);
            i.putExtra("Ninth", ninth);
            i.putExtra("Tenth", value);
            startActivity(i);
            finish();
        }
                //list.add(chk8.getTag().toString());


            /*case R.id.checkBox9:
                list.add(chk9.getTag().toString());

                break;*/



        //Toast.makeText(this,rent+" "+other_sixth+" "+sixth+" "+other_seven+" "+seven+" "+other_eighth+" "+eighth+" "+other_ninth+" "+ninth,Toast.LENGTH_LONG).show();
    }
}
