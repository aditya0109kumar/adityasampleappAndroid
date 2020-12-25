package com.authentic.dairy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wallet extends AppCompatActivity {

    private Button home;
    private Button setting;
    private Button scan;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
        Intent intent = new Intent(wallet.this, Payment.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);


        overridePendingTransition(0,0);
        getIntent().addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);

        home=(Button) findViewById(R.id.wallethome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomes();
            }
        });

        setting=(Button) findViewById(R.id.walletsetting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettings();
            }
        });

        scan=(Button) findViewById(R.id.walletscan);
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

    public void openSettings()
    {
        Intent intent = new Intent(this, settings.class);
        startActivity(intent);
    }

    public void openScans()
    {
        Intent intent = new Intent(this, scancode.class);
        startActivity(intent);
    }
}