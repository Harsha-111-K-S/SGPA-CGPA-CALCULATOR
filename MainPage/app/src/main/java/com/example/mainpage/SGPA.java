package com.example.mainpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class SGPA extends AppCompatActivity implements View.OnClickListener{
    Button button_first;
    Button button_five;
    Button button_seventh;
    Button button2,button3,button4,button6;
    Button button_eight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_g_p);
        button_first=(Button)findViewById(R.id.button_first);
        button_first.setOnClickListener(this);
        button_seventh=(Button)findViewById(R.id.button_seventh);
        button_seventh.setOnClickListener(this);
        button_eight=(Button)findViewById(R.id.button_eight);
        button_eight.setOnClickListener(this);
        button_five=(Button)findViewById(R.id.button_five);
        button_five.setOnClickListener(this);
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button6=(Button)findViewById(R.id.button6);
        button6.setOnClickListener(this);
    }
    public void onClick(View v) {
        if(v.equals(button_first))
        {
            Intent it = new Intent(this,First.class);
            startActivity(it);
        }
        else if(v.equals(button2))
        {
            Intent it = new Intent(this,Second.class);
            startActivity(it);
        }
        else if(v.equals(button3))
        {
            Intent it = new Intent(this,Third.class);
            startActivity(it);
        }
        else if(v.equals(button4))
        {
            Intent it = new Intent(this,Fourth.class);
            startActivity(it);
        }
        else if(v.equals(button_five))
        {
            Intent it = new Intent(this,sem5.class);
            startActivity(it);
        }
        else if(v.equals(button6))
        {
            Intent it = new Intent(this,Sixth.class);
            startActivity(it);
        }
        else if(v.equals(button_seventh))
        {
            Intent it = new Intent(this, Seventh.class);
            startActivity(it);
        }
        else
        {
            Intent it;
            it = new Intent(this,Eigth.class);
            startActivity(it);
        }
    }


}