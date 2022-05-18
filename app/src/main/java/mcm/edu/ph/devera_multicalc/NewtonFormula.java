package mcm.edu.ph.devera_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewtonFormula extends AppCompatActivity implements View.OnClickListener{

    Button btnCalcNewton;
    EditText valueofmNewton, valueofA;
    TextView txtresultNewton;

    AllTheFormulas alltheformulas = new AllTheFormulas();
    Components allcomponents = new Components();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newton_formula);

        //Button
        btnCalcNewton = findViewById(R.id.btnCalcNewton);

        //EditText
        valueofmNewton = findViewById(R.id.valueofmNewton);
        valueofA = findViewById(R.id.valueofA);

        //TextView
        txtresultNewton = findViewById(R.id.txtresultNewton);

        btnCalcNewton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCalcNewton:
                allcomponents.setMass1(Double.parseDouble(valueofmNewton.getText().toString()));
                allcomponents.setAcceleration(Double.parseDouble(valueofA.getText().toString()));
                double answer=alltheformulas.Newton(allcomponents.getMass1(),allcomponents.getAcceleration());
                txtresultNewton.setText(""+answer);
                break;
        }
    }
}