package demo.tensorflow.org.customvision_sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class ChatRemedy extends AppCompatActivity {
CardView chattext,voicetext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_remedy);
        chattext = (CardView)findViewById(R.id.chattext);
        voicetext = (CardView) findViewById(R.id.voicetext);

        chattext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ChatRemedy.this,ChatText.class);
                startActivity(intent1);
            }
        });

        voicetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(ChatRemedy.this,VoiceChat.class);
                startActivity(intent2);
            }
        });
    }
}
