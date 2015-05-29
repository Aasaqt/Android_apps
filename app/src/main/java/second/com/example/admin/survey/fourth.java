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

public class fourth extends ActionBarActivity implements OnClickListener{
    EditText email;
    String EMAIL_Validation = "[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        Button button=(Button)findViewById(R.id.next);
        email = (EditText) findViewById(R.id.email);
        button.setOnClickListener(this);
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        );
    }
    public void onClick(View v){
        if(email.getText().toString().matches("")){
            Toast.makeText(fourth.this,"Fill the email",Toast.LENGTH_LONG).show();
        }else if(!email.getText().toString().trim().matches(EMAIL_Validation)){
            Toast.makeText(fourth.this,"Enter the valid Email",Toast.LENGTH_LONG).show();
        }else {
            Intent i = new Intent(this, fifth.class);
            String name = getIntent().getExtras().getString("Name_Person");
            String name_refree = getIntent().getExtras().getString("Name_Refree");
            String address = getIntent().getExtras().getString("Address");
            i.putExtra("Name_Person",name);
            i.putExtra("Address",address);
            i.putExtra("Name_Refree",name_refree);
            i.putExtra("Email",email.getText().toString());

            startActivity(i);
            finish();
        }
    }

}
