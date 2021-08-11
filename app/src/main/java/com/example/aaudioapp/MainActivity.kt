package com.example.aaudioapp

import android.media.AudioManager
import android.media.MediaPlayer
import android.media.ToneGenerator
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var toneGen:ToneGenerator
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mediaPlayer = MediaPlayer.create(this,R.raw.kalimba)
        toneGen = ToneGenerator(AudioManager.STREAM_DTMF,ToneGenerator.MAX_VOLUME)
    }
    fun onClick(view:View){
        val button :ImageButton =  findViewById(R.id.play)
/*        if(!mediaPlayer?.isPlaying){
            mediaPlayer?.start()
        }
        else{
            mediaPlayer.pause()
        }*/
        toneGen.startTone(ToneGenerator.TONE_DTMF_3,200)
    }
}