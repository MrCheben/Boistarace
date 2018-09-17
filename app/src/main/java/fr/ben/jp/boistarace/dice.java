package fr.ben.jp.boistarace;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        int nb = nbRandom.nextInt(6)+1;
        return Integer.toString(nb);
    }

    public void rollDice(View v){
        TextView showNb = findViewById(R.id.textResult);
        showNb.setText(randomDice());
    }

    public void rollAllDice(View v){
        TextView showNb1 = findViewById(R.id.textJoueur1);
        showNb1.setText(randomDice());
        TextView showNb2 = findViewById(R.id.textJoueur2);
        showNb2.setText(randomDice());
        TextView showNb3 = findViewById(R.id.textJoueur3);
        showNb3.setText(randomDice());
        TextView showNb4 = findViewById(R.id.textJoueur4);
        showNb4.setText(randomDice());
        TextView showNb5 = findViewById(R.id.textJoueur5);
        showNb5.setText(randomDice());
        TextView showNb6 = findViewById(R.id.textJoueur6);
        showNb6.setText(randomDice());
        TextView showNb7 = findViewById(R.id.textJoueur7);
        showNb7.setText(randomDice());
        TextView showNb8 = findViewById(R.id.textJoueur8);
        showNb8.setText(randomDice());
        TextView showNb9 = findViewById(R.id.textJoueur9);
        showNb9.setText(randomDice());
        TextView showNb10 = findViewById(R.id.textJoueur10);
        showNb10.setText(randomDice());
    }

    public void back (View v){

        Intent intent=new Intent(dice.this, jeu.class);
        startActivity(intent);
    }
}