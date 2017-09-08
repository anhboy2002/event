package event.gamelofd.com.exenvet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnResult1;
    private Button btnResult2;
    private Button btnResult3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        btnResult1 = (Button) findViewById(R.id.btn_result1);
        btnResult2 = (Button) findViewById(R.id.btn_result2);
        btnResult3 = (Button) findViewById(R.id.btn_result3);
        btnResult3.setOnClickListener(this);

        btnResult2.setOnClickListener(new View.OnClickListener()


        {
            public void onClick(View arg0) {
                EditText editNumberA = (EditText) findViewById(R.id.edt_sologan1);
                EditText editNumberB = (EditText) findViewById(R.id.edt_sologan2);
                if (!editNumberA.getText().toString().isEmpty() && !editNumberB.getText().toString().isEmpty()) {

                    int numberA = Integer.parseInt(editNumberA.getText().toString());
                    int numberB = Integer.parseInt(editNumberB.getText().toString());
                    TextView result = (TextView) findViewById(R.id.tv_result);
                    result.setText((numberA + numberB) + "");
                } else {
                    Toast.makeText(MainActivity.this, "Vui long nhap so hop le", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

//    public boolean onCreateOptionsMenu(Menu menu) {
//
//    }


    public void tong1(View v) {
        EditText editNumberA = (EditText) findViewById(R.id.edt_sologan1);
        EditText editNumberB = (EditText) findViewById(R.id.edt_sologan2);
        if (!editNumberA.getText().toString().isEmpty() && !editNumberB.getText().toString().isEmpty()) {

            int numberA = Integer.parseInt(editNumberA.getText().toString());
            int numberB = Integer.parseInt(editNumberB.getText().toString());
            TextView result = (TextView) findViewById(R.id.tv_result);
            result.setText((numberA + numberB) + "");
        } else {
            Toast.makeText(MainActivity.this, "Vui long nhap so hop le", Toast.LENGTH_SHORT).show();

        }

    }


    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_result3:
                EditText editNumberA = (EditText) findViewById(R.id.edt_sologan1) ;
        EditText editNumberB = (EditText) findViewById(R.id.edt_sologan2);
        if (!editNumberA.getText().toString().isEmpty() && !editNumberB.getText().toString().isEmpty()) {

            int numberA = Integer.parseInt(editNumberA.getText().toString());
            int numberB = Integer.parseInt(editNumberB.getText().toString());
            TextView result = (TextView) findViewById(R.id.tv_result);
            result.setText((numberA + numberB) + "");
        } else {
            Toast.makeText(MainActivity.this, "Vui long nhap so hop le", Toast.LENGTH_SHORT).show();

        } break;
            default:
                break;

    }
    }
}