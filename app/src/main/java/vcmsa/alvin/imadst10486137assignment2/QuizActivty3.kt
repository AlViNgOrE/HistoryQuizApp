package vcmsa.alvin.imadst10486137assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class QuizActivty3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz_activty3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.editTextFive)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//end of ViewConpat
        //code goes here
        //link the elements from the GUI to the backend
        val editTextTextThree = findViewById<TextView>(R.id.editTextTextThree)
        val editTextTextThreeAnswer = findViewById<TextView>(R.id.editTextTextThree)
        val btnCorrectTwo = findViewById<Button>(R.id.btnCorrectTwo)
        //Arrays of Questions and Answers
        val historyQuestions = arrayOf(
            "Is the dodo bird extinct?",
            "The South African flag has 8 colours?",
            "Mandela was imprisoned for 25 years?",
            "There are 7 continents in the world?",
            "World War 1 broke out in 1914?"
        )
        val answerChoices = arrayOf(
            arrayOf("True","False"),
            arrayOf("True","False"),
            arrayOf("True","False"),
            arrayOf("True","False"),
            arrayOf("True","False")
        )
        var userAnswers =arrayOfNulls<String>(5)
        val correctAnswers = arrayOf(
            "True",
            "True",
            "False",
            "True",
            "False"
        )
        var counter = 0
        //code logic goes here
        btnNext.setOnClickListner {
        val username = intent.getStringExtra("username")
        while (counter < 5) {

            historyActivity.text = historyQuestion[counter]{

            }
            var selectedOption = findViewById<Button>(R.id.btnCorrectTwo)
            if (selectedOption != -1) {
                val btnCorrectTwo = findViewById<Button>(R.id.btnCorrectTwo)
                userAnswers[counter] = selectedbtn.text.toString()
                counter++
            }else {
                Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show()
            }

        }
          else {
              val intent = Intent(this, ResultActivity::class.java)
              var score = 0
              for (i in 0 until userAnswers.size) {
                  if (userAnswer[1] == correctAnswer[1]) {
                      score++
                  }
                  intent.putExtra("score", score)
              }
            startActivity(intent)
            finish()
        }
        }
    }//end of OnCreate
}//end of QuizActivity