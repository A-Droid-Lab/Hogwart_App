package com.project.hogwartapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.project.hogwartapp.R
import com.project.hogwartapp.databinding.ActivityMainBinding
import com.project.hogwartapp.util.transact
import com.project.hogwartapp.view.base.BaseActivity
import com.project.hogwartapp.view.fragment.HogwartFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getLayoutRes(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        replaceFragment(HogwartFragment.newInstance())
    }

    fun replaceFragment(fragment : Fragment){
        supportFragmentManager.transact {
            replace(R.id.container, fragment).addToBackStack(fragment.tag)
        }
    }
}
