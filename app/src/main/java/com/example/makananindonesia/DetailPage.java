package com.example.makananindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailPage extends AppCompatActivity {

    TextView tvTitle, tvDetail;
    ImageView imgFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);

        Food food = getIntent().getParcelableExtra("data");
        if (food != null) {
            imgFood = findViewById(R.id.img_item_photo);
            imgFood.setImageResource(food.getPhoto());
            tvTitle = findViewById(R.id.tv_item_name);
            tvTitle.setText(food.getName());
            tvDetail = findViewById(R.id.tv_item_detail);
            tvDetail.setText(food.getDetail());
        }

    }
}



