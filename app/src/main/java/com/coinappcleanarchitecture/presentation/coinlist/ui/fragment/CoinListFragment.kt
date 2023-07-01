package com.coinappcleanarchitecture.presentation.coinlist.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.coinappcleanarchitecture.R
import com.coinappcleanarchitecture.presentation.coinlist.vm.CoinListViewModel

class CoinListFragment : Fragment() {

    private val coinListViewModel : CoinListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_coin_list, container, false)
    }


}