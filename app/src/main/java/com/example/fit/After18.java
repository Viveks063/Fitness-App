package com.example.fit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class After18 extends AppCompatActivity {

    int[] arr1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after18);

        Toolbar toolbar=findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        arr1=new int[]{
                R.id.f_c2, R.id.s_c2, R.id.t_c2, R.id.fo_c_c2, R.id.fi_c2, R.id.si_c2, R.id.se_c2, R.id.eig_c2, R.id.n_c2, R.id.te_c2, R.id.el_c2, R.id.tw_c2, R.id.thi_c2, R.id.four_c2,

        };
    }



    public void afterage(View view) {
        for(int i = 0; i < arr1.length; i++) {
            if(view.getId()==arr1[i]) {
                int value1=i+1;
                Log.i("first1", String.valueOf(value1));
                Intent intent=new Intent(After18.this, new2Activity.class);
                intent.putExtra("value1", String.valueOf(value1)); // Move putExtra before startActivity
                startActivity(intent);
            }
        }
    }


    }
