package com.example.mainpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button btn_cgpa,btn_sgpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_cgpa=(Button)findViewById(R.id.btn_cgpa);
        btn_cgpa.setOnClickListener(this);
        btn_sgpa=(Button)findViewById(R.id.btn_sgpa);
        btn_sgpa.setOnClickListener(this);
    }
    public void onClick(View v)
        {
            if(v.equals(btn_cgpa))
        {
        Intent it=new Intent(this,CGPA.class);

        startActivity(it);
        }


            else
            {
                Intent it=new Intent(this,SGPA.class);

                startActivity(it);
            }

        }
}