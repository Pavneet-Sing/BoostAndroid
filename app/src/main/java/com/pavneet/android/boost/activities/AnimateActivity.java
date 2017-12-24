package com.pavneet.android.boost.activities;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.pavneet.android.boost.R;

/**
 * Created by Pavneet on 12/6/15.
 */
public class AnimateActivity extends AppCompatActivity {

    private RelativeLayout rel;
    private FloatingActionButton but_float;
    private Button button,button_animate, button_layText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animate);
        rel= (RelativeLayout) findViewById(R.id.rel);
        button=(Button) findViewById(R.id.button_layout);

        button_animate=(Button) findViewById(R.id.button_alpha);

        button_layText =(Button) findViewById(R.id.button_animateobject);

        button_animate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_animate.animate().alpha(0f)
                        .translationY(-button.getHeight())
                        .setDuration(1000)
                        .withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                finish();
                            }
                        });
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                to vanish by minimizing
                button.animate()
                        .scaleX(.7f)
                        .scaleY(.7f)
                        .alpha(0f)
                        .start();
            }
        });

        button_layText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Change text color
                ObjectAnimator.ofObject(button_layText, "textColor", new ArgbEvaluator(), Color.BLUE, Color.BLACK)
                        .setDuration(1000).start();
            }
        });


        but_float= (FloatingActionButton) findViewById(R.id.floatingbutton);
    }


}
