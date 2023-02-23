package com.example.myapplication;

import android.app.Activity
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.RelativeLayout


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layout1 = findViewById<View>(R.id.layout1) as RelativeLayout
        val fondo: Lienzo = Lienzo(this)
        layout1.addView(fondo)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.activity_main, menu)
        return true
    }




    internal inner class Lienzo(context: Context?) : View(context) {
        override fun onDraw(canvas: Canvas) {
            canvas.drawRGB(255, 255, 255)
            val ancho = canvas.width
            val alto = canvas.height
            val pincel1 = Paint()
            pincel1.setARGB(255, 255, 0, 0)
            pincel1.style = Paint.Style.STROKE
            for (f in 0..9) {
                canvas.drawCircle(
                    (ancho / 2).toFloat(),
                    (alto / 2).toFloat(),
                    (f * 15).toFloat(),
                    pincel1
                )
            }
        }
    }
}

