package util.validation

import entities.data.EmployeeData
import util.Logger
import java.lang.Exception

class InputValidation private constructor() {

    companion object {

        fun checkBirthYear(birthYear: Int) {
            if (birthYear !in 1900..2024) throw Exception("${Logger.error("birth validation","please enter a number between 1900 & 2024")}")
        }

        fun checkPhoneNumber(number: Long) {
            if (!(number.toString().startsWith("09") || number.toString().length == 10)) throw Exception("${Logger.error("phone validation", "please enter a valid phone number")}")
        }

        fun checkNationalCode(code: String) {
            if (code.length != 10) throw Exception("${Logger.error("national code validation", "please enter a valid national code")}")
        }

        fun checkEmployeeExistence(nationalCode: String,employee: MutableList<EmployeeData>) {

            val checker = employee.filter { it.id == nationalCode }

            if (checker.isNotEmpty()) {
                throw Exception("${Logger.error("id validation", "employee with this id exists")}")
            } else return

        }

    }

}