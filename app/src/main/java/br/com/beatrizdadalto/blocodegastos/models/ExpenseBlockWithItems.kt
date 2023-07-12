package br.com.beatrizdadalto.blocodegastos.models

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Relation

data class ExpenseBlockWithItems(
    @Embedded
    val expenseBlock: ExpenseBlock,
    @Relation(
        parentColumn = "expenseBlockId",
        entityColumn = "itemId"
    )
    val items: List<Item>
)
