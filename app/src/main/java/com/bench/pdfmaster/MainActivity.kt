package com.bench.pdfmaster

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val text = TextView(this).apply {
            text = "التقييم و الجمع - يعمل بنجاح"
            textSize = 30f
            setPadding(50, 50, 50, 50)
        }
        setContentView(text)
    }
}
