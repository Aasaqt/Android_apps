package second.com.example.admin.survey;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class fifth extends ActionBarActivity implements OnClickListener{
    EditText phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        Button button=(Button)findViewById(R.id.next);
        phone = (EditText) findViewById(R.id.name_refree);
        button.setOnClickListener(this);
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        );
    }

    public void onClick(View v) {
        Intent i = new Intent(this, sixth.class);
        String name = getIntent().getExtras().getString("Name_Person");
        String name_refree = getIntent().getExtras().getString("Name_Refree");
        String address = getIntent().getExtras().getString("Address");
        String email = getIntent().getExtras().getString("Email");
        i.putExtra("Name_Person",name);
        i.putExtra("Address",address);
        i.putExtra("Name_Refree",name_refree);
        i.putExtra("Email",email);
        i.putExtra("Phone",phone.getText().toString());
        //Toast.makeText(this,name +"\n"+name_refree+"\n"+address +"\n"+email, Toast.LENGTH_LONG).show();
        startActivity(i);
        finish();
    }
}
