package com.project.hogwartapp.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.hogwartapp.R
import com.project.hogwartapp.databinding.FragmentStarbucksBinding
import com.project.hogwartapp.view.base.BaseFragment
import com.project.hogwartapp.view.viewmodel.StarbucksViewModel


class StarbucksFragment : BaseFragment<StarbucksViewModel, FragmentStarbucksBinding>() {

    override fun getViewModel(): Class<StarbucksViewModel> = StarbucksViewModel::class.java

    override fun getLayoutRes(): Int = R.layout.fragment_starbucks

    override fun beforeViewCreated() {
        viewModel.getAllMenus()
    }

    override fun afterViewCreated() {
    }

    companion object {
        @JvmStatic
        fun newInstance() =
                StarbucksFragment().apply {
                    arguments = Bundle().apply {

                    }
                }
    }
}