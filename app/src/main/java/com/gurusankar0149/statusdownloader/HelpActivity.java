package com.gurusankar0149.statusdownloader;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.gurusankar0149.statusdownloader.util.AdController;

public class HelpActivity extends AppCompatActivity {

    ImageView back;
    ImageView help1, help2, help3, help4, help5, help6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        back = findViewById(R.id.backIV);
        back.setOnClickListener(v -> onBackPressed());

        help1 = findViewById(R.id.help1);
        help2 = findViewById(R.id.help2);
        help3 = findViewById(R.id.help3);
        help4 = findViewById(R.id.help4);
        help5 = findViewById(R.id.help5);
        help6 = findViewById(R.id.help6);

        Glide.with(this)
                .load(R.drawable.step1)
                .into(help1);

        Glide.with(this)
                .load(R.drawable.step2)
                .into(help2);

        Glide.with(this)
                .load(R.drawable.step3)
                .into(help3);

        Glide.with(this)
                .load(R.drawable.step5)
                .into(help5);
        Glide.with(this)
                .load(R.drawable.step6)
                .into(help6);
        Glide.with(this)
                .load(R.drawable.step4)
                .into(help4);


        /*admob*/
        LinearLayout container = findViewById(R.id.banner_container);
        AdController.loadBannerAd(HelpActivity.this, container);
        AdController.loadInterAd(HelpActivity.this);
    }

    @Override
    public void onBackPressed() {
        AdController.adCounter++;
        if (AdController.adCounter == AdController.adDisplayCounter) {
            AdController.showInterAd(HelpActivity.this, null, 0);
        } else {
            super.onBackPressed();
        }
    }
}