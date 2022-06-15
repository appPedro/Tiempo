package com.pjurado.tiempo.servidor.model

data class Weather(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String
)