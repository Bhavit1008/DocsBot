package demo.tensorflow.org.customvision_sample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Track extends AppCompatActivity {
    CardView alert,stepcounter,bmicalculator,accupressure;
    Button pannic,Accup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);

        alert = (CardView)findViewById(R.id.alert);
        stepcounter = (CardView)findViewById(R.id.stepcounter);
        bmicalculator = (CardView)findViewById(R.id.bmicalculator);
        accupressure = (CardView)findViewById(R.id.accupressure);
        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Track.this,Reminder.class);
                startActivity(intent1);
            }
        });


        stepcounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Track.this,StepCounter.class);
                startActivity(intent2);
            }
        });

        bmicalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(Track.this,Bmi.class);
                startActivity(intent7);
                Toast.makeText(Track.this, "use 1kg = 2.20462 pounds", Toast.LENGTH_LONG).show();
            }
        });

        accupressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://sites.google.com/view/acupressure-points/home";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


    }
}
