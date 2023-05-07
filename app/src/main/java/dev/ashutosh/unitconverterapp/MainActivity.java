package dev.ashutosh.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputValue;
    Button convertBtn;

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputValue = findViewById(R.id.inputValue);
        convertBtn = findViewById(R.id.convertBtn);
        result = findViewById(R.id.resultValue);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kiloValue = Double.parseDouble(inputValue.getText().toString());
                double poundValue = convertKilosToPounds(kiloValue);

                result.setText(""+poundValue);
            }
        });
    }

    private double convertKilosToPounds(double kiloValue) {
        return kiloValue*(2.20462262185);
    }
}