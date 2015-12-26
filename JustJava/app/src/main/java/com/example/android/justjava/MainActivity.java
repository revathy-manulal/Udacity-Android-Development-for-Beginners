package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {


    protected void onSuspendingCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quantity=2;
    int price;
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {


        displayMessage(createOrderSummary());

    }
    private int calculatePrice()
    {
         price =quantity*5;
        return price;
    }
    private String createOrderSummary(){
       return "Name: Kaptain Kunal \nQuantity:"+quantity+"\nTotal:$"+calculatePrice()+"\nThank You!";
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int noOf) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(noOf));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    public void decrement(View view) {
        quantity=quantity-1;

        display(quantity);
        displayPrice(quantity * 5);
    }
    public void increment(View view) {
        quantity=quantity+1;
        display(quantity);
        displayPrice(quantity * 5);
    }

}