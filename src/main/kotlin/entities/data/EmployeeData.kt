package entities.data

import entities.enums.AccessLevels

data class EmployeeData(
    val id: String,
    val accessLevel: AccessLevels,
    val firstName: String,
    val lastName: String,
    val phoneNumber: Number,
    val birthYear: Short,
    val breakInfo: MutableList<BreakData>
)