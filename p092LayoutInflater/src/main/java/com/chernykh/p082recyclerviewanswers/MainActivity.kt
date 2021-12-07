package com.chernykh.p082recyclerviewanswers

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colors = listOf(Color.GRAY, Color.DKGRAY)
        val users = createListOfUsers()

        val linearLayout = findViewById<LinearLayout>(R.id.linLayout)

        for ((index, user) in users.withIndex()) {
            val item = LayoutInflater.from(this).inflate(
                R.layout.item, linearLayout,
                false
            )

            val name = item.findViewById<TextView>(R.id.question)
            name.text = user.name
            val surname = item.findViewById<TextView>(R.id.answer)
            surname.text = user.surname
            item.setBackgroundColor(colors[index % 2])

            linearLayout.addView(item)
        }
    }
    private fun createListOfUsers(): List<User> {
        val list = mutableListOf<User>()

                list.add(User("Ivan", "Ivanov"))
                list.add(User("Petro", "Petrov"))
                list.add(User("Sidor", "Sidorov"))
                list.add(User("Oleg", "Orlov"))
                list.add(User("Anton", "Antonov"))
                list.add(User("Oleksandr", "Oleksandrov"))

        return list
    }
}
data class User(val name: String, val surname: String)