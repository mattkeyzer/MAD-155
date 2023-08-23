package com.example.gestures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.GestureDetectorCompat
lateinit var getGestureText: TextView
var scale = 1f

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {


    var sDetector: ScaleGestureDetector? = null

    var gDetector: GestureDetector? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getGestureText = findViewById(R.id.getGestureText)
        this.gDetector = GestureDetector(this, this)
        gDetector?.setOnDoubleTapListener(this)
        sDetector = ScaleGestureDetector(this, ScaleListener())

    }

    class ScaleListener: ScaleGestureDetector.SimpleOnScaleGestureListener(){
        override fun onScale(detector: ScaleGestureDetector): Boolean {
            scale *= detector.scaleFactor
            scale = Math.max(0.1f, Math.min(scale,5.0f))
            getGestureText.scaleX = scale
            getGestureText.scaleY = scale
            return true
        }
    }



    override fun onTouchEvent(event: MotionEvent): Boolean {
        this.gDetector?.onTouchEvent(event)
        this.sDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }


    override fun onDown(p0: MotionEvent): Boolean {
        getGestureText.text = "onDown"
        return true
    }

    override fun onShowPress(p0: MotionEvent) {
        getGestureText.text = "ShowPress"
    }

    override fun onSingleTapUp(p0: MotionEvent): Boolean {
        getGestureText.text = "Single Tap Up"
        return true

    }

    override fun onScroll(p0: MotionEvent, p1: MotionEvent, p2: Float, p3: Float): Boolean {
        getGestureText.text = "On Scroll"
        return true

    }

    override fun onLongPress(p0: MotionEvent) {
        getGestureText.text = "On Long Press"
    }

    override fun onFling(p0: MotionEvent, p1: MotionEvent, p2: Float, p3: Float): Boolean {
        getGestureText.text = "On Fling"
        return true
    }

    override fun onSingleTapConfirmed(p0: MotionEvent): Boolean {
        getGestureText.text = "On Single Tap Confirmed"
        return true
    }

    override fun onDoubleTap(p0: MotionEvent): Boolean {
        getGestureText.text = "On Double Tap"
        return true
    }

    override fun onDoubleTapEvent(p0: MotionEvent): Boolean {
        getGestureText.text = "On Double Tap Event"
        return true
    }



}