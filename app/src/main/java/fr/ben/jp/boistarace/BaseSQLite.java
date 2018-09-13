package fr.ben.jp.boistarace;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class BaseSQLite extends SQLiteOpenHelper{
    public BaseSQLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        //création table joueur
        db.execSQL("CREATE TABLE joueur (" +
                "ID INTEGER NOT NULL," +
                "Prenom varchar(50) NOT NULL," +
                "num_case INTEGER," +
                "Couleur varchar(20) NOT NULL," +
                "CONSTRAINT pk_joueur PRIMARY KEY (ID)" +
                ");");

        //création table enoncé
        db.execSQL("CREATE TABLE enonce (" +
                "ID INTEGER NOT NULL," +
                "txt_enonce varchar(250) NOT NULL," +
                "type varchar(10) NOT NULL," +
                "CONSTRAINT pk_enonce PRIMARY KEY (ID)" +
                ");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS joueur;");
        db.execSQL("DROP TABLE IF EXISTS enonce;");
        onCreate(db);
    }
}
