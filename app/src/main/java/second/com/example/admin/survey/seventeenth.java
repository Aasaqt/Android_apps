package second.com.example.admin.survey;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Database.DBSurvey;
import Database.DBSurveyBean;


public class seventeenth extends ActionBarActivity implements OnClickListener{
    EditText comments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventeenth);
        Button button = (Button) findViewById(R.id.next);
        comments = (EditText) findViewById(R.id.additional);
        String add_to_cart_from = getIntent().getExtras().getString("add_to_cart_from");
        button.setOnClickListener(this);
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        );
        //ArrayList<String> name_person = null;
        /*String name_person = null;
        if (add_to_cart_from.compareTo("second") == 0) {
            name_person = getIntent().getExtras().getString("Name_Person");
        }
        Toast.makeText(this, name_person, Toast.LENGTH_LONG).show();*/
    }
    public void onClick(View v){
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
        String other_thirteenth=getIntent().getExtras().getString("Other_Thirteenth");
        String thirteenth=getIntent().getExtras().getString("Thirteenth");
        String rooms = getIntent().getExtras().getString("Rooms");
        String other_fifteenth=getIntent().getExtras().getString("Other_Fifteenth");
        String fifteenth=getIntent().getExtras().getString("Fifteenth");
        String other_sixteenth=getIntent().getExtras().getString("Other_Sixteenth");
        String sixteenth=getIntent().getExtras().getString("Sixteenth");
        DBSurveyBean dblb = new DBSurveyBean(name_refree,name,address,email,phone,other_sixth,sixth,rent,other_seven,seven,other_eighth,eighth,
                other_ninth,ninth,other_tenth,tenth,other_eleventh,eleventh,other_twelvth,twelvth,other_thirteenth,thirteenth,rooms,other_fifteenth,
                fifteenth,other_sixteenth,sixteenth,comments.getText().toString());
        DBSurvey dbl = new DBSurvey(seventeenth.this);
        dbl.addSurvey(dblb);


        File exportDir = new File(Environment.getExternalStorageDirectory(), "");
        if (!exportDir.exists()) {
            exportDir.mkdirs();
        }

        file = new File(exportDir, "PersonCSV.csv");
        try {
            CSVReader reader = new CSVReader(new FileReader(file));
            String [] nextLine;
            try {
                while ((nextLine = reader.readNext()) != null) {

                    // nextLine[] is an array of values from the line

                    String fname=nextLine[0];
                    String lname=nextLine[1];
                    String address=nextLine[2];
                    String email=nextLine[3];

                    if(fname.equalsIgnoreCase("First Name"))
                    {

                    }
                    else
                    {
                        int value=dbhelper.addPersonData(new Person(fname,lname,address,email));
                        if(value==1)
                        {
                            Toast.makeText(getApplicationContext(), "Data inerted into table", Toast.LENGTH_LONG).show();
                        }
                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        /*Intent i=new Intent(this,fifteenth.class);
        startActivity(i);
        finish();*/
    }
}
