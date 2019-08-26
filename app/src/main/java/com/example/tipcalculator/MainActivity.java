package com.example.tipcalculator;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    DecimalFormat df = new DecimalFormat("$#.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ConstraintLayout constraintLayout = findViewById(R.id.layout);
//        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
//        animationDrawable.setEnterFadeDuration(2000);
//        animationDrawable.setExitFadeDuration(4000);
//        animationDrawable.start();
    }

    public void calculate(View v){
        EditText bill = (EditText) findViewById(R.id.editText);
        EditText tip = (EditText) findViewById(R.id.editText2);
        EditText percent = (EditText) findViewById(R.id.editText2);
        EditText finalBill =  (EditText) findViewById(R.id.editText6);

        
        double billNumber = Double.parseDouble(bill.getText().toString().trim());
        double tipNumber = Double.parseDouble(tip.getText().toString().trim());

        double addedBill = billNumber * (tipNumber/100);
        double totalBill = addedBill + billNumber;

        finalBill.setText("Final Bill: " + totalBill);

    }
}
