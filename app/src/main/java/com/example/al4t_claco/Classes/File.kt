package com.example.al4t_claco.Classes

import java.io.Serializable

class File (name: String, type: String): Serializable{
    val name = name
    val type = type
    val fullName = "$name.$type"
}