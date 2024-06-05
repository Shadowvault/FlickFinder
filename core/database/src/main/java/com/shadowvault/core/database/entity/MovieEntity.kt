package com.shadowvault.core.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MovieEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val isLiked: Boolean
)
