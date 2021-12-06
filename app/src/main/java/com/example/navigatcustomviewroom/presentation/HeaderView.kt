package com.example.navigatcustomviewroom.presentation

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.example.navigatcustomviewroom.R

class HeaderView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private var titleText: String = "Main text"
    private var titleTextColor: Int = R.color.light_green
    private var titleTextSize: Float = 140f
    private var subTitleText: String = "Sub text"
    private var subTitleTextColor: Int = R.color.purple_200
    private var subTitleTextSize: Float = 70f

    private var roundRectPaint: Paint = Paint().apply {
        color = resources.getColor(R.color.light_green)
    }
    private var textPaint: Paint = Paint().apply {
        color = resources.getColor(titleTextColor)
        textSize = titleTextSize
        style = Paint.Style.FILL_AND_STROKE

    }

    private var subTextPaint: Paint = Paint().apply {
        color = resources.getColor(subTitleTextColor)
        textSize = subTitleTextSize
        style = Paint.Style.FILL

    }

    init {
        context.theme.obtainStyledAttributes(attrs, R.styleable.HeaderView, 0, 0).apply {
            titleText = (getText(R.styleable.HeaderView_titleText) ?: "title text").toString()
            subTitleText = (getText(R.styleable.HeaderView_subTitleText) ?: "sub title text").toString()
        }

    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

//        canvas?.drawRoundRect(
//            0f,
//            0f,
//            300f,
//            300f,
//            100f,
//            80f,
//            roundRectPaint
//        )

        canvas?.drawText(
            titleText,
            titleText.length.toFloat(),
            textPaint.textSize + titleText.length.toFloat(),
            textPaint
        )

        canvas?.drawText(
            subTitleText,
            subTitleText.length.toFloat(),
            subTextPaint.textSize + titleText.length.toFloat() + textPaint.textSize + titleText.length.toFloat(),
            subTextPaint
        )
    }
}