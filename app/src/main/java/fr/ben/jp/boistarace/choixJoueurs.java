package fr.ben.jp.boistarace;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Console;


public class choixJoueurs extends AppCompatActivity {

    private JeuDAO maBDD;
    int compteur = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_joueurs);

        maBDD = new JeuDAO(this);
        maBDD.open();
        maBDD.supprimerJoueur();


        Button ajoutJoueur = (Button) findViewById(R.id.add_player);
        ajoutJoueur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nouveau_joueur = null;
                if (compteur == 0) {
                    nouveau_joueur = (EditText) findViewById(R.id.joueur4);
                }
                else if (compteur == 1){
                    nouveau_joueur = (EditText) findViewById(R.id.joueur5);
                }
                else if (compteur == 2){
                    nouveau_joueur = (EditText) findViewById(R.id.joueur6);
                }
                else if (compteur == 3){
                    nouveau_joueur = (EditText) findViewById(R.id.joueur7);
                }
                else if (compteur == 4){
                    nouveau_joueur = (EditText) findViewById(R.id.joueur8);
                }
                else if (compteur == 5){
                    nouveau_joueur = (EditText) findViewById(R.id.joueur9);
                }
                else if (compteur == 6){
                    nouveau_joueur = (EditText) findViewById(R.id.joueur10);
                }
                else{
                    Toast.makeText(choixJoueurs.this, "Le nombre maximum de joueur a été atteint", Toast.LENGTH_SHORT).show();
                }
                if (nouveau_joueur != null){
                    nouveau_joueur.setVisibility(View.VISIBLE);
                    compteur++;
                }
            }
        });

    }

    public void Go (View v) {

        maBDD = new JeuDAO(this);
        maBDD.open();

        EditText j1 = (EditText)findViewById(R.id.joueur1);
        EditText j2 = (EditText)findViewById(R.id.joueur2);
        EditText j3 = (EditText)findViewById(R.id.joueur3);
        EditText j4 = (EditText)findViewById(R.id.joueur4);
        EditText j5 = (EditText)findViewById(R.id.joueur5);
        EditText j6 = (EditText)findViewById(R.id.joueur6);
        EditText j7 = (EditText)findViewById(R.id.joueur7);
        EditText j8 = (EditText)findViewById(R.id.joueur8);
        EditText j9 = (EditText)findViewById(R.id.joueur9);
        EditText j10 = (EditText)findViewById(R.id.joueur10);

        if (j1.getText().toString() != ""){
            maBDD.insertJoueur(1, j1.getText().toString(), 0, "Rouge");
        }
        if (j2.getText().toString() != ""){
            maBDD.insertJoueur(2, j2.getText().toString(), 0, "Bleu");
        }
        if (j3.getText().toString() != ""){
            maBDD.insertJoueur(3, j3.getText().toString(), 0, "Jaune");
        }
        if (j4.getText().toString() != ""){
            maBDD.insertJoueur(4, j4.getText().toString(), 0, "Vert");
        }
        if (j5.getText().toString() != ""){
            maBDD.insertJoueur(5, j5.getText().toString(), 0, "Rose");
        }
        if (j6.getText().toString() != ""){
            maBDD.insertJoueur(6, j6.getText().toString(), 0, "Violet");
        }
        if (j7.getText().toString() != ""){
            maBDD.insertJoueur(7, j7.getText().toString(), 0, "Orange");
        }
        if (j8.getText().toString() != ""){
            maBDD.insertJoueur(8, j8.getText().toString(), 0, "Noir");
        }
        if (j9.getText().toString() != ""){
            maBDD.insertJoueur(9, j9.getText().toString(), 0, "Blanc");
        }
        if (j10.getText().toString() != ""){
            maBDD.insertJoueur(10, j10.getText().toString(), 0, "Gris");
        }

        maBDD.close();
        Intent intent=new Intent(choixJoueurs.this, jeu.class);
        startActivity(intent);
    }
}