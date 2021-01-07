package com.example.aaudioapp

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Example of a call to a native method
        //findViewById<TextView>(R.id.sample_text).text = stringFromJNI()
        mediaPlayer = MediaPlayer.create(this,R.raw.kalimba)

    }
    fun onClick(view:View){
        val  button :ImageButton =  findViewById(R.id.play)
        if(!mediaPlayer?.isPlaying){
            mediaPlayer?.start()
        }
        else{
            mediaPlayer.pause()
        }

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String
    external fun AudioEngine(): Int
    companion object {
        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}