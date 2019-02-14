package com.lmlibrary.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lmlibrary.R;

/**
 * Description:
 * User: niexg
 * Date: 2018-07-24
 * Time: 9:18
 */
public class MyToolbar extends FrameLayout {

    private View rootView;
    private TextView ceterTv;
    private LinearLayout leftBar;
    private LinearLayout rightBar;
    private LinearLayout centerBar;
    private TextView rightTv;
    public ImageView rightImg;

    public MyToolbar(Context context) {
        super(context);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        rootView = inflater.inflate(R.layout.lb_toolbar, null);
        init(rootView);
    }

    public void setRootView(View view) {
        removeAllViews();
        addView(view);
    }

    public MyToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        rootView = inflater.inflate(R.layout.lb_toolbar, null);
        init(rootView);
    }

    public void init(View view) {
        setRootView(view);
        ceterTv = findViewById(R.id.center_text);
        rightTv = findViewById(R.id.right_text);
        leftBar = findViewById(R.id.left_bar);
        centerBar = findViewById(R.id.center_bar);
        rightBar = findViewById(R.id.right_bar);
        rightImg = findViewById(R.id.right_img);
    }

    public void setTitle(String title) {
        if (ceterTv != null) {
            ceterTv.setVisibility(VISIBLE);
            ceterTv.setText(title);
        }
    }

    public void setRightTitle(String title) {
        if (rightTv != null) {
            rightTv.setVisibility(VISIBLE);
            rightTv.setText(title);
        }
    }


    public void setLeftClickListener(OnClickListener onClickListener) {
        leftBar.setOnClickListener(onClickListener);
    }

    public void setRightClickListener(OnClickListener onClickListener) {
        rightBar.setOnClickListener(onClickListener);
    }

    public void setCenterClickListener(OnClickListener onClickListener) {
        centerBar.setOnClickListener(onClickListener);
    }

}
