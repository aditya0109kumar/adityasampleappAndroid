package com.authentic.dairy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class scancode extends AppCompatActivity {

    private Button home;
    private Button setting;
    private Button wallet;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
        Intent intent = new Intent(scancode.this, Payment.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scancode);


        overridePendingTransition(0,0);
        getIntent().addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);

        home=(Button) findViewById(R.id.scnahome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomes();
            }
        });

        setting=(Button) findViewById(R.id.scansetting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettings();
            }
        });

        wallet=(Button) findViewById(R.id.scanwallet);
        wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWallets();
            }
        });
    }
    public void openHomes()
    {
        Intent intent = new Intent(this, Payment.class);
        startActivity(intent);
    }

    public void openSettings()
    {
        Intent intent = new Intent(this, settings.class);
        startActivity(intent);
    }

    public void openWallets()
    {
        Intent intent = new Intent(this, wallet.class);
        startActivity(intent);
    }
}