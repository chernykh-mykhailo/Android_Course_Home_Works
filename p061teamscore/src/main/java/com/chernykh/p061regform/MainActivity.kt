package com.chernykh.p061regform

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var teamA = 0
        var teamB = 0
        val teamA_score: TextView = findViewById(R.id.textView3)
        val teamB_score: TextView = findViewById(R.id.textView4)

//TEAM A ADD SCORE
        val teamA_add1: Button = findViewById(R.id.button)
        teamA_add1.setOnClickListener {
            teamA += 1
            teamA_score.text = teamA.toString()
        }
        val teamA_add2: Button = findViewById(R.id.button3)
        teamA_add2.setOnClickListener {
            teamA += 2
            teamA_score.text = teamA.toString()
        }
        val teamA_add3: Button = findViewById(R.id.button2)
        teamA_add3.setOnClickListener {
            teamA += 3
            teamA_score.text = teamA.toString()
        }
//TEAM B ADD SCORE
        val teamB_add1: Button = findViewById(R.id.button9)
        teamB_add1.setOnClickListener {
            teamB += 1
            teamB_score.text = teamB.toString()
        }
        val teamB_add2: Button = findViewById(R.id.button7)
        teamB_add2.setOnClickListener {
            teamB += 2
            teamB_score.text = teamB.toString()
        }
        val teamB_add3: Button = findViewById(R.id.button8)
        teamB_add3.setOnClickListener {
            teamB += 3
            teamB_score.text = teamB.toString()
        }
        // RESET
        val team_score_reset: Button = findViewById(R.id.button10)
        team_score_reset.setOnClickListener {
            teamB = 0
            teamB_score.text = teamB.toString()
            teamA = 0
            teamA_score.text = teamA.toString()
        }
    }
}