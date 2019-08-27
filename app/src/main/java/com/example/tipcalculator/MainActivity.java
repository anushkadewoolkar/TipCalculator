package com.example.tipcalculator;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    DecimalFormat df = new DecimalFormat("$#.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
    }

    public void calculate(View v){
        DecimalFormat df = new DecimalFormat("$#.00");
        EditText bill = (EditText) findViewById(R.id.editText);
        EditText tip = (EditText) findViewById(R.id.editText2);
        EditText percent = (EditText) findViewById(R.id.editText2);
        EditText finalBill =  (EditText) findViewById(R.id.editText6);

        
        double billNumber = Double.parseDouble(bill.getText().toString().trim());
        double tipNumber = Double.parseDouble(tip.getText().toString().trim());

        double addedBill = billNumber * (tipNumber/100);
        double totalBill = addedBill + billNumber;

        finalBill.setText("Final Bill: " + df.format(totalBill));

    }

    public void good(View v)
    {
        EditText billEditText = (EditText) findViewById (R.id.editText);
        EditText percentEditText = (EditText) findViewById (R.id.editText2);
        TextView totalTextView = (TextView)findViewById (R.id.editText6);
        double bill = Double.parseDouble(billEditText.getText().toString());
        double percent = 15;
        double tip = ((percent / 100) * bill);
        double total = bill + tip;
        percentEditText.setText("" + percent);
        totalTextView.setText("\nTotal Bill: " + df.format(total));
    }

    public void okay(View v)
    {
        EditText billEditText = (EditText) findViewById (R.id.editText);
        EditText percentEditText = (EditText) findViewById (R.id.editText2);
        TextView totalTextView = (TextView)findViewById (R.id.editText6);
        double bill = Double.parseDouble(billEditText.getText().toString());
        double percent = 10;
        double tip = ((percent / 100) * bill);
        double total = bill + tip;
        percentEditText.setText("" + percent);
        totalTextView.setText("\nTotal Bill: " + df.format(total));
    }

    public void bad(View v)
    {
        EditText billEditText = (EditText) findViewById (R.id.editText);
        EditText percentEditText = (EditText) findViewById (R.id.editText2);
        TextView totalTextView = (TextView)findViewById (R.id.editText6);
        double bill = Double.parseDouble(billEditText.getText().toString());
        double percent = 5;
        double tip = ((percent / 100) * bill);
        double total = bill + tip;
        percentEditText.setText("" + percent);
        totalTextView.setText("\nTotal Bill: " + df.format(total));
    }
}
