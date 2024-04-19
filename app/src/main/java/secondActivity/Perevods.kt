package secondActivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class Perevods : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_perevods_first)
        val button:com.google.android.material.button.MaterialButton = findViewById(R.id.humo_perevod_botton1)
        button.setOnClickListener {
            val intent = Intent(this,SecondPerevodsActivity::class.java)
            startActivity(intent)
        }

    }
}