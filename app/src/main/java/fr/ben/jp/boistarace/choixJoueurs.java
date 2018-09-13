package fr.ben.jp.boistarace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class choixJoueurs extends AppCompatActivity {

    int compteur = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_joueurs);

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


        
        /*Button lancer_partie = (Button) findViewById(R.id.btnPlay);
        lancer_partie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(choixJoueurs.this, "Il reste le plus long à coder :)", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), jeu.class);
                startActivity(intent);
            }
        });*/

    }

    public void Go (View v) {
        Intent intent=new Intent(choixJoueurs.this, jeu.class);
        startActivity(intent);
    }

}