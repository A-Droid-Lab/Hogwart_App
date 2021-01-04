package com.project.hogwartapp.view

import android.os.Bundle
import com.project.hogwartapp.R
import com.project.hogwartapp.databinding.ActivityMainBinding
import com.project.hogwartapp.util.transact
import com.project.hogwartapp.view.base.BaseActivity
import com.project.hogwartapp.view.home.HogwartFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getLayoutRes(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.transact {
            replace(R.id.container, HogwartFragment.newInstance())
        }
    }
}
