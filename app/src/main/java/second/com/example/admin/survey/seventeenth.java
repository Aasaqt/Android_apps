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


public class seventeenth extends ActionBarActivity implements OnClickListener{
    EditText comments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventeenth);
        Button button=(Button)findViewById(R.id.next);
        comments = (EditText) findViewById(R.id.additional);
        button.setOnClickListener(this);
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        );
    }
    public void onClick(View v){
        /*Intent i=new Intent(this,fifteenth.class);
        startActivity(i);
        finish();*/
    }
}
