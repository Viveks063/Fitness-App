package com.example.fit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class creen extends Activity {

    TextView textView;
    Animation up;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        textView=findViewById(R.id.text);
        up= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up);
        textView.setAnimation(up);

      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
              Intent intent=new Intent(creen.this, MainActivity.class);
              startActivity(intent);

          }
      },3500);
    }


}
