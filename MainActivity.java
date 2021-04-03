package com.burhankolsuz.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //ilk uygulamamızın metodunu yazıyoruz butona basınca resim değişecek
    //olay butona basınca olacak oncreate yazmıyoruz
    //fonksiyon isimleri okunabilir olsun
    //onclick() yazıdğımız isim ile fonk ismi aynı olacak
    //fonksiyon içine View yazıyoruz çünkü o button nesne kullanacağız

    public void changeImage(View view){

        ImageView imageView=findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.resim1);


    }

    public void geriAl(View view){

        ImageView imageView=findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.resim);

    }
}