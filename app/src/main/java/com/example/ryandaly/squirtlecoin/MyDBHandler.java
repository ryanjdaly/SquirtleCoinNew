package com.example.ryandaly.squirtlecoin;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;

public class MyDBHandler extends SQLiteOpenHelper {
    //information of database
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "userDB.db";
    public static final String TABLE_NAME = "users";
    public static final String COLUMN_ID = "userID";
    public static final String COLUMN_NAME = "StudentName";
    //initialize the database
    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {}
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {}
    public String loadHandler() {return "";}
    public void addHandler(Users user) {}
    public Users findHandler(String studentname) {return new Users();}
    public boolean deleteHandler(int ID) {return false;}
    public boolean updateHandler(int ID, String name) {return false;}
}