package com.example.recycleviewlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.todo_list.view.*

class todoAdapter (
    var todos:List<Todo>
) :RecyclerView.Adapter<todoAdapter.TodoViewHolder> (){
    inner class TodoViewHolder(itemview: View): RecyclerView.ViewHolder(itemview)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.todo_list, parent,false)
        return TodoViewHolder(view)
    }

    override fun getItemCount(): Int {  //this function displays  the size of the list
        return todos.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
     holder.itemView.apply {
         tvTitle.text=todos[position].title
         cbDone.isChecked=todos[position].isChecked
     }
    }
}