package jp.techacademy.masaki.onoue.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("尾上将輝", 20, "読書")

        human.say()

        val human2 = Human("尾上将輝", 20, "プログラミング")

        human2.think()


    }
}