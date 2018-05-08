package com.example.downn.dataintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");

        TextView text2 = (TextView)findViewById(R.id.text2);
        text2.setText(data);


        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                String returndata;
                returndata = ((EditText)findViewById(R.id.info2)).getText().toString();

                if(returndata.equals("")){
                    returndata = "Hello FirstActivity";
                }

                intent.putExtra("data_return",returndata);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
