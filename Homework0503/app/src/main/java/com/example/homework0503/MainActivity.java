package com.example.homework0503;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private int count = 0;
    private ImageView image1, image2, image3, image4;

    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4;

    private int[] chkID = {R.id.checkBox, R.id.checkBox2, R.id.checkBox3, R.id.checkBox4};

    private TextView show;

    private int[] imgID={R.id.imgOutput1,R.id.imgOutput2,R.id.imgOutput3, R.id.imgOutput4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show = (TextView) findViewById(R.id.textView);
        image1 = (ImageView) findViewById(R.id.imgOutput1);
        image2 = (ImageView) findViewById(R.id.imgOutput2);
        image3 = (ImageView) findViewById(R.id.imgOutput3);
        image4 = (ImageView) findViewById(R.id.imgOutput4);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox1.setOnCheckedChangeListener(this);
        checkBox2.setOnCheckedChangeListener(this);
        checkBox3.setOnCheckedChangeListener(this);
        checkBox4.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        count = 0;
        for (int i = 0; i < chkID.length; i++){
            CheckBox chk = (CheckBox) findViewById(chkID[i]);
            ImageView imgobj = (ImageView) findViewById(imgID[i]);
            if(chk.isChecked()) {
                count++;
                imgobj.setVisibility(View.VISIBLE);
            }
            else{
                imgobj.setVisibility(View.GONE);
            }


        }
        if(count!=0){
            show.setText("您點的餐點如下:");
        }
        else{
            show.setText("請點餐");
        }
    }
}