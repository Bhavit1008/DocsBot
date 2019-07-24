package demo.tensorflow.org.customvision_sample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    Button recog;
    Button maps;
    Button chat;
    Button voice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        recog = (Button)findViewById(R.id.recog);
        maps = (Button) findViewById(R.id.maps);
        chat = (Button) findViewById(R.id.chat);
        voice = (Button) findViewById(R.id.voice);
        recog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this,ClassifierActivity.class);
                startActivity(intent);
            }
        });

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainMenu.this,GetLocation.class);
                startActivity(intent1);
            }
        });


        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainMenu.this,ChatText.class);
                startActivity(intent2);
            }
        });

        voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainMenu.this,VoiceChat.class);
                startActivity(intent3);
            }
        });

    }
}
