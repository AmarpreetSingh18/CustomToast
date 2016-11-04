package com.example.customtoast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btntoast(View view) {
        Toast.makeText(getBaseContext(), "Default Toast", Toast.LENGTH_LONG).show();
    }

    public void btntoast1(View view) {
        Context context=getApplicationContext();
        LayoutInflater inflater=getLayoutInflater();
        View customToastroot =inflater.inflate(R.layout.mycuston_toast_phone, null);
        Toast customtoast=new Toast(context);
        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }
    public void btntoast2(View view) {
        Context context=getApplicationContext();
        LayoutInflater inflater=getLayoutInflater();
        View customToastroot =inflater.inflate(R.layout.mycustom_toast_coffee, null);
        Toast customtoast=new Toast(context);
        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }
    public void btntoast3(View view) {
        Context context=getApplicationContext();
        LayoutInflater inflater=getLayoutInflater();
        View customToastroot =inflater.inflate(R.layout.mycustom_toast_maps, null);
        Toast customtoast=new Toast(context);
        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }
    public void btntoast4(View view) {
        Context context=getApplicationContext();
        LayoutInflater inflater=getLayoutInflater();
        View customToastroot =inflater.inflate(R.layout.mycustom_toast, null);
        Toast customtoast=new Toast(context);
        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }
}
