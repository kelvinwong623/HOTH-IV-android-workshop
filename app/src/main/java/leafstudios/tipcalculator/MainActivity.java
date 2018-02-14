package leafstudios.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected double getTip(double total, double percent)
    {
        return total / percent;
    }

    protected double getNewTotal(double total, double tip)
    {
        return total + tip;
    }
}
