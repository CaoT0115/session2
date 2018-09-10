package com.example.caotiancheng.session2;

import android.media.Image;
import android.renderscript.Double2;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.caotiancheng.session2.R;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText H;
    EditText W;
    Button C;
    ImageView P;
    TextView BMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        H=(EditText) findViewById(R.id.EH);
        W=(EditText) findViewById(R.id.EW);
        C=(Button) findViewById(R.id.Cal);
        P=(ImageView) findViewById(R.id.pic);
        BMI=(TextView) findViewById(R.id.t);
    }

    public void calBMI(View view){
        double h= Double.valueOf(H.getText().toString());
        double w= Double.valueOf(W.getText().toString());

        double bmi=h*510/700+w*2;
        String result = String .format("get %.3f kcal",bmi);
        BMI.setText(result);
        //BMI.setText(String.valueOf(bmi));

        P.setImageResource(R.drawable.b);


            Toast.makeText(getApplicationContext(), "You do NOT need it",
                    Toast.LENGTH_LONG).show();

    }
}
