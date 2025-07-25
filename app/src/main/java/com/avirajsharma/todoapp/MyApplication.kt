package com.avirajsharma.todoapp

import android.app.Application
import androidx.room.Room
import com.avirajsharma.todoapp.db.TodoDatabase

class MyApplication : Application() {


    companion object {
        lateinit var todoDatabase: TodoDatabase
    }

    override fun onCreate() {
        super.onCreate()
        todoDatabase = Room.databaseBuilder(
            applicationContext,
            TodoDatabase::class.java,
            TodoDatabase.NAME
        ).build()
    }

}