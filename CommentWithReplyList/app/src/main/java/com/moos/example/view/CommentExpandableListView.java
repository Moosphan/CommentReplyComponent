package com.moos.example.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ExpandableListView;
/**
 * Author: Moos
 * E-mail: moosphon@gmail.com
 * Date:  18/4/18.
 * Desc: 自定义ExpandableListView,解决与NestedScrollview滑动冲突问题
 */

public class CommentExpandableListView extends ExpandableListView {
    public CommentExpandableListView(Context context) {
        super(context);
    }

    public CommentExpandableListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CommentExpandableListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);

    }
}
