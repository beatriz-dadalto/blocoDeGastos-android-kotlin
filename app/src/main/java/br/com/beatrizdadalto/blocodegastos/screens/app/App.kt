package br.com.beatrizdadalto.blocodegastos.screens.app

import android.app.Application
import br.com.beatrizdadalto.blocodegastos.database.AppDatabase

class App : Application() {

    lateinit var db: AppDatabase

    override fun onCreate() {
        super.onCreate()
        db = AppDatabase.getDatabase(this)
    }
}