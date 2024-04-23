package secondActivity

import Adapter.first
import Adapter.firstAdapter
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import java.util.ArrayList
import java.util.Locale

class prophilActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private lateinit var searchView: SearchView
    private var mList = ArrayList<first>()
    private lateinit var adapter: firstAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prophil)

        recyclerView = findViewById(R.id.Recycler_View)



        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            recyclerView = findViewById(R.id.Recycler_View)

            recyclerView.setHasFixedSize(true)
            recyclerView.layoutManager = LinearLayoutManager(this)
            adapter = firstAdapter(mList)
            recyclerView.adapter = adapter


        }

        private fun filterList(query: String?) {

            if (query != null) {
                val filteredList = ArrayList<first>()
                for (i in mList) {
                    if (i.tex.lowercase(Locale.ROOT).contains(query)) {
                        filteredList.add(i)
                    }
                }

                if (filteredList.isEmpty()) {
                    Toast.makeText(this, "No Data found", Toast.LENGTH_SHORT).show()
                } else {
                    adapter.setFilteredList(filteredList)
                }
            }
        }

        private fun addDataToList() {
            mList.add(first("Java", #479696,#F5F9F9))

        }
    }
}