package com.example.thirdpartylibrary

import `is`.arontibo.library.ProgressDownloadView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            elastic_download_view.startIntro()

            Handler().postDelayed(Runnable {
                elastic_download_view.success()
            },2* ProgressDownloadView.ANIMATION_DURATION_BASE)


        }
    }
