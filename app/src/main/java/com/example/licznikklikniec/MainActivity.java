package com.example.licznikklikniec;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvCounter;
    int counter = 0;

    View.OnClickListener counterListener = v -> {
        if (v.getId() == R.id.btnPlus) {
            counter++;
        } else if (v.getId() == R.id.btnMinus) {
            if (counter > 0) {
                counter--;
            } else {
                Toast.makeText(this, R.string.error_negative, Toast.LENGTH_SHORT).show();
            }
        }

        tvCounter.setText(String.valueOf(counter));
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCounter = findViewById(R.id.tvCounter);

        findViewById(R.id.btnPlus).setOnClickListener(counterListener);
        findViewById(R.id.btnMinus).setOnClickListener(counterListener);

        findViewById(R.id.btnReset).setOnClickListener(v -> {
            counter = 0;
            tvCounter.setText(String.valueOf(counter));
        });
    }
}