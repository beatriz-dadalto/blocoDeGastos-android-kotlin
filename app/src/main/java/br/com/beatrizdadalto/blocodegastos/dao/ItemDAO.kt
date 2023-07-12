package br.com.beatrizdadalto.blocodegastos.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.beatrizdadalto.blocodegastos.models.Item

@Dao
interface ItemDAO {

    @Insert
    fun insertItem(item: Item)

    @Query(value = "SELECT * FROM Item")
    fun getAllItems(): List<Item>

    @Delete
    fun deleteItem(item: Item): Int

    @Update
    fun updateItem(item: Item)
}