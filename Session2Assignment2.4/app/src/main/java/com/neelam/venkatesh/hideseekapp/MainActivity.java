package com.neelam.venkatesh.hideseekapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button hide, show;
private ImageView ohhimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ohhimage = (ImageView)findViewById(R.id.image);
        hide = (Button)findViewById(R.id.button1);
        show = (Button)findViewById(R.id.button2);


                hide.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ohhimage.setVisibility(View.GONE);
                        hide.setVisibility(View.GONE);
                        show.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this, "The button is clicked ", Toast.LENGTH_LONG).show();
                    }
                });

                show.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                            ohhimage.setVisibility(View.VISIBLE);
                            hide.setVisibility(View.VISIBLE);
                            show.setVisibility(View.GONE);
                            Toast.makeText(MainActivity.this, "The button is clicked again", Toast.LENGTH_LONG).show();
                    }

                });





    }
}
