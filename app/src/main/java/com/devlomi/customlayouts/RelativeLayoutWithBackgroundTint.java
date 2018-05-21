package com.devlomi.customlayouts;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class RelativeLayoutWithBackgroundTint extends RelativeLayout {
    public RelativeLayoutWithBackgroundTint(Context context) {
        super(context);
        init(context, null);
    }

    public RelativeLayoutWithBackgroundTint(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public RelativeLayoutWithBackgroundTint(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.RelativeLayoutWithBackgroundTint, 0, 0);
        if (array != null) {
            int bgTintColor = array.getColor(R.styleable.RelativeLayoutWithBackgroundTint_bgTintColor, -1);
            if (bgTintColor != -1) {
                Drawable background = getBackground().mutate();
                background.setColorFilter(bgTintColor, PorterDuff.Mode.SRC_IN);
            }
            array.recycle();
        }
    }
}

