package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private SharedPreferences myPreferenceRef;
    private SharedPreferences.Editor myPreferenceEditor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Get a reference to the shared preference
        myPreferenceRef = getSharedPreferences("MyPreferenceName", MODE_PRIVATE);
        myPreferenceEditor = myPreferenceRef.edit();

        // Display preferences
        TextView prefTextRef=new TextView(this);
        prefTextRef=(TextView)findViewById(R.id.prefText);

        EditText prefEditRef=new EditText(this);
        prefEditRef=(EditText)findViewById(R.id.settingseditview);
        prefTextRef.setText(myPreferenceRef.getString("Preference1", "No preference found."));
    }

    @Override
    protected void onStop() {
        super.onStop();

        myPreferenceEditor.putString("Preference1", "TEST2");
        myPreferenceEditor.apply();
    }
}