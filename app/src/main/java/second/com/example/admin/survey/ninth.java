package second.com.example.admin.survey;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ninth extends ActionBarActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);
        Button button=(Button)findViewById(R.id.next);
        button.setOnClickListener(this);
    }


    public void onClick(View v){
        Intent i=new Intent(this,tenth.class);
        startActivity(i);
        finish();
    }
}
