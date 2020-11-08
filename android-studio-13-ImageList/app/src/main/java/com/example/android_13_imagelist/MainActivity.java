package com.example.android_13_imagelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int[] imageId = {R.drawable.image1, R.drawable.image2, R.drawable.image3,
            R.drawable.image4, R.drawable.image5, R.drawable.image6,
            R.drawable.image7, R.drawable.image8, R.drawable.image9, R.drawable.image10};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText n = (EditText)findViewById(R.id.editview1);
                ImageView img = (ImageView)findViewById(R.id.image);
                int number = Integer.parseInt(n.getText().toString());
                if (number == 1){
                    img.setImageResource(imageId[0]);
                }
                else if (number == 2){
                    img.setImageResource(imageId[1]);
                }
                else if (number == 3){
                    img.setImageResource(imageId[2]);
                }
                else if (number == 4){
                    img.setImageResource(imageId[3]);
                }
                else if (number == 5){
                    img.setImageResource(imageId[4]);
                }
                else if (number == 6){
                    img.setImageResource(imageId[5]);
                }
                else if (number == 7){
                    img.setImageResource(imageId[6]);
                }
                else if (number == 8){
                    img.setImageResource(imageId[7]);
                }
                else if (number == 9){
                    img.setImageResource(imageId[8]);
                }
                else if (number == 10){
                    img.setImageResource(imageId[9]);
                }
            }
        });
    }
}