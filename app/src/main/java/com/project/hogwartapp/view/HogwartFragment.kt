package com.project.hogwartapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.hogwartapp.R
import com.project.hogwartapp.databinding.FragmentHogwartBinding
import com.project.hogwartapp.view.base.BaseFragment

class HogwartFragment : BaseFragment<CharacterViewModel, FragmentHogwartBinding>() {

    override fun getViewModel(): Class<CharacterViewModel> = CharacterViewModel::class.java

    override fun getLayoutRes(): Int = R.layout.fragment_hogwart

    override fun afterViewCreated() {
        viewModel.getAllCharacters()
    }

    companion object {
        fun newInstance(): HogwartFragment {
            return HogwartFragment()
        }
    }

}