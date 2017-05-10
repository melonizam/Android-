package com.example.melodic.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void checkGuess(View view){

        EditText guessedNumber = (EditText) findViewById(R.id.editNumber);
        if(!(guessedNumber.getText().toString().isEmpty())){

        String guessedNumberString = guessedNumber.getText().toString();

        int guessedNumberInt = Integer.parseInt(guessedNumberString);
        String message = "";

        if (guessedNumberInt == (int)guessedNumberInt) {

            if (guessedNumberInt > randomNumber) {
                message = "High!";
            } else if (guessedNumberInt < randomNumber) {
                message = "Low";
            } else if (guessedNumberInt == randomNumber) {
                message = "Correct";
            } else {
                message = "No number was given!";
            }
            System.out.println("Random Number: " + randomNumber);
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

        } else{
            Toast.makeText(getApplicationContext(), "Not a number", Toast.LENGTH_LONG).show();
        }
        } else {
            Toast.makeText(getApplicationContext(), "You did not type!", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGenerator  = new Random();
        randomNumber = randomGenerator.nextInt(21);
    }
}
