package com.example.order2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private TextView main_food, side_food, drink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        main_food = findViewById(R.id.main_food);
        side_food = findViewById(R.id.side_food);
        drink = findViewById(R.id.drink);

        // 获取传递的数据
        String selectedMain = getIntent().getStringExtra("selectedMain");
        String selectedSide = getIntent().getStringExtra("selectedSide");
        String selectedDrinks = getIntent().getStringExtra("selectedDrinks");

        // 将数据设置到相应的 TextView
        main_food.setText(selectedMain);
        side_food.setText(selectedSide);
        drink.setText(selectedDrinks);
    }
}
