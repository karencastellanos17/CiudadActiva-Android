package com.example.ciudadactivabase.data.model

data class ReporteDto(
    val id: Long = 0,
    val descripcion: String = "",
    val estado: EstadoReporte = EstadoReporte.PENDIENTE,
    val prioridadOficial: Prioridad = Prioridad.BAJA,
    val latitud: Double = 0.0,
    val longitud: Double = 0.0,
    val direccion: String = "",
    val fechaCreacion: String = "",
    val fechaLimiteSLA: String? = null,
    val usuarioId: Long = 0,
    val categoriaId: Long = 0
)

data class ReporteRequest(
    val descripcion: String,
    val categoriaId: Long,
    val direccion: String,
    val latitud: Double = 4.8583,
    val longitud: Double = -74.0583,
    val rutaFotografiaOpcional: String? = null
)