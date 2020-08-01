package com.someshwar.fadinganimations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
int x=1;
    public void fade(View view){
        ImageView imageView=findViewById(R.id.imageView);
        ImageView imageView1=findViewById(R.id.imageView2);
        if(x%2==1) {
            imageView.animate().alpha(0).setDuration(2000);
            imageView1.animate().alpha(1).setDuration(2000);
            x++;
        }else {
            imageView.animate().alpha(1).setDuration(2000);
            imageView1.animate().alpha(0).setDuration(2000);
            x++;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}