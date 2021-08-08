package com.example.mainpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class Third extends AppCompatActivity  implements View.OnClickListener{
    EditText et1,et2,et3,et4,et5,et6,et7,et8,et9,etResult;
    Button btnSubmit,btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
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
        et9 = (EditText) findViewById(R.id.et9);
        et9.setText("");
        etResult = (EditText) findViewById(R.id.etResult);
        etResult.setText("");
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        if(v.equals(btnClear)){
            et1.setText("");
            et2.setText("");
            et3.setText("");
            et4.setText("");
            et5.setText("");
            et6.setText("");
            et7.setText("");
            et8.setText("");
            et9.setText("");
            etResult.setText("");
        }

        if(v.equals(btnSubmit))
        {
            int sub1 = Integer.parseInt(String.valueOf(et1.getText()));
            int sub2 = Integer.parseInt(String.valueOf(et2.getText()));
            int sub3 = Integer.parseInt(String.valueOf(et3.getText()));
            int sub4 = Integer.parseInt(String.valueOf(et4.getText()));
            int sub5 = Integer.parseInt(String.valueOf(et5.getText()));
            int sub6 = Integer.parseInt(String.valueOf(et6.getText()));
            int sub7 = Integer.parseInt(String.valueOf(et7.getText()));
            int lab1 = Integer.parseInt(String.valueOf(et8.getText()));
            int lab2 = Integer.parseInt(String.valueOf(et9.getText()));
            int c1 = GradePoints(sub1);
            int c2 = GradePoints(sub2);
            int c3 = GradePoints(sub3);
            int c4 = GradePoints(sub4);
            int c5 = GradePoints(sub5);
            int c6 = GradePoints(sub6);
            int c7 = GradePoints(sub7);
            int c8 = GradePoints(lab1);
            int c9 = GradePoints(lab2);

            int sum = ((c1*3)+(c2*4)+(c3*3)+(c4*3)+(c5*3)+(c6*3)+(c7*1)+(c8*2)+(c9*2));
            float sgpa = (float)sum/24;
            etResult.setText(String.valueOf(sgpa));
        }
    }

    private int GradePoints(int marks)
    {
        int c=0;
        if(marks>=90)
            c=10;
        else if(marks<90 && marks>=80)
            c=9;
        else if(marks<80 && marks>=70)
            c=8;
        else if(marks<70 && marks>=60)
            c=7;
        else if(marks<60 && marks>=45)
            c=6;
        else if(marks<45 && marks>=40)
            c=4;
        else if(marks<40)
            c=0;

        return c;
    }
}