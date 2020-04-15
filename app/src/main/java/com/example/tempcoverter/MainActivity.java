package com.example.tempcoverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tempconv.R;

public class MainActivity extends AppCompatActivity {
    private EditText Value;
    private Button C,F;
    private TextView Display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Value=(EditText)findViewById(R.id.et1);
        C=(Button)findViewById(R.id.btn1);
        F=(Button) findViewById(R.id.btn2);
        Display=(TextView)findViewById(R.id.tv1);

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(Value.getText().toString()))
                {
                    // Toast.makeText(MainActivity.this,"Cannot be Empty",Toast.LENGTH_SHORT).show();
                    Value.setError("Cannot be empty");
                }
                else {
                    float a = Float.parseFloat(Value.getText().toString());
                    float f = (a * 9 / 5) + 32;
                    Display.setText("Fahrenheit " + f + "°F");
                }
            }
        });
        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(Value.getText().toString()))
                {
//                   Toast.makeText(MainActivity.this,"Cannot be Empty",Toast.LENGTH_SHORT).show();
                    Value.setError("Cannot be empty");
                }
                else {

                    float a = Float.parseFloat(Value.getText().toString());
                    float f = (a - 32) * 5 / 9;
                    Display.setText("Celsius " + f + "°C");
                }

            }
        });
    }
}