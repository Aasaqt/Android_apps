package second.com.example.admin.survey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by aasaqt on 29/5/15.
 */
public class rent extends ActionBarActivity implements View.OnClickListener {
    EditText rent;
    //String add_further;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rent);
        Button button=(Button)findViewById(R.id.next);
        rent = (EditText) findViewById(R.id.rent);
        //add_further = getIntent().getExtras().getString("sixth");
        button.setOnClickListener(this);
    }
    public void onClick(View v){

            Intent i = new Intent(this, seventh.class);
        String name = getIntent().getExtras().getString("Name_Person");
        String name_refree = getIntent().getExtras().getString("Name_Refree");
        String address = getIntent().getExtras().getString("Address");
        String email = getIntent().getExtras().getString("Email");
        String phone = getIntent().getExtras().getString("Phone");
        String other_sixth = getIntent().getExtras().getString("Other_Sixth");
        String sixth= getIntent().getExtras().getString("Sixth");
        i.putExtra("Name_Person",name);
        i.putExtra("Address",address);
        i.putExtra("Name_Refree",name_refree);
        i.putExtra("Email",email);
        i.putExtra("Phone",phone);
        i.putExtra("Other_sixth",other_sixth);
        i.putExtra("Sixth",sixth);
        i.putExtra("Rent",rent.getText().toString());



        //Toast.makeText(this,name +"\n"+name_refree+"\n"+address +"\n"+email+"\n"+phone+"\n"+other_sixth+"\n"+sixth, Toast.LENGTH_LONG).show();

        startActivity(i);
            finish();

    }
}