package rodrigo.fer.presentarundii;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_top);
        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_bot);

        TextView txt_nameAPK=findViewById(R.id.txt_nameAPK);
        TextView txt_nameComp=findViewById(R.id.txt_nameComp);
        ImageView img_logo=findViewById(R.id.img_logo);

        txt_nameAPK.setAnimation(animacion1);
        img_logo.setAnimation(animacion1);
        txt_nameComp.setAnimation(animacion2);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash.this,MainActivity.class);
                startActivity(intent);
            }
        },4000);
    }
}