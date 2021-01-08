package com.project.hogwartapp.view.fragment

import android.os.Bundle
import com.project.hogwartapp.R
import com.project.hogwartapp.databinding.FragmentHouseDetailBinding
import com.project.hogwartapp.view.adapter.DetailHouseAdapter
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
        val adapter = DetailHouseAdapter()
        dataBinding.rvDetailHouseFragment.adapter = adapter
        viewModel.characterData.observe(viewLifecycleOwner){
            adapter.setItem(it)
        }
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