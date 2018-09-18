package fr.ben.jp.boistarace;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class BaseSQLite extends SQLiteOpenHelper{
    public BaseSQLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //création table joueur
        db.execSQL("CREATE TABLE joueur (" +
                "id INTEGER NOT NULL," +
                "name VARCHAR(100) NOT NULL," +
                "num_case INTEGER NOT NULL," +
                "couleur VARCHAR(10) NOT NULL," +
                "CONSTRAINT pk_joueur PRIMARY KEY (id)" +
                ");");

        //création table énoncé
        db.execSQL("CREATE TABLE enonce (" +
                "id INTEGER NOT NULL," +
                "txt_enonce VARCHAR(250) NOT NULL," +
                "type VARCHAR(10) NOT NULL," +
                "CONSTRAINT pk_enonce PRIMARY KEY (id)" +
                ");");
        Log.i("DATABASE", "onCreate invoked");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS joueur");
        db.execSQL("DROP TABLE IF EXISTS enonce");
        onCreate(db);
        Log.i("DATABASE", "onUpgrade invoked");
    }
}