package com.iameben.zuriviewgroups

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iameben.zuriviewgroups.databinding.ActivityDetailBinding
import com.iameben.zuriviewgroups.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private var binding: ActivityDetailBinding? = null
    private var logo = 0
    private var name: String? = null
    private var detail:String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_detail)

        logo = intent.getIntExtra(FactAdapter.LOGO_EXTRAs, 0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRAs)
        detail = intent.getStringExtra(FactAdapter.FACT_EXTRAs)
    }

    private fun setUpFactDetail(){
        binding?.detailTv?.text = detail
        binding?.logoIv?.setImageResource(logo)
        title = name
    }
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}