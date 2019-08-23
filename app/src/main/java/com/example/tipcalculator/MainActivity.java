package com.example.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        double eisha = 0;

        finalBill.setText("Final Bill: " + totalBill);

    }
}
