package com.example.tictactoegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.tictactoegame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var player = "p1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.b1.setOnClickListener {
            buttonclick(binding.b1)
        }
        binding.b2.setOnClickListener {
            buttonclick(binding.b2)
        }
        binding.b3.setOnClickListener {
            buttonclick(binding.b3)
        }
        binding.b4.setOnClickListener {
            buttonclick(binding.b4)
        }
        binding.b5.setOnClickListener {
            buttonclick(binding.b5)
        }
        binding.b6.setOnClickListener {
            buttonclick(binding.b6)
        }
        binding.b7.setOnClickListener {
            buttonclick(binding.b7)
        }
        binding.b8.setOnClickListener {
            buttonclick(binding.b8)
        }
        binding.b9.setOnClickListener {
            buttonclick(binding.b9)
        }

        binding.btnReset.setOnClickListener {
            reset()
        }
    }

    fun buttonclick(btn: Button) {
        if (btn.text == "") {
            if (player == "p1") {
                player = "p2"
                btn.text = "X"
            } else {
                player = "p1"
                btn.text = "O"
            }
        }
        win()
    }

    fun win() {
        if (binding.b1.text == "X" && binding.b2.text == "X" && binding.b3.text == "X") {
            toast("X won the Game")
        }
        if (binding.b1.text == "O" && binding.b2.text == "O" && binding.b3.text == "O") {
            toast("O won the Game")
        }
        if (binding.b4.text == "X" && binding.b5.text == "X" && binding.b6.text == "X") {
            toast("X won the Game")
        }
        if (binding.b4.text == "O" && binding.b5.text == "O" && binding.b6.text == "O") {
            toast("O won the Game")
        }
        if (binding.b7.text == "X" && binding.b8.text == "X" && binding.b9.text == "X") {
            toast("X won the Game")
        }
        if (binding.b7.text == "O" && binding.b8.text == "O" && binding.b9.text == "O") {
            toast("O won the Game")
        }
        if (binding.b1.text == "X" && binding.b5.text == "X" && binding.b9.text == "X") {
            toast("X won the Game")
        }
        if (binding.b1.text == "O" && binding.b5.text == "O" && binding.b9.text == "O") {
            toast("O won the Game")
        }
        if (binding.b3.text == "X" && binding.b5.text == "X" && binding.b7.text == "X") {
            toast("X won the Game")
        }
        if (binding.b3.text == "O" && binding.b5.text == "O" && binding.b7.text == "O") {
            toast("O won the Game")
        }
        if (binding.b1.text == "X" && binding.b4.text == "X" && binding.b7.text == "X") {
            toast("X won the Game")
        }
        if (binding.b1.text == "O" && binding.b4.text == "O" && binding.b7.text == "O") {
            toast("O won the Game")
        }
        if (binding.b2.text == "X" && binding.b5.text == "X" && binding.b8.text == "X") {
            toast("X won the Game")
        }
        if (binding.b2.text == "O" && binding.b5.text == "O" && binding.b8.text == "O") {
            toast("O won the Game")
        }
        if (binding.b3.text == "X" && binding.b6.text == "X" && binding.b9.text == "X") {
            toast("X won the Game")
        }
        if (binding.b3.text == "O" && binding.b6.text == "O" && binding.b9.text == "O") {
            toast("O won the Game")
        }
    }

    fun toast(msg: String) {
        Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
    }

    fun reset() {
        binding.b1.text = ""
        binding.b2.text = ""
        binding.b3.text = ""
        binding.b4.text = ""
        binding.b5.text = ""
        binding.b6.text = ""
        binding.b7.text = ""
        binding.b8.text = ""
        binding.b9.text = ""
    }
}