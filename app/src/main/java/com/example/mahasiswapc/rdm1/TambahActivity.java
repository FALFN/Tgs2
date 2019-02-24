package com.example.mahasiswapc.rdm1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TambahActivity extends AppCompatActivity {
    private EditText t1,t2;
    private Button b1;
    private TextView angkaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jumlah);

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        b1=findViewById(R.id.b1);
        angkaa=findViewById(R.id.angka);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    String text1=t1.getText().toString();
                    String text2=t2.getText().toString();

                    double panjang = Double.parseDouble(text1);
                    double lebar = Double.parseDouble(text2);
                    double hasil = panjang+lebar;
                    String angk = String.valueOf(hasil);
                    angkaa.setText(angk);
                }
                catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field tidak boleh kosng",Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}