package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private SharedPreferences preferenceRef;
    private SharedPreferences.Editor preferenceEditor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Get a reference to the shared preference
        preferenceRef = getSharedPreferences("Preferences", MODE_PRIVATE);
        preferenceEditor = preferenceRef.edit();

        // Display preferences
        TextView prefTextRef=new TextView(this);
        prefTextRef=(TextView)findViewById(R.id.prefText);
    }

    @Override
    protected void onStop() {
        super.onStop();

        EditText prefEditRef=new EditText(this);
        prefEditRef=(EditText)findViewById(R.id.settingseditview);

        preferenceEditor.putString("Preference1", String.valueOf(prefEditRef.getText()));
        preferenceEditor.apply();
    }
}