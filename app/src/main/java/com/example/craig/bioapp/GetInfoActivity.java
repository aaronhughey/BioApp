package com.example.craig.bioapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GetInfoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_info);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.degree, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }

    public void onClick(View view){

        EditText etFName = (EditText) findViewById(R.id.editFName);
        EditText etLName = (EditText) findViewById(R.id.editLName);
        EditText etSchool = (EditText) findViewById(R.id.editSchool);
        EditText etGradYear = (EditText) findViewById(R.id.editGradYear);
        EditText etMajor = (EditText) findViewById(R.id.editMajor);
        EditText etHobby = (EditText) findViewById(R.id.editHobby);

        String fName = etFName.getText().toString();
        String lName = etLName.getText().toString();
        String school = etSchool.getText().toString();
        String gradYear = etGradYear.getText().toString();
        String major = etMajor.getText().toString();
        String hobby = etHobby.getText().toString();

        String message = fName + " " + lName + " is a student at " + school +
                ", planning to graduate in " + gradYear +
                " with a degree in " + major + ".  " + fName +
                " enjoys " + hobby + ".";


        Intent intent = new Intent(GetInfoActivity.this, RecieveMessageActivity.class);
        intent.putExtra("message", message);
        startActivity(intent);

    }
}
