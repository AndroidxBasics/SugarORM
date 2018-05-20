package com.mychatapp.lubuntupc.sugartest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.orm.SugarRecord
import kotlinx.android.synthetic.main.activity_main.*
import com.orm.SugarRecord.listAll



class MainActivity : AppCompatActivity() {

    var adapter: BookListAdapter? = null
    var layoutManager: RecyclerView.LayoutManager? = null
    var books: MutableList<Book>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO LIST
        books = SugarRecord.listAll(Book::class.java)



        adapter = BookListAdapter(books!!, this)
        layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager

        adapter!!.notifyDataSetChanged()
        if (eT1.text != null) {
            buttonSave.setOnClickListener {
                var titletV = eT1.text.toString()
                var book = Book( titletV )
                book.save()
                books!!.add(book)
                adapter!!.notifyItemInserted(books!!.size)

                Toast.makeText(this, "$titletV saved!", Toast.LENGTH_LONG).show()

                //odświeża całe recyclerView
                //recyclerView.adapter = adapter

//                recyclerView.setAdapter( BookListAdapter(books!!, this));
//                recyclerView.invalidate();
            }
        }

    }
}

