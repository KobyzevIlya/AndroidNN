package hse.hw1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.graphics.Color;
import android.widget.Toast;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText colorEditText = findViewById(R.id.colorEditText);
        Button goToSecondActivityButton = findViewById(R.id.goToSecondActivityButton);

        goToSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedColor = colorEditText.getText().toString();
                if (selectedColor.equalsIgnoreCase("red") || selectedColor.equalsIgnoreCase("green") || selectedColor.equalsIgnoreCase("blue")) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("selected_color", selectedColor);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Некорректный цвет. Введите 'red', 'green' или 'blue'", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
