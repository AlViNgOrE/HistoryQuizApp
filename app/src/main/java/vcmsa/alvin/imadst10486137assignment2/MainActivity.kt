package vcmsa.alvin.imadst10486137assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.editTextFive)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//end of ViewConpat
        //code goes here
        //link the elements from the GUI to the backend
        val editUsername = findViewById<EditText>(R.id.editUsername)
        val btnStartQuiz = findViewById<Button>(R.id.btnStartQuiz)
        //retrieve the data from the elements
        val username = editUsername.text.toString()
        if(username.isEmpty())
        btnStartQuiz.setOnClickListner{
            //start the quiz activity
            val intent = Intent(this,  QuizActivity::class.java).putExtra("username",username)
            startActivity(intent)
            finish()
        }
    }//end of onCreate
}//end of MainActivity