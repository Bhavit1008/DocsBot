package demo.tensorflow.org.customvision_sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class HomeRemedy extends AppCompatActivity {
CardView chatremedy,voiceremedy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_remedy);

        chatremedy = (CardView)findViewById(R.id.chatremedy);
        voiceremedy = (CardView)findViewById(R.id.voiceremedy);


        chatremedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomeRemedy.this,RemedyChat.class);
                startActivity(intent1);
            }
        });

        voiceremedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(HomeRemedy.this,RemedyVoice.class);
                startActivity(intent2);
            }
        });
    }
}
