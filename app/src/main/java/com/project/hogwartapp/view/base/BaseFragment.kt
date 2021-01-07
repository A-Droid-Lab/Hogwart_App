package com.project.hogwartapp.view.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.bind
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.project.hogwartapp.databinding.ActivityMainBinding.bind
import com.project.hogwartapp.databinding.FragmentHogwartBinding.bind
import com.project.hogwartapp.view.MainActivity
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment<VM : ViewModel, DB: ViewDataBinding>: DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var mainActivity : MainActivity

    lateinit var dataBinding: DB
    lateinit var viewModel: VM

    abstract fun getViewModel(): Class<VM>
    abstract fun beforeViewCreated()
    abstract fun afterViewCreated()

    @LayoutRes
    abstract fun getLayoutRes(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this, viewModelFactory).get(getViewModel())
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        dataBinding = DataBindingUtil.inflate(inflater, getLayoutRes(), container, false)
        beforeViewCreated()
        afterViewCreated()
        return dataBinding.root
    }

    fun replaceFragment(fragment:Fragment){
        mainActivity.replaceFragment(fragment)
    }
}