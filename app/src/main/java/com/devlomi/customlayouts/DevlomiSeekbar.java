package com.devlomi.customlayouts;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;

public class DevlomiSeekbar extends AppCompatSeekBar {
    public DevlomiSeekbar(Context context) {
        super(context);
        init(context, null); //null because there is no attributes when this is called!
    }

    public DevlomiSeekbar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);

    }

    public DevlomiSeekbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.DevlomiSeekbar, 0, 0);
        if (array != null) {
            int seekColor = array.getColor(R.styleable.DevlomiSeekbar_seekColor, -1);
            if (seekColor != -1) {
                Drawable progressDrawable = getProgressDrawable().mutate();
                progressDrawable.setColorFilter(seekColor, PorterDuff.Mode.SRC_IN);
                setProgressDrawable(progressDrawable);
            }

            int thumbColor = array.getColor(R.styleable.DevlomiSeekbar_thumbColor, -1);
            if (thumbColor != -1) {
                Drawable thumbDrawable = getThumb().mutate();
                thumbDrawable.setColorFilter(seekColor, PorterDuff.Mode.SRC_IN);
                setThumb(thumbDrawable);
            }

            array.recycle();
        }

    }
}
