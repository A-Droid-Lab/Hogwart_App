package com.project.hogwartapp.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.hogwartapp.R
import com.project.hogwartapp.databinding.FragmentHouseDetailBinding
import com.project.hogwartapp.view.base.BaseFragment
import com.project.hogwartapp.view.viewmodel.CharacterViewModel


class HouseDetailFragment : BaseFragment<CharacterViewModel, FragmentHouseDetailBinding>() {

    override fun getViewModel(): Class<CharacterViewModel> = CharacterViewModel::class.java

    override fun getLayoutRes(): Int = R.layout.fragment_house_detail

    override fun beforeViewCreated() {

    }

    override fun afterViewCreated() {

    }

    companion object {
        fun newInstance(): HouseDetailFragment {return HouseDetailFragment()}
    }
}