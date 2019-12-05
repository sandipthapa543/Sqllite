package com.sql.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import helper.MyHelper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etWord,etMeaning;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);

        etWord =findViewById(R.id.etWord);
        etMeaning=findViewById(R.id.etMeaning);
        btnSave=findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        MyHelper myHelper =new MyHelper(this);
       SQLiteDatabase sqLiteDatabase =myHelper.getWritableDatabase();
        Toast.makeText(this, "saved", Toast.LENGTH_SHORT).show();

    }
}
