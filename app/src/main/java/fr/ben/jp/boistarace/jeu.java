package fr.ben.jp.boistarace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class jeu extends AppCompatActivity {

    private JeuDAO maBDD = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeu);

        maBDD = new JeuDAO(this);
    }
}
