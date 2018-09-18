package fr.ben.jp.boistarace;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class JeuDAO {

    private SQLiteDatabase maBase;
    private BaseSQLite maBaseSQLite;

    public JeuDAO(Context context){
        maBaseSQLite = new BaseSQLite(context, "boistarace.db", null, 3);
    }

    public void open(){
        maBase = maBaseSQLite.getWritableDatabase();
    }

    public void close(){
        maBase.close();
    }

    public void insertJoueur(int id, String name, int num_case, String couleur){
        ContentValues v = new ContentValues();
        v.put("id", id);
        v.put("name", name);
        v.put("num_case", num_case);
        v.put("couleur", couleur);
        maBase.insert("joueur", null, v);
        Log.i("DATABASE", "insertJoueur invoked");
    }

    public void supprimerJoueur(){
        maBase.execSQL("DELETE FROM joueur");
    }

    public String selectEnonce(String typeCase){
        Cursor enonceCarte = maBase.rawQuery("SELECT txt_enonce FROM enonce WHERE type = " + typeCase +";", new String[]{});
        return enonceCarte.getString(enonceCarte.getColumnIndex("type"));
    }
}
