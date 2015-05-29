package second.com.example.admin.survey;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnClickListener{
    //private int count=1;
    private Button first;
    AlertDialog dia;
    EditText first_refree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=(Button)findViewById(R.id.next);
        first_refree = (EditText) findViewById(R.id.name_refree);

            first.setOnClickListener(this);
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        );

    }
    public void onClick(View v){
        if(first_refree.getText().toString().matches("")){
            Toast.makeText(MainActivity.this,"Fill the name of the refree",Toast.LENGTH_LONG).show();
        }else {
            /*DBFirstBean dblb = new DBFirstBean(first_refree.getText().toString());
            DBSurvey dbl = new DBSurvey(MainActivity.this);
            dbl.addFirst(dblb);*/
            Intent i = new Intent(this, second.class);
            i.putExtra("Name_Refree",first_refree.getText().toString());
            startActivity(i);
            finish();
        }
        /*
        count++;
        switch(count){
            case 1:
                setContentView(R.layout.activity_main);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 2:
                setContentView(R.layout.second);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 3:
                setContentView(R.layout.third);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 4:
                setContentView(R.layout.fourth);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 5:
                setContentView(R.layout.fifth);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 6:
                setContentView(R.layout.sixth);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 7:
                setContentView(R.layout.seventh);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 8:
                setContentView(R.layout.eighth);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 9:
                setContentView(R.layout.ninth);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 10:
                setContentView(R.layout.tenth);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 11:
                setContentView(R.layout.eleventh);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 12:
                setContentView(R.layout.twelvth);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 13:
                setContentView(R.layout.twelvth2);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 14:
                setContentView(R.layout.thirteenth);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 15:
                setContentView(R.layout.thirteenth2);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 16:
                setContentView(R.layout.fourteenth);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 17:
                setContentView(R.layout.fifttenth);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 18:
                setContentView(R.layout.sixteenth);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 19:
                setContentView(R.layout.sixteenth2);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            case 20:
                setContentView(R.layout.seventeenth);
                first=(Button)findViewById(R.id.next);
                first.setOnClickListener(this);
                break;
            */
        }
        //setContentView(R.layout.second);
    }



