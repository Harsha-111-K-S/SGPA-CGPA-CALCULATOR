package com.example.mainpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
public class Eigth extends AppCompatActivity implements  View.OnClickListener{
    EditText editTextNumberSigned2, editTextNumberSigned,editTextNumberSigned3,editTextNumberSigned4,editTextNumberSigned5,editTextNumberDecimal;
    Button button,button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eigth);
        editTextNumberSigned = (EditText) findViewById(R.id.editTextNumberSigned);
        editTextNumberSigned.setText("");
        editTextNumberSigned2 = (EditText) findViewById(R.id.editTextNumberSigned2);
        editTextNumberSigned2.setText("");
        editTextNumberSigned3 = (EditText) findViewById(R.id.editTextNumberSigned3);
        editTextNumberSigned3.setText("");
        editTextNumberSigned4 = (EditText) findViewById(R.id.editTextNumberSigned4);
        editTextNumberSigned4.setText("");
        editTextNumberSigned5 = (EditText) findViewById(R.id.editTextNumberSigned5);
        editTextNumberSigned5.setText("");


        editTextNumberDecimal = (EditText) findViewById(R.id.editTextNumberDecimal);
        editTextNumberDecimal.setText("");
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v.equals(button5)) {
            editTextNumberSigned.setText("");
            editTextNumberSigned2.setText("");
            editTextNumberSigned3.setText("");
            editTextNumberSigned4.setText("");
            editTextNumberSigned5.setText("");
            editTextNumberDecimal.setText("");

        }
        if (v.equals(button)) {
            int sub1 = Integer.parseInt(String.valueOf(editTextNumberSigned.getText()));
            int sub2 = Integer.parseInt(String.valueOf(editTextNumberSigned2.getText()));
            int sub3 = Integer.parseInt(String.valueOf(editTextNumberSigned3.getText()));
            int sub4 = Integer.parseInt(String.valueOf(editTextNumberSigned4.getText()));
            int sub5 = Integer.parseInt(String.valueOf(editTextNumberSigned5.getText()));

            int c1 = grade(sub1);
            int c2 = grade(sub2);
            int c3 = grade(sub3);
            int c4 = grade(sub4);
            int c5 = grade(sub5);

            int sum = ((c1 * 3) + (c2 * 3) + (c3 * 8) + (c4 * 1) + (c5 * 3) );
            float sgpa;
            sgpa = (float)sum / 18;
            editTextNumberDecimal.setText(String.valueOf(sgpa));
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