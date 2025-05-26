package vcmsa.alvin.imadst10486137assignment2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class QuizResults : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz_results)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//end of ViewConpat
        //code goes here
        //link the elements from the GUI to the backend
        val editTextPoints = findViewById<TextView>(R.id.editTextPoints)
        val score = intent.getIntExtra("score",0)
        val btnReview = findViewById<TextView>(R.id.btnReview)
        val btnExit = findViewById<TextView>(R.id.btnExit)
        //code logic
        quizScore.text = "$review your score is $score"
        btnExit.setOnClickListener {
            finish()
        }
    }//end of onCreate
}//end of ResultActivity