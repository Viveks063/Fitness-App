package com.example.fit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class new2Activity extends AppCompatActivity {
    String buttonVal;
    Button startBut;
    private CountDownTimer countDownTimer;
    TextView textV;
    private boolean runningT;
    private long leftT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after18);

        Intent intent = getIntent();
        buttonVal = intent.getStringExtra("value1");

        if (buttonVal != null && !buttonVal.isEmpty()) {
            try {
                int intVal = Integer.parseInt(buttonVal);

                switch (intVal) {
                    case 1:
                        setContentView(R.layout.one2);
                        break;
                    case 2:
                        setContentView(R.layout.one3);
                        break;
                    case 3:
                        setContentView(R.layout.one4);
                        break;
                    case 4:
                        setContentView(R.layout.one5);
                        break;
                    case 5:
                        setContentView(R.layout.one6);
                        break;
                    case 6:
                        setContentView(R.layout.one7);
                        break;
                    case 7:
                        setContentView(R.layout.one8);
                        break;
                    case 8:
                        setContentView(R.layout.one9);
                        break;
                    case 9:
                        setContentView(R.layout.one10);
                        break;
                    case 10:
                        setContentView(R.layout.one11);
                        break;
                    case 11:
                        setContentView(R.layout.one12);
                        break;
                    case 12:
                        setContentView(R.layout.one13);
                        break;
                    case 13:
                        setContentView(R.layout.one14);
                        break;
                    case 14:
                        setContentView(R.layout.one15);
                        break;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                // Handle the NumberFormatException appropriately.
            }
        } else {
            // Handle the case where buttonVal is null or empty.
        }

        startBut = findViewById(R.id.start2);
        textV = findViewById(R.id.timen);

        startBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (runningT) {
                    stopTimer();
                } else {
                    startTimer();
                }
            }
        });
    }

    private void stopTimer() {
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        runningT = false;
        startBut.setText("START");
    }

    private void startTimer() {
        final CharSequence valuen = textV.getText();
        if (valuen != null && valuen.length() >= 5) {
            String num1 = valuen.toString();
            String numm = num1.substring(0, 2);
            String nums = num1.substring(3, 5);

            try {
                int numr = Integer.parseInt(numm) * 60 + Integer.parseInt(nums);
                leftT = numr * 1000;

                countDownTimer = new CountDownTimer(leftT, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        leftT = millisUntilFinished;
                        updateT();
                    }

                    @Override
                    public void onFinish() {
                        // Your onFinish() logic
                    }
                }.start();
                startBut.setText("PAUSE");
                runningT = true;
            } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
                e.printStackTrace();
                // Handle the exception appropriately.
            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void updateT() {
        int mint = (int) leftT / 60000;
        int sect = (int) leftT % 60000 / 1000;

        String timelft = "";
        if (mint < 10) {
            timelft += "0";
        }
        timelft += mint + ":";
        if (sect < 10) {
            timelft += "0";
        }
        timelft += sect;
        textV.setText(timelft);
    }
}
