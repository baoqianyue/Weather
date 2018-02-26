package com.barackbao.weather.ui.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.barackbao.weather.domain.model.ForecastList

/**
 * Created by BarackBao on 2018/2/25.
 */
class ForecastListAdapter(val weekForecast: ForecastList) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun getItemCount(): Int = weekForecast.size()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(weekForecast[position]) {
            holder.textview.text = "$date - $description - $high - $low"
        }
    }

    class ViewHolder(val textview: TextView) : RecyclerView.ViewHolder(textview) {

    }
}