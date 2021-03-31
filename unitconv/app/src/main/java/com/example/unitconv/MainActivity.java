package com.example.unitconv;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               Toast.makeText(MainActivity.this, "Chalak londaaaaaa!", Toast.LENGTH_SHORT).show();
//
//
//     }
//       });
    }
    public void message(View view)
    {
        Toast.makeText(MainActivity.this, "Chalak londaa!", Toast.LENGTH_SHORT).show();
        //this change is form occlicklistner by adding attribute of button on click and put this funtion there
    }
}