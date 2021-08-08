package com.example.mainpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class CGPA extends AppCompatActivity implements View.OnClickListener{
    EditText et1,et2,et3,et4,et5,et6,et7,et8,et9,et10;
    Button btn_cal,btn_clear;
    int count;
    float cgpa= (float) 0.0,sum= (float) 0.0,percentage= (float) 0.0;
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_g_p);
        et1 = (EditText)findViewById(R.id.et1);
        et1.setText("0.0");
        et2 = (EditText)findViewById(R.id.et2);
        et2.setText("0.0");
        et3 = (EditText)findViewById(R.id.et3);
        et3.setText("0.0");
        et4 = (EditText)findViewById(R.id.et4);
        et4.setText("0.0");
        et5 = (EditText)findViewById(R.id.et5);
        et5.setText("0.0");
        et6 = (EditText)findViewById(R.id.et6);
        et6.setText("0.0");
        et7 = (EditText)findViewById(R.id.et7);
        et7.setText("0.0");
        et8 = (EditText)findViewById(R.id.et8);
        et8.setText("0.0");
        et9 = (EditText)findViewById(R.id.et9);
        et9.setText("0.0");
        et10 = (EditText)findViewById(R.id.et10);
        et10.setText("0.0");
        btn_cal = (Button)findViewById(R.id.btn_cal);
        btn_cal.setOnClickListener(this);
        btn_clear = (Button)findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(this);


    }
    public void onClick(View v)
    {
    //CLEAR THE DISPLAY WHEN CLEAR BUTTON IS PRESSED
        if(v.equals(btn_clear)) {
        et1.setText("0.0");
        et2.setText("0.0");
        et3.setText("0.0");
        et4.setText("0.0");
        et5.setText("0.0");
        et6.setText("0.0");
        et7.setText("0.0");
        et8.setText("0.0");
        et9.setText("0.0");
        et10.setText("0.0");
    }
        /*if(v.equals(btn_back))
        {
            Intent it=new Intent(this,MainActivity.class);
            it.putExtra("mode",1);
            startActivity(it);

        }*/
        if(v.equals(btn_cal))
    {

        float sem1 = Float.parseFloat(String.valueOf(et1.getText()));
        float sem2 = Float.parseFloat(String.valueOf(et2.getText()));
        float sem3 = Float.parseFloat(String.valueOf(et3.getText()));
        float sem4 = Float.parseFloat(String.valueOf(et4.getText()));
        float sem5 = Float.parseFloat(String.valueOf(et5.getText()));
        float sem6 = Float.parseFloat(String.valueOf(et6.getText()));
        float sem7 = Float.parseFloat(String.valueOf(et7.getText()));
        float sem8 = Float.parseFloat(String.valueOf(et8.getText()));
        NotNull(sem1);
        NotNull(sem2);
        NotNull(sem3);
        NotNull(sem4);
        NotNull(sem5);
        NotNull(sem6);
        NotNull(sem7);
        NotNull(sem8);
        sum =(sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8);
        cgpa = sum/count;
        percentage = (float) ((cgpa-0.75)*10);
        et9.setText(String.valueOf(df2.format(cgpa)));
        et10.setText(String.valueOf(df2.format(percentage)));
        sum = (float)0.0;
        cgpa = (float)0.0;
        percentage=(float)0.0;
        count = 0;

    }


}

    private void NotNull(float sgpa) {
        if(sgpa!=0.0)
        {
            count=count+1;
        }
    }
}