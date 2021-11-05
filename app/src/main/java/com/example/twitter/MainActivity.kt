package com.example.twitter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.Toast
import androidx.core.text.buildSpannedString
import com.example.twitter.databinding.ActivityMainBinding
import android.R
import android.graphics.Color.BLUE
import android.view.View

import android.widget.EditText





class MainActivity : AppCompatActivity() {
     lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backButton.setOnClickListener {back()}
        binding.likeButton.setOnClickListener {like()}
        binding.shareButton.setOnClickListener {share()}
        binding.chatButton.setOnClickListener {chat()}
        binding.retweetButton.setOnClickListener {retweet()}

    // buildSpannedString {  binding.spannableText.setSpan(R.id.textView3) -> ForegroundColorSpan(color.BLUE), 25, 35,  Spannable.SPAN_EXCLUSIVE_EXCLUSIVE) }
    // buildSpannedString {  binding.spannableText.setSpan(R.id.textView3) -> ForegroundColorSpan(color.BLUE), 139, 155,  Spannable.SPAN_EXCLUSIVE_EXCLUSIVE) }

    }

    fun back(){
        Toast.makeText(this,"return back", Toast.LENGTH_SHORT).show()

    }

    fun like(){
        Toast.makeText(this,"you like tweet", Toast.LENGTH_SHORT).show()

    }

    fun share(){
        Toast.makeText(this,"share tweet", Toast.LENGTH_SHORT).show()

    }

    fun chat(){
        Toast.makeText(this,"comment", Toast.LENGTH_SHORT).show()

    }
    fun retweet(){
        Toast.makeText(this,"retweet action", Toast.LENGTH_SHORT).show()

    }




}