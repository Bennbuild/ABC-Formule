package com.example.android.abc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double D = 0;
    double X1 = 0;
    double X2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateX(View view){
        D = (bValue() * bValue()) - 4 * aValue() * cValue();
        X1 = ((-1 * bValue()) - Math.sqrt(D)) / (2 * aValue());
        X2 = ((-1 * bValue()) + Math.sqrt(D)) / (2 * aValue());
        displayNumber1(X1);
        displayNumber2(X2);

    }

    private int aValue() {
        EditText aEditText = findViewById(R.id.number_input_a);
        String aText = aEditText.getText().toString();
        int aNumber = Integer.parseInt(aText);
        return aNumber;
    }

    private int bValue() {
        EditText bEditText = findViewById(R.id.number_input_b);
        String bText = bEditText.getText().toString();
        int bNumber = Integer.parseInt(bText);
        return bNumber;
    }

    private int cValue() {
        EditText cEditText = findViewById(R.id.number_input_c);
        String cText = cEditText.getText().toString();
        int cNumber = Integer.parseInt(cText);
        return cNumber;
    }

    private void displayNumber1(double number) {
        TextView answerView = findViewById(R.id.x_display_1);
        String numberString = String.valueOf(number);
        answerView.setText("X = " + numberString);
    }

    private void displayNumber2(double number) {
        TextView answerView = findViewById(R.id.x_display_2);
        String numberString = String.valueOf(number);
        answerView.setText("X = " + numberString);
    }
}
