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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rent);
        Button button=(Button)findViewById(R.id.next);
        rent = (EditText) findViewById(R.id.rent);
        button.setOnClickListener(this);
    }
    public void onClick(View v){

            Intent i = new Intent(this, seventh.class);
            startActivity(i);
            finish();

    }
}