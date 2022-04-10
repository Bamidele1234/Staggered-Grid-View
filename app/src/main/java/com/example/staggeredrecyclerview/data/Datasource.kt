package com.example.staggeredrecyclerview.data

import com.example.staggeredrecyclerview.R
import com.example.staggeredrecyclerview.Model.RecyclerModel

/**
 * Create a class that holds the values to be displayed
 */
class Datasource {
    fun loadValues(): List<RecyclerModel> {

        return listOf (
            RecyclerModel(R.drawable.batman),
            RecyclerModel(R.drawable._bd0daa6_270e_404b_a36f_2c2e1d9aedff),
            RecyclerModel(R.drawable._prototype_),
            RecyclerModel(R.drawable.castlevania_gallery),
            RecyclerModel(R.drawable.e832910a_5b8d_40e4_9bdb_cb230b68d1e0),
            RecyclerModel(R.drawable.poster_anakin_ft_darth_vader),
            RecyclerModel(R.drawable.pubg_backgrounds),
            RecyclerModel(R.drawable.sypha_belnades___castlevania),
            RecyclerModel(R.drawable.warhammer_40k_artwork__photo),
            RecyclerModel(R.drawable.airforce1),
            RecyclerModel(R.drawable.castle),
            RecyclerModel(R.drawable.gas_mask),
            RecyclerModel(R.drawable.senku),
            RecyclerModel(R.drawable.pubg1),
            RecyclerModel(R.drawable.the_joker),
            RecyclerModel(R.drawable.venom),
        )
    }
}