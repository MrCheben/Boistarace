package fr.ben.jp.boistarace;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class dice extends jeu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);
    }



    public String randomDice() {
        Random nbRandom = new Random();
        nbRandom.nextInt(6);
        return nbRandom.toString();
    }


    public void rollDice(){
        TextView showNb = (TextView) findViewById(R.id.textResult);
        showNb.setText(randomDice());
    }

    public void back (View v) {

        Intent intent=new Intent(dice.this, jeu.class);
        startActivity(intent);
    }
}