package elapor.application.com.elapor;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import elapor.application.com.elapor.MainActivity;
import elapor.application.com.elapor.R;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(elapor.application.com.elapor.SplashActivity.this, MainActivity.class));
                finish();
            }
        }, 3000);
    }
}