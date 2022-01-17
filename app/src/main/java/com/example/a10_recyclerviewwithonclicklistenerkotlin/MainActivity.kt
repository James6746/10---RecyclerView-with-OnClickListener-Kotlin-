package com.example.a10_recyclerviewwithonclicklistenerkotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.example.a6_recyclerviewinsidenestedscrollviewkotlin.User
import com.example.a6_recyclerviewinsidenestedscrollviewkotlin.UserAdapter
import java.util.ArrayList

class MainActivity : AppCompatActivity() {


    lateinit var userArrayList: ArrayList<User>
    lateinit var userAdapter: UserAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        userArrayList = ArrayList()
        userAdapter = UserAdapter(this, userArrayList)

        for (i in 0..49) {
            userArrayList.add(User("James"))
        }
        recyclerView.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false))
        recyclerView.setAdapter(userAdapter)
        recyclerView.setNestedScrollingEnabled(true)
    }

    fun showToast(context: Context, position: Int, name: String){
        Toast.makeText(context, "$position    $name", Toast.LENGTH_SHORT).show()
    }
}