package com.example.funfact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView text;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        button = findViewById(R.id.button);
        text = findViewById(R.id.text);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newFact();
            }
        });

    }

    public void newFact(){


        String[] facts = {"im over 6ft",
                "i play basketball",
                "i own over $1000 worth of shoes",
                "i have 4 animals",
                "my favorite basketball player is Giannis Antetokoumpo",
                "my second favorite basketball player is Kevin Durant",
                "football is my second favorite sport",
                "I play nba 2k20 in my free time",
                "I will be in college in 4 years",
                "My dog is my favorite animal",
                "I love my bed"};

        random = new Random();
        int randomNumber = random.nextInt(facts.length);

        text.setText(facts[randomNumber]);


    }
}