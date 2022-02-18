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
        val charadesButton: Button = findViewById(R.id.button) // variable identifiers should be written in camelCase (small first letter)

        /* Create an array to store the charade nouns inside */
        //Prefer more descriptive identifiers
        val charadesList = arrayOf<String>("Elephant", "Airplane", "Spiderman", "Frankenstein", "Staircase", "Rabbit", "Climbing", "Running", "Baseball", "Itchy" )

        /* Creates a variable to store the array length inside, which we can use later to generate a random number */
//        val myArrayValue = charadesList.size - 1 //Same here - this should be a more descriptive name

        /* Add an onclick listener to the button, so that we can modify the text and display a different array element containing a charade prompt */
        charadesButton.setOnClickListener {
            /* Store text view inside a variable */
            val resultTextView: TextView = findViewById(R.id.charade_text)

            // The following would be more idiomatic:
            resultTextView.text = charadesList.random()
        }
    }

    /* Shuffle is used to generate us a random number, very similar to how it was used in the dice tutorial, but instead of rolling dice i am using it to manipulate
    my array to display various strings stored inside!
     */
    // Shuffle is unnecessary since the random() method can be applied directly to your array.


}


