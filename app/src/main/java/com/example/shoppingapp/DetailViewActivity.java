package com.example.shoppingapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailViewActivity extends AppCompatActivity {

    ImageView imgview;
    TextView titleview;
    TextView descriptionview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_view);

        int imageid = getIntent().getIntExtra("imageid", -1);
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");

        imgview = findViewById(R.id.detailedImageView);
        titleview = findViewById(R.id.detailedHeader);
        descriptionview = findViewById(R.id.detailedDesc);

        imgview.setImageResource(imageid);
        titleview.setText(title);
        descriptionview.setText(description);


    }
}