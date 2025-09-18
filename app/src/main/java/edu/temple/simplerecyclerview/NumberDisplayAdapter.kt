package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(val number : Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>()/* TODO Step 3a: Provide Adapter Parent */ {
    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NumberViewHolder {
        return NumberViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(
        holder: NumberViewHolder,
        position: Int
    ) {
        holder.textView.text =  number[position].toString()
        holder.textView.textSize = number[position].toString().toFloat()
    }

    override fun getItemCount(): Int {
        return number.size
    }
}