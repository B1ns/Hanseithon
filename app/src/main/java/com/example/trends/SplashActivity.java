package com.example.trends;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        LottieAnimationView lottieAnimationView = findViewById(R.id.lottie);
        lottieAnimationView.playAnimation();

        Handler handler = new Handler();

        handler.postDelayed(()->{
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
        },3000);


    }

}
