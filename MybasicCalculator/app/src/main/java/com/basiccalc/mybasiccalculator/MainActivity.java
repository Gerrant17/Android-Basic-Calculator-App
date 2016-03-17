package com.basiccalc.mybasiccalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnAdd, btnsub, btndivide, btnmul;
    private TextView tvResult;
    private EditText etFirst, etSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnsub = (Button)findViewById(R.id.btnSubtract);
        btndivide = (Button)findViewById(R.id.btnDivide);
        btnmul = (Button)findViewById(R.id.btnMultiply);
        etFirst = (EditText)findViewById(R.id.etFirstNumber);
        etSecond = (EditText)findViewById(R.id.etSecondNumber);
        tvResult = (TextView)findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnmul.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String num1 = etFirst.getText().toString();
        String num2 = etSecond.getText().toString();
        switch(view.getId()){
            case R.id.btnAdd:
                try{
                    int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                    tvResult.setText(String.valueOf(addition));
                }catch(Exception e){
                    tvResult.setText("Cannot ADD!");
                }
                break;
            case R.id.btnSubtract:
                try{
                    int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                    tvResult.setText(String.valueOf(subtraction));
                }catch(Exception e){
                    tvResult.setText("Cannot SUBTRACT!");
                }
                break;
            case R.id.btnDivide:
                try{
                    int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                    tvResult.setText(String.valueOf(division));
                }catch(Exception e){
                    tvResult.setText("Cannot DIVIDE!");
                }
                break;
            case R.id.btnMultiply:
                try{
                int multiply = Integer.parseInt(num1) * Integer.parseInt(num2);
                tvResult.setText(String.valueOf(multiply));
                }catch(Exception e){
                    tvResult.setText("Cannot MULTIPLY!");
                }
                break;
        }
    }
}
