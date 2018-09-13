package fr.ben.jp.boistarace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class choixJoueurs extends AppCompatActivity {

    private JeuDAO maBDD = null;
    int compteur = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_joueurs);

        maBDD = new JeuDAO(this);

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
        maBDD.open();

        Intent intent=new Intent(choixJoueurs.this, jeu.class);
        startActivity(intent);
    }

}