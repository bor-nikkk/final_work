package com.bornikkk.finalwork

import android.app.Activity
import android.content.ClipDescription
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.core.content.ContextCompat.startActivity




class AboutViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(aboutName: String){

        val aboutTextView : TextView = itemView.findViewById(R.id.about_text_view)
        val aboutButton: Button = itemView.findViewById(R.id.send_button)

        aboutTextView.text = aboutName

        //itemView.setOnClickListener {
        //    Toast.makeText(itemView.context, aboutName, Toast.LENGTH_LONG).show()
        //}

        aboutButton.setOnClickListener {

            //val link = Uri.parse(aboutName)
            val link = Uri.parse("https://ya.ru/")
            val intent = Intent(Intent.ACTION_VIEW, link)
            Activity().startActivity(intent)

            //val intent = Intent(Intent.ACTION_SEND)
            //intent.type = "text/plain"
            //intent.putExtra(Intent.EXTRA_SUBJECT, "Пиьстмо из приложения")
            //intent.putExtra(Intent.EXTRA_EMAIL, aboutName)
            //Activity().startActivity(Intent.createChooser(intent, "Sharing something."))

        }
    }

}