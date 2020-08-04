package com.example.thecakebake;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.cake_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnuSplash:
                Toast.makeText(this, "Splash Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnuLogin:
                Intent intentLogin = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(intentLogin);
                Toast.makeText(this, "Login Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnuSignUp:
                Intent intentSignUp  =new Intent(SplashActivity.this,SignUpActivity.class);
                startActivity(intentSignUp);
                Toast.makeText(this, "Sign Up Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnuAboutUs:
                Intent intentAbout = new Intent(SplashActivity.this,AboutUsActivity.class);
                startActivity(intentAbout);
                Toast.makeText(this, "Contact Us Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnuContactUs:
                Intent intentContact = new Intent(SplashActivity.this,ContactUsActivity.class);
                startActivity(intentContact);
                Toast.makeText(this, "About Us Clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}