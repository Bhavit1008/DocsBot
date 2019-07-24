package demo.tensorflow.org.customvision_sample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class OtherUtilities extends AppCompatActivity {
    CardView aboutus,contactus,ayurved,references;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_utilities);

        aboutus = (CardView)findViewById(R.id.aboutus);
        contactus = (CardView) findViewById(R.id.contactus);
        ayurved = (CardView) findViewById(R.id.ayurved);
        references = (CardView)findViewById(R.id.references);

        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://sites.google.com/view/about-us-docsbot";
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse(url));
                startActivity(intent1);
            }
        });

        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://sites.google.com/view/contact-us-docsbot";
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse(url));
                startActivity(intent2);
            }
        });

        ayurved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://sites.google.com/view/ayurveda-docsbot/home";
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse(url));
                startActivity(intent3);

            }
        });

        references.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://sites.google.com/view/docsbot-references/home";
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse(url));
                startActivity(intent3);

            }
        });

    }
}
