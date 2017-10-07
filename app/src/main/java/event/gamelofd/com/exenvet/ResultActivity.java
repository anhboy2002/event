package event.gamelofd.com.exenvet;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView tvResult;
    private Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvResult = (TextView) findViewById(R.id.tv_result);
        btnBack= (Button)findViewById(R.id.btn_back);
        Intent callerIntent = getIntent();
        final Bundle packBundle = callerIntent.getBundleExtra("MyPackage");
        float numberA = packBundle.getFloat("SoA");
        float numberB = packBundle.getFloat("SoB");
        giaiPTBN(numberA, numberB);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ResultActivity.this, MainActivity.class);
                Bundle bundle = packBundle;
                myIntent.putExtra("MyPackage", bundle);
                startActivity(myIntent);
            }
        });
        SharedPreferences sharedPreferences = getSharedPreferences("myData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putFloat("soA", numberA);
        editor.putFloat("soB", numberB);
        editor.commit();
    }
    public void giaiPTBN(float a, float b) {

        if (a == 0) {
            tvResult.setText("Phương trình vô nghiệm");
            return;
        } else if (b == 0) {
            tvResult.setText("Phương trình vô số nghiệm");
            return;
        } else
            tvResult.setText(String.valueOf((float) -b / a));

    }
}


