package com.example.gettingeasier

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val skillsList = getList()
        val skillsAdapter = SkillsAdapter(this, skillsList)
        main_recyclerView.layoutManager =
            GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false)
        main_recyclerView.adapter = skillsAdapter
    }

    private fun getList(): ArrayList<Skills> {
        val skillsList: ArrayList<Skills> = ArrayList()
        skillsList.add(Skills("C++", 4.0F, R.drawable.csharp))
        skillsList.add(Skills("C#", 3.0F, R.drawable.cplus))
        skillsList.add(Skills("Python", 4.5F, R.drawable.python))
        skillsList.add(Skills("Cow", 0F, R.drawable.cow))
        skillsList.add(Skills("HTML", 3.5F, R.drawable.html))
        skillsList.add(Skills("GOLang", 3.5F, R.drawable.golang))
        skillsList.add(Skills("Java", 4.0F, R.drawable.java))
        skillsList.add(Skills("Kotlin", 4.5f, R.drawable.kotlin))
        skillsList.add(Skills("Lua", 5f, R.drawable.lua))
        skillsList.add(Skills("ruby", 4f, R.drawable.ruby))
        return skillsList
    }

}