package com.example.a2laboratorinis;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import utils.TextCounter;

public class MainActivity extends AppCompatActivity {

    private Spinner spMain;
    private EditText edPhrase;
    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edPhrase = findViewById(R.id.edPhrase);
        this.tvMain = findViewById(R.id.tvMain);
        this.spMain = findViewById(R.id.spMain);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.count_options_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spMain.setAdapter(adapter);
    }

    public void onBtnClick(View view) {
        if(this.spMain.getSelectedItem().toString().equals(getResources().getString(R.string.chars_selection))) {
            this.tvMain.setText(TextCounter.getCharsCount(this.edPhrase.getText().toString()));
        }
        else {
            this.tvMain.setText(TextCounter.countWordsUsingSplit(this.edPhrase.getText().toString()));
        }
    }
}