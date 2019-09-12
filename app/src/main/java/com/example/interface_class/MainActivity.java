package com.example.interface_class;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    public int answer = 5;  /// global variable




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("hello","this is git");
        Log.i("hello","this is git");

        Log.i("hello","this is github");

        Log.i("hello","this is github1");
        String s1=new implement_in_class().provideName();
        ///interface_declare obj=new interface_declare();
        final implement_in_class boxer = new implement_in_class();
        ///Toast.makeText(MainActivity.this, boxer.provideName(), Toast.LENGTH_LONG).show();

        final int myNumber = 7;
//        myNumber=5;  CANNOT BE CHANGED

        btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///Toast.makeText(MainActivity.this, answer+" " ,Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, boxer.provideName()+" in onClick" , Toast.LENGTH_LONG).show();

            }
        });


    }

    private void updateStatus(String message) {
        Runnable doUpdateStatus = new Runnable() {
            public void run() {
                /* do something with message */
            }
        };
        /* do something with doUpdateStatus, like SwingUtilities.invokeLater() */

    }
}