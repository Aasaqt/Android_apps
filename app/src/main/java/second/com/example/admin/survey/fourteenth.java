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
import android.widget.Toast;

public class fourteenth extends ActionBarActivity implements OnClickListener{
    EditText rooms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteenth);
        Button button=(Button)findViewById(R.id.next);
        rooms = (EditText) findViewById(R.id.rooms);
        button.setOnClickListener(this);
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
        if(rooms.getText().toString().matches("")){
            Toast.makeText(fourteenth.this, "Fill the number of rooms", Toast.LENGTH_LONG).show();
        }else {
            Intent i = new Intent(this, fifteenth.class);
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
            i.putExtra("Other_Thirteenth",other_thirteenth);
            i.putExtra("Thirteenth",thirteenth);
            i.putExtra("Rooms",rooms.getText().toString());
            startActivity(i);
            finish();
        }
    }
}
