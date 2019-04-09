package com.londonappbrewery.iampoor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roleButton =  findViewById(R.id.rollButton);

       final ImageView leftDice  = findViewById(R.id.image_leftDice);
       final ImageView rightDice  = findViewById(R.id.image_rightDice);
        ImageView logo  = findViewById(R.id.image_logo);

      final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        roleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Diece", "The button has been pressed!!");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6); // 0...5
                int numberTwo = randomNumberGenerator.nextInt(6); // 0...5
                Log.d("Dicee", "The rundon number = " + number);

                leftDice.setImageResource(diceArray[number]);
                rightDice.setImageResource(diceArray[numberTwo]);

            }
        });

    }
}
