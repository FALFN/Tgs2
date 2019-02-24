package com.example.mahasiswapc.rdm1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText t1,t2;
    private Button tambah,kurang,kali,bagi;
    private TextView angkaa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        tambah=findViewById(R.id.tambah);
        kurang=findViewById(R.id.kurang);
        kali=findViewById(R.id.kali);
        bagi=findViewById(R.id.bagi);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(MainActivity.this,TambahActivity.class);
                startActivity(move);
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(MainActivity.this,KurangActivity.class);
                startActivity(move);
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(MainActivity.this,KaliActivity.class);
                startActivity(move);
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(MainActivity.this,BagiActivity.class);
                startActivity(move);
            }
        });

    }



}
