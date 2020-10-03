package com.example.newyorktimesbestsellerbooks.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newyorktimesbestsellerbooks.R
import com.example.newyorktimesbestsellerbooks.data.model.Book
import kotlinx.android.synthetic.main.item_book.view.*

class BooksAdapter(
    private val books:List<Book>
) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, view: Int): BooksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book,parent, false)
        return BooksViewHolder(view)
    }

    override fun getItemCount() = books.count()

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        holder.bindView(books[position])
    }

    class BooksViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val title = itemView.textTitle
        private val author = itemView.textAuthor

        fun bindView(book: Book){
            title.text = book.title
            author.text = book.author
        }
    }
}