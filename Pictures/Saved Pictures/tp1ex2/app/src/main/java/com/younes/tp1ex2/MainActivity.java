package com.younes.tp1ex2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextSurface, editTextRooms;
    private CheckBox checkBoxPool;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextSurface = findViewById(R.id.editTextSurface);
        editTextRooms = findViewById(R.id.editTextRooms);
        checkBoxPool = findViewById(R.id.checkBoxPool);
        textViewResult = findViewById(R.id.textViewResult);
        Button buttonCalculate = findViewById(R.id.buttonCalculate);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateTaxes();
            }
        });
    }

    private void calculateTaxes() {
        int surface = Integer.parseInt(editTextSurface.getText().toString());
        int numberOfRooms = Integer.parseInt(editTextRooms.getText().toString());
        boolean hasPool = checkBoxPool.isChecked();

        // Calcul des impôts
        double baseTax = surface * 2;
        double additionalTax = (numberOfRooms * 50) + (hasPool ? 100 : 0);
        double totalTax = baseTax + additionalTax;

        // Affichage du résultat
        String resultText = String.format("Impôt de base: %.2f\nImpôt supplémentaire: %.2f\nImpôt Total: %.2f",
                baseTax, additionalTax, totalTax);
        textViewResult.setText(resultText);
    }
}
