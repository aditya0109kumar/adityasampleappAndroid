package com.authentic.dairy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class settings extends AppCompatActivity {

    private Button home;
    private Button wallet;
    private Button scan;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
        Intent intent = new Intent(settings.this, Payment.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        overridePendingTransition(0,0);
        getIntent().addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);

        home=(Button) findViewById(R.id.settinghome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomes();
            }
        });

        wallet=(Button) findViewById(R.id.settingwallet);
        wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWallets();
            }
        });

        scan=(Button) findViewById(R.id.settingscan);
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openScans();
            }
        });
    }

    public void openHomes()
    {
        Intent intent = new Intent(this, Payment.class);
        startActivity(intent);
    }


    public void openWallets()
    {
        Intent intent = new Intent(this, wallet.class);
        startActivity(intent);
    }

    public void openScans()
    {
        Intent intent = new Intent(this, scancode.class);
        startActivity(intent);
    }
}