package hse.hw1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.core.content.ContextCompat;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        View colorFrameLayout = findViewById(R.id.colorFrameLayout);
        String selectedColor = getIntent().getStringExtra("selected_color");

        if (selectedColor != null) {
            switch (selectedColor) {
                case "red":
                    colorFrameLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
                    break;
                case "green":
                    colorFrameLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
                    break;
                case "blue":
                    colorFrameLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.blueColor));
                    break;
            }
        }
    }
}