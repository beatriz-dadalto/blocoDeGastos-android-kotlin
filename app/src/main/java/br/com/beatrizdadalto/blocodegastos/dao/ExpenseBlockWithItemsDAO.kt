package br.com.beatrizdadalto.blocodegastos.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import br.com.beatrizdadalto.blocodegastos.models.ExpenseBlockWithItems

@Dao
interface ExpenseBlockWithItemsDAO {

    @Transaction
    @Query("SELECT * FROM ExpenseBlock")
    fun getExpenseBlocksWithItems(): List<ExpenseBlockWithItems>

}
