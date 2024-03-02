package com.example.fit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      Toolbar toolbar=findViewById(R.id.toolbar);
      setActionBar(toolbar);

        button1=findViewById(R.id.before18);
        button2=findViewById(R.id.after18);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Before18.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,After18.class);
                startActivity(intent);
            }
        });

    }

    private void setActionBar(Toolbar toolbar) {
    }


    public void beforeage(View view) {
        Intent intent=new Intent(MainActivity.this,Before18.class);
        startActivity(intent);

    }

    public void afterage(View view) {
        Intent intent=new Intent(MainActivity.this,After18.class);
        startActivity(intent);
    }

    public void article(View view) {
        Intent intent=new Intent(MainActivity.this,tips.class);
        startActivity(intent);
    }
}