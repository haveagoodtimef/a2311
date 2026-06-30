package com.fenghongzhang.anew

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.OkHttpClient
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var feng:UserFeng


    @Inject
    lateinit var fengApi: FengApi

    @Inject
    @OkHttpClientOne
    lateinit var okHttpClient: OkHttpClient

    val mhandler =  object : Handler(Looper.getMainLooper()){
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        feng.name //null
        fengApi.getUser()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val message = Message()
        message.what = 0

        val obtain = Message.obtain()
        obtain.what = 0
        obtain.target = mhandler

        mhandler.sendMessageAtTime(message,0)

        //MessageQueue

        //Loop

    }

    fun test() {

    }

}