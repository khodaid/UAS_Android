package com.example.keuangan;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.keuangan.Controller.Controller;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = (ImageView) findViewById(R.id.imageView4);
        ImageView iv6 = (ImageView) findViewById(R.id.imageView6);
//        Controller controller = new Controller();

        Controller.add("masuk","BCA","12-12-21",1,true);

        int size = Controller.getP().size();
        int i = 0;
//        if(Controller.getP().get(0).isStatus()){
//            iv.setImageResource(R.drawable.iconpemasukan);
//        }


        ImageButton add;

        add = (ImageButton) findViewById(R.id.imageButton);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FormPendaftaran.class));
            }
        });


//        ImageView gbrTrasak = (ImageView) findViewById(R.id.imageView4);
//        gbrTrasak.setImageDrawable();
    }


}