package mcm.edu.ph.devera_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AccelerationFormula extends AppCompatActivity implements View.OnClickListener{
    Button btnCalcAcceleration;
    EditText valueofvAcceleration, valueoftAcceleration;
    TextView txtresultAcceleration;

    AllTheFormulas alltheformulas = new AllTheFormulas();
    Components allcomponents = new Components();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceleration_formula);

        //Button
        btnCalcAcceleration = findViewById(R.id.btnCalcAcceleration);

        //EditText
        valueofvAcceleration = findViewById(R.id.valueofvAcceleration);
        valueoftAcceleration = findViewById(R.id.valueoftAcceleration);

        //TextView
        txtresultAcceleration = findViewById(R.id.txtresultAcceleration);

        btnCalcAcceleration.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCalcAcceleration:
                allcomponents.setVelocity1(Double.parseDouble(valueofvAcceleration.getText().toString()));
                allcomponents.setTime1(Double.parseDouble(valueoftAcceleration.getText().toString()));
                double answer=alltheformulas.Acceleration(allcomponents.getVelocity1(),allcomponents.getTime1());
                txtresultAcceleration.setText(""+answer);
                break;
        }
    }
}