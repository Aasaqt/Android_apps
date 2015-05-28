package second.com.example.admin.survey;

import android.content.Intent;
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

public class second extends ActionBarActivity implements OnClickListener{
    EditText name_person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button=(Button)findViewById(R.id.next);
        name_person = (EditText) findViewById(R.id.name_person);
        button.setOnClickListener(this);
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        );
    }
    public void onClick(View v){
        if(name_person.getText().toString().matches("")){
            Toast.makeText(second.this,"Fill the name of the person",Toast.LENGTH_LONG).show();
        }else {
            Intent i = new Intent(this, third.class);
            startActivity(i);
            finish();
        }
    }


}
