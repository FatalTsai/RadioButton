package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void show(View v) {
        TextView txv = (TextView) findViewById(R.id.txv);
        RadioGroup sex = (RadioGroup) findViewById(R.id.sex);
        switch (sex.getCheckedRadioButtonId()) {
            case R.id.male:
                txv.setText("male");
                break;

            case R.id.female:
                txv.setText("female");
                break;
        }
    }
}
