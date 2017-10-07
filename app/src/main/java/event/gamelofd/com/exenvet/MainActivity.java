package event.gamelofd.com.exenvet;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   // private Button btnResult1;
    private EditText editNumberA;
    private EditText editNumberB;
    private ListView lvResult;
    private ArrayAdapter<String> mAdapter;
    private ArrayList<String> mList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
      //  btnResult1 = (Button) findViewById(R.id.btn_result1);
         editNumberA = (EditText) findViewById(R.id.edt_sologan1);
         editNumberB = (EditText) findViewById(R.id.edt_sologan2);
        lvResult = (ListView) findViewById(R.id.lv_result);
        mList = new ArrayList<>();
        mAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,mList);
                lvResult.setAdapter(mAdapter);
//        btnResult1.setOnClickListener(new View.OnClickListener() {
//            @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
//                if (!editNumberA.getText().toString().isEmpty() && !editNumberB.getText().toString().isEmpty()) {
//                    float numberA = Integer.parseInt(editNumberA.getText().toString());
//                    float numberB = Integer.parseInt(editNumberB.getText().toString());
//                    Bundle bundle = new Bundle();
//                    bundle.putFloat("SoA", numberA);
//                    bundle.putFloat("SoB", numberB);
//                    intent.putExtra("MyPackage", bundle);
//                   startActivityForResult(intent, 1997);
//                } else {
//                    Toast.makeText(MainActivity.this, "Vui lòng nhập số hợp lệ", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//        SharedPreferences sharedPreferences = getSharedPreferences("myData", Context.MODE_PRIVATE);
//        Float numberA = sharedPreferences.getFloat("soA", 0);
//        Float numberB = sharedPreferences.getFloat("soB", 0);
//        editNumberA.setHint("0");
//        editNumberB.setHint("0");
//        Toast.makeText(MainActivity.this, "Wellcome back to MainActivity ! Your last edit text : a= " + numberA + "  , b= " + numberB, Toast.LENGTH_LONG).show();
    }
    public void btn_result1(View view){
        String strA = editNumberA.getText().toString();
        String strB = editNumberB.getText().toString();
        int numberA = Integer.parseInt(strA);
        int numberB = Integer.parseInt(strB);

        int Result = numberA + numberB;
        String strResult = numberA + "+" + numberB + "=" +Result;
        mList.add(strResult);
        //refresh list and data
        mAdapter.notifyDataSetChanged();
    }

}




