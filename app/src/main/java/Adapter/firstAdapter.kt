package Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class firstAdapter(var mList: List<first>):
    RecyclerView.Adapter<firstAdapter.LanguageViewHolder>() {
    inner class LanguageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTv : TextView = itemView.findViewById(R.id.Text_prophy1)

    }

    fun setFilteredList(mList: List<first>){
        this.mList = mList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.exampl_1 , parent , false)
        return LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        holder.titleTv.text = mList[position].tex
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}