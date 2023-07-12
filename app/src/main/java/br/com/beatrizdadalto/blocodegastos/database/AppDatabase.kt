package br.com.beatrizdadalto.blocodegastos.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import br.com.beatrizdadalto.blocodegastos.dao.ExpenseBlockDAO
import br.com.beatrizdadalto.blocodegastos.dao.ExpenseBlockWithItemsDAO
import br.com.beatrizdadalto.blocodegastos.dao.ItemDAO
import br.com.beatrizdadalto.blocodegastos.models.ExpenseBlock
import br.com.beatrizdadalto.blocodegastos.models.ExpenseBlockWithItems
import br.com.beatrizdadalto.blocodegastos.models.Item
import br.com.beatrizdadalto.blocodegastos.utils.DateConverter

@Database(entities = [ExpenseBlock::class, Item::class, ExpenseBlockWithItems::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun itemDao(): ItemDAO
    abstract fun expenseBlockDao(): ExpenseBlockDAO
    abstract fun expenseBlockWithItemsDao(): ExpenseBlockWithItemsDAO

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context) : AppDatabase {
            return if (INSTANCE == null) {
                synchronized(this) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "db_blocodegastos"
                    ).build()
                }
                INSTANCE as AppDatabase
            } else {
                INSTANCE as AppDatabase
            }
        }
    }
}