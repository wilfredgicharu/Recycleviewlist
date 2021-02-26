 package com.example.recycleviewlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todoList= mutableListOf(
            Todo("computer repair",true),
            Todo("software engineering" ,false),
            Todo("Operating Ststem",true),
            Todo("data structures ", true),
            Todo("android development" ,false),
                    Todo("computer repair",true),
        Todo("software engineering" ,false),
        Todo("Operating Ststem",true),
        Todo("data structures ", true),
        Todo("android development" ,false)
        )

        val adapter= todoAdapter(todoList)
        rvToDo.adapter=adapter
        rvToDo.layoutManager=LinearLayoutManager(this)

        btnaddTODO.setOnClickListener {
            val title=etToDo.text.toString()
            val todo =Todo(title,false)

            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size-1)
        }
    }
}