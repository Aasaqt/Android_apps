package second.com.example.admin.survey;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class third extends ActionBarActivity implements View.OnClickListener{
    EditText address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button button=(Button)findViewById(R.id.next);
        //String add_to_cart_from = getIntent().getExtras().getString("second");
        address = (EditText) findViewById(R.id.address);
        button.setOnClickListener(this);
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        );
    }
    public void onClick(View v){
        if(address.getText().toString().matches("")){
            Toast.makeText(third.this,"Fill the address",Toast.LENGTH_LONG).show();
        }else {
            String name = getIntent().getExtras().getString("Name_Person");
            String name_refree = getIntent().getExtras().getString("Name_Refree");
            Intent i = new Intent(this, fourth.class);
            i.putExtra("Name_Person",name);
            i.putExtra("Address",address.getText().toString());
            i.putExtra("Name_Refree",name_refree);
            //Toast.makeText(this,name +"\n"+name_refree+"\n"+address.getText().toString(),Toast.LENGTH_LONG).show();
            startActivity(i);
            finish();
        }

    }


}
