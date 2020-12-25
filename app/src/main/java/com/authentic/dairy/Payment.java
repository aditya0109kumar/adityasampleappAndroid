package com.authentic.dairy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Payment extends AppCompatActivity {


    private Button wallet;
    private Button setting;
    private Button scan;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finishAffinity();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);


        overridePendingTransition(0,0);
        getIntent().addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);

        if (getIntent().getBooleanExtra("EXIT", false))
        {
            finish();
        }


        wallet=(Button) findViewById(R.id.notusedw);
        wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWallets();
            }
        });

        setting=(Button) findViewById(R.id.notuseds);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettings();
            }
        });

        scan=(Button) findViewById(R.id.notusedc);
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openScans();
            }
        });

    }

    public void openWallets()
    {
        Intent intent = new Intent(this, wallet.class);
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