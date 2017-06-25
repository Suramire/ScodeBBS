package com.suramire.myapplication.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by Suramire on 2017/6/24.
 */

public class MyDataBase extends SQLiteOpenHelper {
    private static final String TAG = "MyDataBase";
    SQLiteDatabase mydb;
    private String tableName = Constant.TABLENAME;


    public MyDataBase(Context context) {
        super(context, Constant.DBNAME, null, 1);
        mydb = getWritableDatabase();
    }


    /**
     * 查询所有数据
     *
     * @return
     */
    public Cursor selectAll() {
        return mydb.query(tableName, null, null, null, null, null, null);
    }



    /**
     * 记录登录
     *
     * @return 插入位置
     */
    public long insert(String username) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("username",username);
        return mydb.insert(tableName, null, contentValues);
    }

    /**
     * 注销登录
     * @return
     */
    public int delete() {
        return mydb.delete(tableName, null, null);
    }


    /**
     * 关闭数据库
     */
    public void close() {
        if (mydb.isOpen())
            mydb.close();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists user(_id integer primary key autoincrement," +
                "username varchar)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}