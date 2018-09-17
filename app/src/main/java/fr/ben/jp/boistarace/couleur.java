package fr.ben.jp.boistarace;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class couleur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_couleur);
    }

    /*public void rollDice(View v){
        TextView cJoueur1 = (TextView) findViewById(R.id.textCouleur1);
        cJoueur1.setText();
        TextView cJoueur2 = (TextView) findViewById(R.id.textCouleur2);
        cJoueur2.setText();
        TextView cJoueur3 = (TextView) findViewById(R.id.textCouleur3);
        cJoueur3.setText();
        TextView cJoueur4 = (TextView) findViewById(R.id.textCouleur4);
        cJoueur4.setText();
        TextView cJoueur5 = (TextView) findViewById(R.id.textCouleur5);
        cJoueur5.setText();
        TextView cJoueur6 = (TextView) findViewById(R.id.textCouleur6);
        cJoueur6.setText();
        TextView cJoueur7 = (TextView) findViewById(R.id.textCouleur7);
        cJoueur7.setText();
        TextView cJoueur8 = (TextView) findViewById(R.id.textCouleur8);
        cJoueur8.setText();
        TextView cJoueur9 = (TextView) findViewById(R.id.textCouleur9);
        cJoueur9.setText();
        TextView cJoueur10 = (TextView) findViewById(R.id.textCouleur10);
        cJoueur10.setText();
    }*/

    public void back(View v) {

        Intent intent = new Intent(couleur.this, jeu.class);
        startActivity(intent);
    }
}
