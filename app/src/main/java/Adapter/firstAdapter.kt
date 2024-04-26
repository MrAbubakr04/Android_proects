package Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.Exampl1Binding

class firstAdapter :RecyclerView.Adapter<firstAdapter.textHolder>(){
    val texList = ArrayList<first>()
    class textHolder(item:View):RecyclerView.ViewHolder (item){
        val binding = Exampl1Binding.bind(item)
        fun bind(aa:first ) = with(binding){
            Textprophy1.text = aa.tex
            Textprophy1.setTextColor(aa.colortex)
            RalativeLayoutprophy1.setBackgroundColor(aa.colorMaterialCard)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): textHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.exampl_1,parent, false)
        return textHolder(view)
    }

    override fun getItemCount(): Int {
        return texList.size
    }

    override fun onBindViewHolder(holder: textHolder, position: Int) {
        holder.bind(texList[position])
    }

    fun adddata(dat:first){
        texList.add(dat)
        notifyDataSetChanged()
    }

}