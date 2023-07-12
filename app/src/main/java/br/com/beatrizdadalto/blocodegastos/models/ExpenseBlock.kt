package br.com.beatrizdadalto.blocodegastos.models

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExpenseBlock(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "expense_block_id")
    val expenseBlockId: Long = 0,
    @ColumnInfo(name = "title")
    val title: String
)
