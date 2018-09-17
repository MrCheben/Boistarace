package fr.ben.jp.boistarace;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class jeu extends AppCompatActivity {

    private JeuDAO maBDD = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeu);

        maBDD = new JeuDAO(this);
    }

    public void rDice(View v) {

        Intent intent = new Intent(jeu.this, dice.class);
        startActivity(intent);
    }

    public void jCouleur(View v) {

        Intent intent = new Intent(jeu.this, couleur.class);
        startActivity(intent);
    }
}

