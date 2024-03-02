package com.example.fit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Before18 extends AppCompatActivity {

    int[] arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before18);

        Toolbar toolbar=findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);

        arr=new int[]{
                R.id.f_c, R.id.s_c, R.id.t_c, R.id.fo_c, R.id.fi_c, R.id.si_c, R.id.se_c, R.id.eig_c, R.id.n_c, R.id.te_c, R.id.el_c, R.id.tw_c, R.id.thi_c, R.id.four_c,

        };
    }

    public void firstClick(View view) {
    }

    public void beforeage(View view) {
        for(int i = 0; i < arr.length; i++) {
            if(view.getId()==arr[i]) {
                int value=i+1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent=new Intent(Before18.this, new1Activity.class);
                intent.putExtra("value", String.valueOf(value)); // Move putExtra before startActivity
                startActivity(intent);
            }
        }
    }

}
