package com.example.echoapp.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {


    public DBHelper(@Nullable Context context) {
        super(context, "echo.db", null, 1);
    }

    // onCreate viene chiamato la prima volta che si accede al DB
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE Users (" +
                "ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "Nome TEXT, Cognome TEXT, " +
                "Immobili INTEGER, Utenze INTEGER, Auto INTEGER, " +
                "Email TEXT, Password TEXT)");
    }

    // onUpgrade viene chiamato se cambia la versione del DB
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS Users");
    }

    public Boolean add(int ID, String Nome, String Cognome, int Immobili, int Utenze, int Auto, String Email, String Password) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Nome", Nome);
        contentValues.put("Cognome", Cognome);
        contentValues.put("Immobili", Immobili);
        contentValues.put("Utenze", Utenze);
        contentValues.put("Auto", Auto);
        contentValues.put("Email", Email);
        contentValues.put("Password", Password);

        long result = db.insert("Users", null, contentValues);
        if(result == -1) {
            return false;
        }
        else return true;
    }

    public Boolean checkEmail(String Email) {

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM Users WHERE Email = ?", new String[] {Email});
        if(cursor.getCount() > 0) {
            return true;
        }
        else return false;
    }

    public Boolean checkEmailAndPassword(String Email, String Password) {

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM Users WHERE Email = ? AND Password = ?", new String[] {Email, Password});
        if(cursor.getCount() > 0) {
            return true;
        }
        else return false;
    }

}
