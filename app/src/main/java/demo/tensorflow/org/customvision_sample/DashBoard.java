package demo.tensorflow.org.customvision_sample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DashBoard extends AppCompatActivity {
CardView chat,voice,visual,nearby,track,utility;
Button emergency;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        emergency = (Button) findViewById(R.id.pannic);
        utility = (CardView)findViewById(R.id.utility);
        chat = (CardView)findViewById(R.id.chat);
        voice = (CardView)findViewById(R.id.voice);
        visual = (CardView)findViewById(R.id.visual);
        nearby = (CardView)findViewById(R.id.nearby);
        track = (CardView)findViewById(R.id.track);

        Toast.makeText(this, "Basically, this disclaimer is letting you know that the information provided on the Docsbot app isn’t intended to replace a trip to your doctor. It’s not meant to be part of the “cure, mitigation, treatment, or prevention” of any disease. As a result, if you rely solely on this app’s information to make important medical decisions, the DOCSBOT isn’t responsible if something bad happens to you.\n" +
                "\n" +
                "जैसा कि, यह अस्वीकरण आपको बता रहा है कि ऐप पर दी गई जानकारी आपके डॉक्टर की यात्रा को बदलने के लिए नहीं है। इसका मतलब किसी भी बीमारी के \"इलाज, शमन, उपचार, या रोकथाम\" का हिस्सा नहीं है। परिणामस्वरूप, यदि आप महत्वपूर्ण चिकित्सा निर्णय लेने के लिए इस ऐप की जानकारी पर पूरी तरह से भरोसा करते हैं, तो आपके लिए कुछ बुरा होने पर विस्कॉन्सिन का मेडिकल कॉलेज जिम्मेदार नहीं है|\n", Toast.LENGTH_LONG).show();
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(DashBoard.this,ChatRemedy.class);
                startActivity(intent1);
            }
        });


        voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(DashBoard.this,HomeRemedy.class);
                startActivity(intent2);
            }
        });


        nearby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(DashBoard.this,GetLocation.class);
                startActivity(intent3);
            }
        });

        visual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(DashBoard.this,ClassifierActivity.class);
                startActivity(intent4);
            }
        });

        track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(DashBoard.this,Track.class);
                startActivity(intent5);
            }
        });

        utility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(DashBoard.this,OtherUtilities.class);
                startActivity(intent6);
            }
        });

        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"108"));
                startActivity(intent);
            }
        });


    }
}
