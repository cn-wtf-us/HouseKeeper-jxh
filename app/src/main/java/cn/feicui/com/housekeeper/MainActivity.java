package cn.feicui.com.housekeeper;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView sk= (ImageView) findViewById(R.id.iv_sekai);
        AnimatorSet animator= (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.animator_alpha);
        animator.setTarget(sk);
        animator.start();
    }
}
