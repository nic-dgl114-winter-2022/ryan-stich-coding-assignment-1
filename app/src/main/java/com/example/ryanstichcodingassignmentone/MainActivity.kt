package com.example.ryanstichcodingassignmentone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /* Create a variable to store the button inside */
        val CharadesButton: Button = findViewById(R.id.button)

        /* Create an array to store the charade nouns inside */
        val myArray = arrayOf<String>("Elephant", "Airplane", "Spiderman", "Frankenstein", "Staircase", "Rabbit", "Climbing", "Running", "Baseball", "Itchy" )

        /* Creates a variable to store the array length inside, which we can use later to generate a random number */
        val myArrayValue = myArray.size - 1

        /* Add an onclick listener to the button, so that we can modify the text and display a different array element containing a charade prompt */
        CharadesButton.setOnClickListener {
            /* Store text view inside a variable */
            val resultTextView: TextView = findViewById(R.id.charadetext)
            /* Create our random number variable */
            val rando = shuffle(myArrayValue).randomizer()
            /* Use our random number to depict which charade prompt will be shown */
            resultTextView.text = myArray[rando]
        }
    }

    /* Shuffle is used to generate us a random number, very similar to how it was used in the dice tutorial, but instead of rolling dice i am using it to manipulate
    my array to display various strings stored inside!
     */
    class shuffle(val numSides: Int) {

        fun randomizer(): Int {
            return (1..numSides).random()
        }
    }



}


