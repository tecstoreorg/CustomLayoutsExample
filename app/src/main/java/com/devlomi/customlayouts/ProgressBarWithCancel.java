package com.devlomi.customlayouts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;

public class ProgressBarWithCancel extends FrameLayout {
    private ProgressBar progressBar;

    public ProgressBarWithCancel(@NonNull Context context) {
        super(context);
        init(context);
    }

    public ProgressBarWithCancel(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ProgressBarWithCancel(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        progressBar = new ProgressBar(context);
        LayoutParams params = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        progressBar.setLayoutParams(params);
        ImageButton imageButton = new ImageButton(context);
        imageButton.setLayoutParams(params);
        imageButton.setBackground(null);
        imageButton.setImageResource(R.drawable.ic_clear);
        addView(progressBar);
        addView(imageButton);
    }

    public void setProgress(int progress) {
        progressBar.setProgress(progress);
    }
}
