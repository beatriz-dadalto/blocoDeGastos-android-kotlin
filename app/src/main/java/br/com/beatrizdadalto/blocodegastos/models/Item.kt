package br.com.beatrizdadalto.blocodegastos.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Item(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "item_id")
    val itemId: Long = 0,
    @ColumnInfo(name = "expense_block_id") val expenseBlockId: Long,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "category") val category: String,
    @ColumnInfo(name = "price") val price: Double,
    @ColumnInfo(name = "created_at") val createdAt: Date
)
