package com.coinappcleanarchitecture.presentation.coinlist.ui.activity

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.coinappcleanarchitecture.common.ui_resources.CoinLoader
import com.coinappcleanarchitecture.common.util.NetworkResponseState
import com.coinappcleanarchitecture.databinding.ActivityHomeBinding
import com.coinappcleanarchitecture.network.model.Coins
import com.coinappcleanarchitecture.presentation.coinlist.adapter.CoinListAdapter
import com.coinappcleanarchitecture.presentation.coinlist.vm.CoinListViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding

    private val coinListViewModel: CoinListViewModel by viewModels()
    private lateinit var coinListAdapter: CoinListAdapter

    private lateinit var layoutManager: GridLayoutManager

    private var page = 1

    private val tempCoinList = arrayListOf<Coins>()

    private var valueRepeat = 3

    private var isLoading = false

    private var pastVisibleItems = 0

    private var visibleItemCount = 0

    private var totalItemCount = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)

        setContentView(binding.root)

        layoutManager = GridLayoutManager(this, 2)

        coinListViewModel.getCoinList(page.toString())
        setupObserver()

        setupUI()

    }

    private fun setupUI() {
        coinListAdapter = CoinListAdapter(context = this, ArrayList())
        binding.recyclerViewCoinList.adapter = coinListAdapter
        binding.recyclerViewCoinList.setItemViewCacheSize(20)

        binding.recyclerViewCoinList.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (layoutManager.findLastCompletelyVisibleItemPosition() == layoutManager.itemCount -1) {
                    page += 1
                    coinListViewModel.getCoinList(page.toString())
                    setupObserver()

                }

            }
        })

    }

    private fun setupObserver(){
        coinListViewModel.coinListResponse.observe(this, Observer{

            when(it){
                is NetworkResponseState.Loading ->{
                    CoinLoader.showDialog(this@HomeActivity)
                }
                is NetworkResponseState.Success ->{
                    CoinLoader.hideDialog()
                    it.data.let {coinList ->
                        tempCoinList.addAll(coinList as ArrayList<Coins>)
                        coinListAdapter.setData(tempCoinList)
                    }
                }
                is NetworkResponseState.Error ->{
                    CoinLoader.hideDialog()
                }
            }

        })
    }

}