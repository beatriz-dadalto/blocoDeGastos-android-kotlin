package br.com.beatrizdadalto.blocodegastos.utils

import androidx.room.TypeConverter
import java.util.Date

object DateConverter {

    // when search on DB
    @TypeConverter
    fun toDate(dateLong: Long?): Date? {
        return if (dateLong != null) Date(dateLong) else null
    }

    // when save on DB
    @TypeConverter
    fun fromDate(date: Date): Long? {
        return date?.time
    }
}