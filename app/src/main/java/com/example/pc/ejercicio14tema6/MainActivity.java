package com.example.pc.ejercicio14tema6;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    CheckBox box1, box2, box3;
    SharedPreferences prefs;
    Boolean boo;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        box1 = findViewById(R.id.checkBox);
        box2 = findViewById(R.id.checkBox2);
        box3 = findViewById(R.id.checkBox3);
        prefs = getSharedPreferences("ficheroconfiguracion", Context.MODE_PRIVATE);
        Boolean checkbox1 = prefs.getBoolean("checkbox1", true);
        Boolean checkbox2 = prefs.getBoolean("checkbox2", false);
        Boolean checkbox3 = prefs.getBoolean("checkbox3", false);
        box1.setChecked(checkbox1);
        box2.setChecked(checkbox2);
        box3.setChecked(checkbox3);
    }
    public void click1(View view)
    {
        editor = prefs.edit();
        editor.putBoolean("checkbox1", box1.isChecked());
        editor.commit();
    }
    public void click2(View view)
    {
        editor = prefs.edit();
        editor.putBoolean("checkbox2", box2.isChecked());
        editor.commit();
    }
    public void click3(View view)
    {
        editor = prefs.edit();
        editor.putBoolean("checkbox3", box3.isChecked());
        editor.commit();
    }
}
