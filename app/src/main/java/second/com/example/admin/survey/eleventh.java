package second.com.example.admin.survey;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class eleventh extends ActionBarActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh);
        Button button=(Button)findViewById(R.id.next);
        button.setOnClickListener(this);
    }
    public void onClick(View v){
        Intent i=new Intent(this,eleventh2.class);
        startActivity(i);
        finish();
    }
}
