package com.example.mainpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class sem5 extends AppCompatActivity implements  View.OnClickListener{
    EditText e2, e1, e3, e4, e5, e6, e7, e9, e8, e10;
    Button btn_calc, btn_clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem5);
        e1 = (EditText) findViewById(R.id.e1);
        e1.setText("");
        e2 = (EditText) findViewById(R.id.e2);
        e2.setText("");
        e3 = (EditText) findViewById(R.id.e3);
        e3.setText("");
        e4 = (EditText) findViewById(R.id.e4);
        e4.setText("");
        e5 = (EditText) findViewById(R.id.e5);
        e5.setText("");
        e6 = (EditText) findViewById(R.id.e6);
        e6.setText("");
        e7 = (EditText) findViewById(R.id.e7);
        e7.setText("");

        e8 = (EditText) findViewById(R.id.e8);
        e8.setText("");
        e9 = (EditText) findViewById(R.id.e9);
        e9.setText("");
        e10 = (EditText) findViewById(R.id.e10);
        e10.setText("");
        btn_calc = (Button) findViewById(R.id.btn_calc);
        btn_calc.setOnClickListener(this);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v.equals(btn_clear)) {
            e1.setText("");
            e2.setText("");
            e3.setText("");
            e4.setText("");
            e5.setText("");
            e6.setText("");
            e7.setText("");
            e8.setText("");
            e9.setText("");
            e10.setText("");
        }
        if (v.equals(btn_calc)) {
            int sub1 = Integer.parseInt(String.valueOf(e1.getText()));
            int sub2 = Integer.parseInt(String.valueOf(e2.getText()));
            int sub3 = Integer.parseInt(String.valueOf(e3.getText()));
            int sub4 = Integer.parseInt(String.valueOf(e4.getText()));
            int sub5 = Integer.parseInt(String.valueOf(e5.getText()));
            int sub6 = Integer.parseInt(String.valueOf(e6.getText()));
            int lab1 = Integer.parseInt(String.valueOf(e7.getText()));
            int lab2 = Integer.parseInt(String.valueOf(e8.getText()));
            int sub7 = Integer.parseInt(String.valueOf(e9.getText()));
            int c1 = grade(sub1);
            int c2 = grade(sub2);
            int c3 = grade(sub3);
            int c4 = grade(sub4);
            int c5 = grade(sub5);
            int c6 = grade(sub6);
            int c7 = grade(lab1);
            int c8 = grade(lab2);
            int c9 = grade(sub7);
            int sum = ((c1 * 4) + (c2 * 4) + (c3 * 3) + (c4 * 3) + (c5 * 3) + (c6 * 3) + (c7 * 2) + (c8 * 2) + (c9 * 1));
            float sgpa = (float)sum / 25;
            e10.setText(String.valueOf(sgpa));
        }
    }

    private int grade(int marks) {
        int c = 0;
        if (marks >= 90)
            c = 10;
        else if (marks >= 80 && marks < 90)
            c = 9;
        else if (marks >= 70 && marks < 80)
            c = 8;

        else if (marks >= 60 && marks < 70)
            c = 7;
        else if (marks >= 45 && marks < 60)
            c = 6;
        else if (marks >= 40 && marks < 45)
            c = 4;
        else
            c = 0;
        return c;
    }
}