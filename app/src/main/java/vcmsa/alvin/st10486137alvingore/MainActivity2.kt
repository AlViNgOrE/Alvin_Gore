package vcmsa.alvin.st10486137alvingore

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    // Parallel arrays
       val songTitle = ArrayList<String>()
       val artist = ArrayList<String>()
       val ratings = ArrayList<String>()
       val comments = ArrayList<Sting>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //view items declared
        val songTitle = findViewByID<TextView>(R.id.editTextName)
        val artist = findVIewByID<TextView>(R.id.editTextArtist)
        val ratings = findViewByID<TextView>(R.id.editTextRating)
        val comments = findViewByID<TextView>(R.id.editTextComments)
        val addtoplaylist = findViewByID<Button>(R.id.btnButton2)
        val navigate = findViewByID<Button>(R.id.btnButton3)
        val exit = findViewByID<Button>(R.id.btnButton4)

        val songTitle = intent.getStringArrayListExtra("songTitle")?: arrayListOf()
        val artist = intent.getStringArrayListExtra("artist")?: arrayListOf()
        val ratings = intent.getStringArrayListExtra("ratings")?: arrayListOf()
        val comments = intent.getStringArrayListExtra("comments")?: arrayListOf()

        builder.setPositiveButton("Add")
        val name = itemName.text.toString()
        val cat = category.text.toString()
        vat qty = quantity.text.toString()
        val comment = comment.text.toString()

         if (name.isEmpty() || rate.isEmpty() || quantity.isEmpty() {
             Toast.makeText(this, "Please enter valid item details", Toast.return setPositiveButton)


    }
             ItemTitle.add()
             artist.add()
             ratings.add()
             comments.add()

             builder.setClickButton("Cancel", null)
             builder.show()


    }
}