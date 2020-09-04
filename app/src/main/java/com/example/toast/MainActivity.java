package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button byDefault, simpleToast, nestedGravity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    byDefault = findViewById(R.id.byDefault);
    simpleToast = findViewById(R.id.simpleToast);
    nestedGravity = findViewById(R.id.nestedGravity);

    byDefault. setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "By Default", Toast.LENGTH_SHORT).show();
        }
    });

        simpleToast. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "simple Gravity Toast", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
        nestedGravity. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "Nested Gravity Toast", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM|Gravity.RIGHT,0,0);

                toast.show();

            }
        });

    }

}