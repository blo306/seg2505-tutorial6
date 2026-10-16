package com.example.layouttutorial;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androix.recyclerview.widget.LinearLayoutManager;
import androix.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myButton = (Button) findViewById(R.id.button);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.layoutManager = new LinearLayoutManager(this)
        recyclerView.setAdapter(customAdapter);
    }

}