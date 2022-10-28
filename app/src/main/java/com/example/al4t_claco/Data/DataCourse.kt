package com.example.al4t_claco.Data

import com.example.al4t_claco.Classes.Course

data class DataCourse(private val course: Course) {

    val name = course.name
    val code = course.code
    val year = course.year.toString()
    val credits = course.credits.toString()
    val courseLeader = course.courseLeader
    val description = course.description


}