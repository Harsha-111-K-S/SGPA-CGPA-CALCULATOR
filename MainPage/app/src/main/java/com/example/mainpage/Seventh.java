package com.example.mainpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Seventh extends AppCompatActivity implements  View.OnClickListener{
    EditText et2, et1,et3,et4,et5,et6,et7,et8;
    Button btn_calc,btn_clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        et1 = (EditText) findViewById(R.id.et1);
        et1.setText("");
        et2 = (EditText) findViewById(R.id.et2);
        et2.setText("");
        et3 = (EditText) findViewById(R.id.et3);
        et3.setText("");
        et4 = (EditText) findViewById(R.id.et4);
        et4.setText("");
        et5 = (EditText) findViewById(R.id.et5);
        et5.setText("");
        et6 = (EditText) findViewById(R.id.et6);
        et6.setText("");
        et7 = (EditText) findViewById(R.id.et7);
        et7.setText("");
        et8 = (EditText) findViewById(R.id.et8);
        et8.setText("");


        btn_calc = (Button) findViewById(R.id.btn_calc);
        btn_calc.setOnClickListener(this);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v.equals(btn_clear)) {
            et1.setText("");
            et2.setText("");
            et3.setText("");
            et4.setText("");
            et5.setText("");
            et6.setText("");
            et7.setText("");
            et8.setText("");

        }
        if (v.equals(btn_calc)) {
            int sub1 = Integer.parseInt(String.valueOf(et1.getText()));
            int sub2 = Integer.parseInt(String.valueOf(et2.getText()));
            int sub3 = Integer.parseInt(String.valueOf(et3.getText()));
            int sub4 = Integer.parseInt(String.valueOf(et4.getText()));
            int sub5 = Integer.parseInt(String.valueOf(et5.getText()));
            int project1 = Integer.parseInt(String.valueOf(et6.getText()));
            int lab1 = Integer.parseInt(String.valueOf(et7.getText()));

            int c1 = grade(sub1);
            int c2 = grade(sub2);
            int c3 = grade(sub3);
            int c4 = grade(sub4);
            int c5 = grade(sub5);
            int c6 = grade(project1);
            int c7 = grade(lab1);
            int sum = ((c1 * 4) + (c2 * 4) + (c3 * 3) + (c4 * 3) + (c5 * 3) +(c6 * 1) + (c7* 2));
            float sgpa = (float)sum / 20;
            et8.setText(String.valueOf(sgpa));
        }
    }
    private int grade(int marks){
        int  c=0;
        if(marks>=90)
            c=10;
        else if(marks>=80 && marks<90)
            c=9;
        else if(marks>=70 && marks<80)
            c=8;

        else if(marks>=60 && marks<70)
            c=7;
        else if(marks>=45 && marks<60)
            c=6;
        else if(marks>=40 && marks<45)
            c=4;
        else
            c=0;
        return c;
    }
}