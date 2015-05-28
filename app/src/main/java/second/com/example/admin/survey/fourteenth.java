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
        if(rooms.getText().toString().matches("")){
            Toast.makeText(fourteenth.this, "Fill the number of rooms", Toast.LENGTH_LONG).show();
        }else {
            Intent i = new Intent(this, fifteenth.class);
            startActivity(i);
            finish();
        }
    }
}
