package com.example.asus_pc.svn_work;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ASUS-PC on 2017/8/14.
 */

public class CustCrilce extends View {
    public CustCrilce(Context context) {
        super(context);
    }

    public CustCrilce(Context context, @Nullable AttributeSet attrs) {
       this(context,attrs,0);
    }

    public CustCrilce(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setColor(Color.GREEN);
        canvas.drawCircle(50,50,20,paint);
    }
}

