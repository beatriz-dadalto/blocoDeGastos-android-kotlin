package br.com.beatrizdadalto.blocodegastos.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import br.com.beatrizdadalto.blocodegastos.models.ExpenseBlock
import br.com.beatrizdadalto.blocodegastos.models.ExpenseBlockWithItems

@Dao
interface ExpenseBlockDAO {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insertExpenseBlock(expenseBlock: ExpenseBlock)

    @Query(value = "SELECT * FROM ExpenseBlock WHERE title = :title")
    fun getExpenseBlockByTitle(title: String): List<ExpenseBlock>

    @Delete
    fun deleteExpenseBlock(expenseBlock: ExpenseBlock): Int

    @Update
    fun updateExpenseBlock(expenseBlock: ExpenseBlock)

}