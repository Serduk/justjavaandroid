package com.sserdiuk.justjavaandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        display(2 * 2);
        displayPrice(2 * 5);
    }

    private void display(int number) {
        TextView count = findViewById(R.id.count);
        String text = "" + number;
        count.setText(text);
    }

    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        String text = NumberFormat.getCurrencyInstance().format(number);
        priceTextView.setText(text);
    }
}
