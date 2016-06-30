package frameanimation.devdeeds.com.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        ImageView imageView = (ImageView) findViewById(R.id.animationView);

        imageView.setBackgroundResource(R.drawable.swing_animation);

        // Get the background, which has been compiled to an AnimationDrawable object.
        AnimationDrawable frameAnimation = (AnimationDrawable) imageView.getBackground();

        // Start the animation (looped playback by default).
        frameAnimation.start();
    }
}
