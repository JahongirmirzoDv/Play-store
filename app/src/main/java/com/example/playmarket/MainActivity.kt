package com.example.playmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.playmarket.adapters.RvAdapter
import com.example.playmarket.utils.Apps
import com.example.playmarket.utils.Data
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var list: ArrayList<Data>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()
        val rvAdapter = RvAdapter(list)
        recyclerView.adapter = rvAdapter
    }

    private fun loadData() {
        list = ArrayList()
        val apps1 = Apps(R.drawable.discord, "Discord-Talk, Video, Chat & Hang Out", "77 Mb")
        val apps2 = Apps(R.drawable.spotify, "Spotify: Listen to podcast $ find", "29 Mb")
        val apps3 = Apps(R.drawable.telegram, "Telegram", "25 Mb")
        val apps4 = Apps(R.drawable.snapchat, "Snapchat", "55 Mb")
        val apps5 = Apps(R.drawable.instagram, "Instagram", "37 Mb")
        val apps6 = Apps(R.drawable.facebook, "Facebook", "58 Mb")
        val apps7 = Apps(R.drawable.pinterest, "Pinterest", "21 Mb")
        val apps8 = Apps(R.drawable.mesenger, "Messenger - Text and video Chat", "42 Mb")
        val apps9 = Apps(R.drawable.imo, "imo free video calls and chat", "32 Mb")
        val apps10 = Apps(R.drawable.github, "GitHub", "6.5 Mb")
        list.add(
            Data(
                "Recommmended for you",
                R.drawable.right,
                arrayListOf(apps1, apps2, apps3, apps4, apps9)
            )
        )
        list.add(
            Data(
                "Suggested for you",
                R.drawable.right,
                arrayListOf(apps5, apps6, apps7, apps8, apps10)
            )
        )
        list.add(
            Data(
                "You might like...",
                R.drawable.right,
                arrayListOf(apps1, apps2, apps3, apps4, apps9)
            )
        )
        list.add(
            Data(
                "Recently updated",
                R.drawable.right,
                arrayListOf(apps5, apps6, apps7, apps8, apps10)
            )
        )
    }
}