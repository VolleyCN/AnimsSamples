package com.moses.anims;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.moses.library.AVLoadingIndicatorView;


/**
 * Created by Jack Wang on 2016/8/5.
 */

public class IndicatorActivity extends AppCompatActivity {

    private AVLoadingIndicatorView avi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicator);

        String indicator = getIntent().getStringExtra("indicator");
        avi = findViewById(R.id.avi);
        avi.setIndicator(indicator);
    }

    public void hideClick(View view) {
        avi.hide();
        // or avi.smoothToHide();
    }

    public void showClick(View view) {
        avi.show();
        // or avi.smoothToShow();
    }
}
