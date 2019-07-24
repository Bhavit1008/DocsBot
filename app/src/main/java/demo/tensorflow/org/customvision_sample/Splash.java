package demo.tensorflow.org.customvision_sample;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.parse.ParseInstallation;

public class Splash extends AppCompatActivity {

    private ImageView imageview;
    private static int splashtimeout = 1500;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        ParseInstallation.getCurrentInstallation().saveInBackground();
        imageview = (ImageView)findViewById(R.id.imageview);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this,DashBoard.class);
                startActivity(intent);
                finish();
            }
        },splashtimeout);
        Animation myanime = AnimationUtils.loadAnimation(this,R.anim.mysplash);
        imageview.startAnimation(myanime);
    }
}
