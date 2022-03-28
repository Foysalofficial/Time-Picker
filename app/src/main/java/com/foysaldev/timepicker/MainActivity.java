package com.foysaldev.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TimePicker timePicker;
    private TextInputEditText editText;
    private MaterialButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = findViewById(R.id.TimePickerid);
        timePicker.setIs24HourView(true);
        editText = findViewById(R.id.EditTextid);
        button = findViewById(R.id.Buttonid);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String time = timePicker.getCurrentHour() +":"+ timePicker.getCurrentMinute();
                editText.setText(time);
            }
        });
    }
}