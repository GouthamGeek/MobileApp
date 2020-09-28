package com.mycompany.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext() ;
        CharSequence message = "Life Cycle Methods Demostration";
        int live = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message , live );
        toast.show();

    }

}