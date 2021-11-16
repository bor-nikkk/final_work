package com.bornikkk.finalwork

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class AboutFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)

        val aboutNameList:List<String> = listOf("bornikkk@mail.ru", "bornikkk@yandex.ru", "bornikkk@gmx.de")

        val aboutRecyclerView:RecyclerView =view.findViewById(R.id.about_recycler_view)

        aboutRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)


        aboutRecyclerView.adapter = AboutAdapter(aboutNameList, requireActivity())
        return view
    }


}