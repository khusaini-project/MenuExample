package muhmmad.khusaini.intentexample3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle = intent.getBundleExtra("main activity data")

        val height = bundle.getFloat("height")
        val weight = bundle.getFloat("weight")
        txt_intentdata.text = "Height: $height | Weight: $weight"
        btn_calculate.setOnClickListener
    }
}