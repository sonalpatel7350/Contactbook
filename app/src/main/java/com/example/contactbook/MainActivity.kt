package com.example.contactbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)

        val users = ArrayList<User>()
        users.add(User("Sonal","1234567889",3))
        users.add(User("Prajakta","7542467892",3))
        users.add(User("Dev","8976432756",1))
        users.add(User("Amar","1753257889",1))
        users.add(User("Yash","1234542466",1))
        users.add(User("Nihar","8644567889",1))
        users.add(User("Nehal","9765423467",3))
        users.add(User("Mahek","1234567891",3))
        users.add(User("kiran","1234567889",3))
        users.add(User("Ashu","6543256789",1))
        users.add(User("Avani","1222222222",3))
        users.add(User("Raghav","1987542315",1))
        users.add(User("kritika","1298765432",3))

        val adapter = CustomAdapter(users)
        recyclerView.adapter = adapter
    }

}