package secondActivity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.myapplication.R
import androidx.appcompat.widget.Toolbar
class SecondPerevodsActivity : AppCompatActivity(){
    private var but: AppCompatButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_perevods_second)
        val toolbar:Toolbar = findViewById(R.id.humo_perevod_toolbar1)
        setSupportActionBar(toolbar)// Показать кнопку возврата назад
        supportActionBar?.setDisplayShowTitleEnabled(false)// Удалить заголовок

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener {
            onBackPressed() // При клике на кнопку возврата назад будет вызываться метод onBackPressed()
        }
    }
}