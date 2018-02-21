package com.example.blessingakpan.ak_tech;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText EditName;
    Button startTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditName = (EditText) findViewById(R.id.name);
        startTest = (Button) findViewById(R.id.startTest);
    }

    public void startTest(View view) {
        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtra("Name", EditName.getText().toString());
        startActivity(intent);
    }

}