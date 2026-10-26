package com.example.ciudadactivabase.data.model

data class UsuarioDto(
    val id: Long = 0,
    val nombre: String = "",
    val email: String = "",
    val rol: Rol = Rol.CIUDADANO,
    val activo: Boolean = true,
    val contadorRechazosSpam: Int = 0
)