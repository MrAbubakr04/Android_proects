package secondActivity

import Adapter.first
import Adapter.firstAdapter
import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityProphilBinding
import java.util.ArrayList
import java.util.Locale

class prophilActivity : AppCompatActivity() {
    private  val varapadter = firstAdapter()
    private val varadapter = firstAdapter()
    lateinit var binding: ActivityProphilBinding
    private val datatextlist2 = listOf (
        "Analytics",
        "Perfectionism",
        "Analytics"
    )
    private val datatextlist1 = listOf (
        "Perfectionism",
        "Analytics"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProphilBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init1()
        init2()
    }
    @SuppressLint("ResourceType")
    private  fun init1(){
        binding.apply{
            RecyclerView1.layoutManager = LinearLayoutManager(this@prophilActivity,LinearLayoutManager.HORIZONTAL, false)
            RecyclerView1.adapter = varapadter
            val textColor = Color.parseColor("#479696")
            val MaterialCardColor = Color.parseColor("#F5F9F9")
            for (i in datatextlist2){
                val datass = first(i,textColor,MaterialCardColor)
                varapadter.adddata(datass)
            }
        }
    }
    private  fun init2(){
        binding.apply{
            RecyclerView2.layoutManager = LinearLayoutManager(this@prophilActivity,LinearLayoutManager.HORIZONTAL, false)
            RecyclerView2.adapter = varadapter
            val textColor1 = Color.parseColor("#FF7E73")
            val MaterialCardColor1 = Color.parseColor("#FFF4F4")
            for (i in datatextlist1){
                val datass = first(i,textColor1,MaterialCardColor1)
                varadapter.adddata(datass)
            }
        }
    }
}