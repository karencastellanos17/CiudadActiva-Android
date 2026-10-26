package com.example.ciudadactivabase.data.remote

import com.example.ciudadactivabase.data.model.*
import retrofit2.Response
import retrofit2.http.*

interface ApiService {
    @GET("api/reportes")
    suspend fun getReportes(): List<ReporteDto>

    @POST("api/reportes")
    suspend fun crearReporte(@Body request: ReporteRequest): Response<ReporteDto>

    @GET("api/health")
    suspend fun checkHealth(): Response<Map<String, String>>
}
