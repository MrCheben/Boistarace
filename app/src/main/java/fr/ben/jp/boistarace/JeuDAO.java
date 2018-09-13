package fr.ben.jp.boistarace;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class JeuDAO {

    private SQLiteDatabase maBase;
    private BaseSQLite maBaseSQLite;

    public JeuDAO(Context context){
        maBaseSQLite = new BaseSQLite(context, "boistarace.db", null, 1);
    }

    public void open(){
        //ouverture de la base de données en écriture
        maBase = maBaseSQLite.getWritableDatabase();
    }

    public void close(){
        maBase.close();
    }

    public void insertJoueur(Integer ID, String Prenom, Integer num_case, String Couleur){
        ContentValues v = new ContentValues();
        v.put("ID", ID);
        v.put("Prenom", Prenom);
        v.put("num_case", num_case);
        v.put("Couleur", Couleur);
        maBase.insert("joueur", null, v);
    }

    public String selectEnonce(String typeCase){
        Cursor enonceCarte = maBase.rawQuery("SELECT txt_enonce FROM enonce WHERE type = " + typeCase +";", new String[]{});
        return enonceCarte.getString(enonceCarte.getColumnIndex("type"));
    }
}
