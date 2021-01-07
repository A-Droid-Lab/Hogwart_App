package com.project.hogwartapp.view.fragment

import androidx.core.view.ViewCompat
import androidx.viewpager2.widget.ViewPager2
import com.project.hogwartapp.R
import com.project.hogwartapp.databinding.FragmentHogwartBinding
import com.project.hogwartapp.view.adapter.HomeViewPagerAdapter
import com.project.hogwartapp.view.viewmodel.CharacterViewModel
import com.project.hogwartapp.view.base.BaseFragment
import me.relex.circleindicator.CircleIndicator3

class HogwartFragment : BaseFragment<CharacterViewModel, FragmentHogwartBinding>() {

    override fun getViewModel(): Class<CharacterViewModel> = CharacterViewModel::class.java

    override fun getLayoutRes(): Int = R.layout.fragment_hogwart

    override fun beforeViewCreated() {
        viewModel.getAllCharacters()
    }

    override fun afterViewCreated() {
        val indicator: CircleIndicator3 = dataBinding.ciHogwart
        val homeAdapter = HomeViewPagerAdapter()

        dataBinding.lottieView.playAnimation()
        dataBinding.vpHogwart.apply {
            adapter = homeAdapter
            offscreenPageLimit = 3
            indicator.setViewPager(dataBinding.vpHogwart)
        }

        val pageMargin = resources.getDimensionPixelOffset(R.dimen.pageMargin).toFloat()
        val pageOffset = resources.getDimensionPixelOffset(R.dimen.offset).toFloat()

        dataBinding.vpHogwart.setPageTransformer(ViewPager2.PageTransformer { page, position ->
            val myOffset = position * -(2 * pageOffset + pageMargin)
            if (ViewCompat.getLayoutDirection(dataBinding.vpHogwart) == ViewCompat.LAYOUT_DIRECTION_RTL) {
                page.translationX = -myOffset
            } else {
                page.translationX = myOffset
            }
        })

        homeAdapter.setOnHouseClickListener {
            replaceFragment(HouseDetailFragment.newInstance())
        }
    }

    companion object {
        fun newInstance(): HogwartFragment {
            return HogwartFragment()
        }
    }
}