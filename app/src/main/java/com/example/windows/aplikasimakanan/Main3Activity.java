package com.example.windows.aplikasimakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    Button beli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        beli = findViewById(R.id.beli);
        beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main3Activity.this, "Sukses", Toast.LENGTH_LONG).show();
            }
        });

        Spinner spinner = (Spinner) findViewById(R.id.nama);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.nama_makanan, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        }

        public void onItemSelected(AdapterView<?> parent, View view,
                                   int pos, long id){

        }

        public void onNothingSelected(AdapterView<?> parent){

        }

        public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        }
}
