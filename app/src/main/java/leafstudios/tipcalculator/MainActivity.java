package leafstudios.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button calculateButton;
    EditText totalCostEdit;
    EditText percentEdit;
    TextView tipView;
    TextView newTotalCostView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        calculateButton = (Button) findViewById(R.id.calculateButton);
        totalCostEdit = (EditText) findViewById(R.id.totalCostEdit);
        percentEdit = (EditText) findViewById(R.id.percentEdit);
        tipView = (TextView) findViewById(R.id.tipView);
        newTotalCostView = (TextView) findViewById(R.id.newTotalCostView);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double total = Double.parseDouble(totalCostEdit.getText().toString());
                double percent = Double.parseDouble(percentEdit.getText().toString()) / 100.0 ;
                double tip = calculateTip(total, percent);
                double newTotal = calculateNewTotal(total, tip);

                tipView.setText("Tip: $" + Double.toString(tip));
                newTotalCostView.setText("New Total: $" + Double.toString(newTotal));
            }
        });
    }

    protected double calculateTip(double total, double percent)
    {
        return total / percent;
    }

    protected double calculateNewTotal(double total, double tip)
    {
        return total + tip;
    }
}
