package com.coinappcleanarchitecture.common.ui_resources

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.WindowManager
import android.widget.LinearLayout
import com.bumptech.glide.Glide
import com.coinappcleanarchitecture.R
import com.coinappcleanarchitecture.databinding.CoinLoaderBinding

class Loader(context: Context) : Dialog(context){
    lateinit var binding: CoinLoaderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CoinLoaderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Glide.with(context).load(R.drawable.loader).into(binding.loaderImg)
        with(window){
            this?.setLayout(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
            this?.setBackgroundDrawableResource(R.color.transparent)
            this?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            this?.statusBarColor =
                context.resources.getColor(R.color.background_grey_dark)
            this?.navigationBarColor =
                context.resources.getColor(R.color.background_grey_dark)
        }
    }
}
open class CoinLoader {
    companion object{
        private var loader: Loader? = null
        fun showDialog(
            context: Context?,
        ) {
            hideDialog()
            if (context != null) {
                try {
                    loader = Loader(context)
                    loader?.let { loader ->
                        loader.setCanceledOnTouchOutside(true)
                        loader.setCancelable(false)
                        loader.show()
                    }

                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }

        fun hideDialog() {
            if (loader != null && loader?.isShowing!!) {
                loader = try {
                    loader?.dismiss()
                    null
                } catch (e: Exception) {
                    null
                }
            }
        }
    }
}