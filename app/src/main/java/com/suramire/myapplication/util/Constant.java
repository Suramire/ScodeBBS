package com.suramire.myapplication.util;

import android.os.Environment;

import com.xmut.sc.entity.Note;
import com.xmut.sc.entity.User;

import java.util.List;

/**
 * Created by Suramire on 2017/6/21.
 * 存放常量
 */

public class Constant {
    /*常量区*/
    public final static int SHOWJSONARRAY = 0x234;
    public final static int SHOWIMAGE = 0x235;
    public final static int SHOWRESULT = 0x236;
    public final static int SHOWNOTHING = 0x237;
    public final static int GETLIST = 0x238;
//    public final static String BASEURL = "http://10.0.2.2:8080/";
    public final static String BASEURL = "http://192.168.1.102:8080/";
    public final static String URL0 = BASEURL+"bbs/Login";
    public final static String URLINDEX = BASEURL+"bbs/GetResult";
    public final static String URLGUESS = BASEURL+"bbs/Guess";
    public final static String URLRECEIVE = BASEURL+"bbs/ReceiveSomething";
    public final static String SDCARDDIR =  Environment.getExternalStorageDirectory()+"";
    public final static String PICTUREPATH = SDCARDDIR + "/bbs_head/";
    public final  static  String DBNAME = "localuser.db";//本地数据库名
    public final  static  String TABLENAME = "user";//本地数据表名

    /*全局变量区*/
    public static boolean isLogin = false;
    public static String userName = "";
    public static User user;//当前登录的用户
    public static Note note;//当前查看的帖子
    public static int indexCount;//首页已加载帖子数量
    public static List<Note> notes;//已缓冲的List<Note>
    public static boolean isDestory;//首页是否被销毁过
}
