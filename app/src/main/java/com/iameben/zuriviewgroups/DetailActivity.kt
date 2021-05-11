package com.iameben.zuriviewgroups

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iameben.zuriviewgroups.databinding.ActivityDetailBinding
import com.iameben.zuriviewgroups.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private var binding: ActivityDetailBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_detail)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}