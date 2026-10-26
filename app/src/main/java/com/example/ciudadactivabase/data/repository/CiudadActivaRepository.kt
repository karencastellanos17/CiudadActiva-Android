package com.example.ciudadactivabase.data.repository

import com.example.ciudadactivabase.data.model.*
import com.example.ciudadactivabase.data.remote.RetrofitClient

class CiudadActivaRepository {
    private val api = RetrofitClient.apiService

    suspend fun getReportes() = api.getReportes()
    suspend fun crearReporte(request: ReporteRequest) = api.crearReporte(request)
}