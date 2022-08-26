package com.example.mydraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyDraw extends View {

    Paint paint;

    public MyDraw(Context context) {
        super(context);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);

        paint.setStrokeWidth(5);
        canvas.drawCircle(getWidth()/2, getHeight()/2, 250, paint);
        paint.setColor(Color.BLACK);
        paint.setTextSize(150f);
        canvas.drawText(getWidth() + " " + getHeight(), 10, 150, paint);
        canvas.drawRect(50, 800,800, 1500, paint);

        //оординатная сетка
        for (int i=0; i <getHeight(); i+=50){
            canvas.drawLine(0, i,getWidth(),i, paint);
        }




    }
}




