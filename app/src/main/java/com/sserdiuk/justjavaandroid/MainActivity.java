package com.sserdiuk.justjavaandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int numberOfCoffee = 0;
    int price = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        display(numberOfCoffee);
        displayPrice(numberOfCoffee * price);
    }

    private void display(int number) {
        TextView count = findViewById(R.id.count);
        String text = "" + number;
        count.setText(text);
    }

    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        String text = NumberFormat.getCurrencyInstance().format(number);
        if (number > 0) {
            text += "\n" + "Thank You!";
        }
        priceTextView.setText(text);
    }

    private void updateUI() {
        display(numberOfCoffee);
        displayPrice(numberOfCoffee * price);
    }

    public void decreaseQuantity(View view) {
        if (0 < numberOfCoffee) {
            numberOfCoffee--;
        }
        updateUI();
    }

    public void increaseQuantity(View view) {
        numberOfCoffee++;
        updateUI();
    }
}
