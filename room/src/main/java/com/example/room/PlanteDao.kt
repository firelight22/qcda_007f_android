package com.example.room

import androidx.room.*

@Dao
interface PlanteDao {
    @Insert
    fun insert(plante: Plante)

    @Query("SELECT * FROM Plante")
    suspend fun getAll() : List<Plante>

    @Query("SELECT * FROM Plante WHERE perenne = :perenne")
    fun getAllPlantesByPerennite(perenne : Boolean): List<Plante>

    @Update
    fun update(plante: Plante)

    @Delete
    fun delete(plante: Plante)
}