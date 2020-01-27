package com.example.splashdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class ContinueForLogin extends AppCompatActivity {

    LottieAnimationView lottieAnim;
    TextView textView1,textView2;
    Button ContinueButton;
    Animation topAnim,bottomAnim,leftAnim,rightAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_continueforlogin);

        //Animations
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        leftAnim = AnimationUtils.loadAnimation(this,R.anim.left_animation);
        rightAnim = AnimationUtils.loadAnimation(this,R.anim.right_animation);


        //Now hook the animations with texts and buttons.
        lottieAnim = findViewById(R.id.lottie_anim);
        textView1 = findViewById(R.id.exploreTxt);
        textView2 = findViewById(R.id.continueForLogin);
        ContinueButton = findViewById(R.id.continue_btn);

        lottieAnim.setAnimation(topAnim);
        textView1.setAnimation(rightAnim);
        textView2.setAnimation(bottomAnim);
        ContinueButton.setAnimation(leftAnim);

    }
}
