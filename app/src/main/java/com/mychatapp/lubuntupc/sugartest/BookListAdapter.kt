package com.mychatapp.lubuntupc.sugartest

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by lubuntupc on 18.12.17.
 */
class BookListAdapter(private var list: MutableList<Book>, private var context: Context): RecyclerView.Adapter<BookListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, position: Int): ViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.list_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bindItem(list[position])
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var bookText = itemView.findViewById<TextView>(R.id.myBookTv)

        fun bindItem(book: Book) {
            bookText.text = book.title
        }
    }
}