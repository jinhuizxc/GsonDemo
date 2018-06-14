package com.example.jh.gsondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Gson gson = new Gson();
//        User user = new User();
//        user.setUserId(1);
//        user.setNickname("小书童");
//        String jsonData = gson.toJson(user);
//        System.out.println(String.format("jsonData:%s",jsonData));
//        User newUser = gson.fromJson(jsonData,User.class);
//        System.out.println(newUser);


//        Gson gson = new Gson();
//        ResMsg<User> resMsg = new ResMsg<>();
//        User user = new User();
//        user.setUserId(1);
//        user.setNickname("小书童");
//        resMsg.setData(user);
//        String jsonData = gson.toJson(resMsg);
//        System.out.println(String.format("jsonData:%s", jsonData));
//        ResMsg<User> newResMsg = gson.fromJson(jsonData, ResMsg.class);
//        User newUser = newResMsg.getData();
//        System.out.println(newUser);
        // Caused by: java.lang.ClassCastException: com.google.gson.internal.LinkedTreeMap cannot be cast to com.example.jh.gsondemo.User


        Gson gson = new Gson();
        ResMsg<User> resMsg = new ResMsg<>();
        User user = new User();
        user.setUserId(1);
        user.setNickname("小书童");
        resMsg.setData(user);
        String jsonData = gson.toJson(resMsg);
        System.out.println(String.format("jsonData:%s", jsonData));

        Type type = new TypeToken<ResMsg<User>>(){}.getType();
        ResMsg<User> newResMsg = gson.fromJson(jsonData,type);
        User newUser = newResMsg.getData();
        Toast.makeText(this, "newUser = " + newUser, Toast.LENGTH_SHORT).show();


        // I/System.out: 1.528887798916E12
        // I/System.out: 1528887798916
        System.out.println((double)System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());

        long time = System.currentTimeMillis();
        TimeUtil.formatData(TimeUtil.dateFormatYMD, Long.parseLong(String.valueOf(time)));

        long s = Math.round((double)System.currentTimeMillis());
        String str = TimeUtil.formatData(TimeUtil.dateFormatYMD, Long.parseLong(s + ""));
        Toast.makeText(this, "str = " + str, Toast.LENGTH_SHORT).show();


        // Java中Double和Long互相转换——https://blog.csdn.net/wuyou1336/article/details/53675633
        double d = 1.528887798916E12;
        long l = Math.round(d);
        System.out.println(l);  // 1528887798916

        long ll = 100L;
        double dd = (double) ll;
        System.out.println(dd);  // 100.0




    }
}
