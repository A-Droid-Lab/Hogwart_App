package com.project.hogwartapp.view.fragment

import android.os.Bundle
import com.project.hogwartapp.R
import com.project.hogwartapp.databinding.FragmentHouseDetailBinding
import com.project.hogwartapp.view.base.BaseFragment
import com.project.hogwartapp.view.viewmodel.CharacterViewModel


class HouseDetailFragment : BaseFragment<CharacterViewModel, FragmentHouseDetailBinding>() {

    override fun getViewModel(): Class<CharacterViewModel> = CharacterViewModel::class.java

    override fun getLayoutRes(): Int = R.layout.fragment_house_detail

    override fun beforeViewCreated() {
        if(arguments!=null){
            arguments!!.getString("house")?.let {
                if(it.contains("hogwart")){
                    viewModel.getAllHogwarts()
                }else{
                    viewModel.getCharactersByHouse(it)
                }
            }
        }

    }

    override fun afterViewCreated() {


    }

    companion object {
        fun newInstance(house : String) =
            HouseDetailFragment().apply {
                arguments = Bundle().apply {
                    putString("house",house)
                }
            }
        }
}