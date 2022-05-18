package mcm.edu.ph.devera_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PowerFormula extends AppCompatActivity implements View.OnClickListener{
    Button btnCalcPower;
    EditText valueofW, valueofT;
    TextView txtresultPower;

    AllTheFormulas alltheformulas = new AllTheFormulas();
    Components allcomponents = new Components();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power_formula);

        //Button
        btnCalcPower = findViewById(R.id.btnCalcPower);

        //EditText
        valueofW = findViewById(R.id.valueofW);
        valueofT = findViewById(R.id.valueofT);

        //TextView
        txtresultPower = findViewById(R.id.txtresultPower);

        btnCalcPower.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCalcPower:
                allcomponents.setWork(Double.parseDouble(valueofW.getText().toString()));
                allcomponents.setTime(Double.parseDouble(valueofT.getText().toString()));
                double answer=alltheformulas.Power(allcomponents.getWork(),allcomponents.getTime());
                txtresultPower.setText(""+answer);
                break;
        }
    }
}