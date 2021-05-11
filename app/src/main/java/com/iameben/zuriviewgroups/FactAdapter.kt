package com.iameben.zuriviewgroups

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class FactAdapter(context: Context, facts:List<FactModel>): ArrayAdapter<FactModel>(context, 0, facts) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        val fact = getItem(position)
        if(view == null){
            view = LayoutInflater.from(parent.context).inflate(R.layout.fact_item, parent, false)
        }
        val logo = view?.findViewById<ImageView>(R.id.image_logo)
        val name = view?.findViewById<TextView>(R.id.name)
        fact?.logo?.let{
            logo?.setImageResource(fact.logo)
        }
        name?.text = fact?.name


        return view!!
    }

}