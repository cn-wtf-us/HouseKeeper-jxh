package cn.feicui.com.housekeeper;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

/**
 * Created by pc on 2016/9/10.
 */
public class LogoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        ImageView image = (ImageView) findViewById(R.id.lv);
    }

    private Animation.AnimationListener animationListener = new Animation.AnimationListener() {


        @Override
        public void onAnimationStart(Animation animation) {}

        @Override
        public void onAnimationEnd(Animation animation) {}

        @Override
        public void onAnimationRepeat(Animation animation) {
            Intent intent = new Intent(LogoActivity.this, TeLmsgActivity.class);
            startActivity(intent);
            finish();
        }
    };

}

