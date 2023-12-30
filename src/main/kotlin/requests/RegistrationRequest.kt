package requests

import entities.data.EmployeeData
import entities.enums.AccessLevels
import util.Logger
import util.validation.InputValidation.Companion.checkBirthYear
import util.validation.InputValidation.Companion.checkEmployeeExistence
import util.validation.InputValidation.Companion.checkNationalCode
import util.validation.InputValidation.Companion.checkPhoneNumber

class RegistrationRequest private constructor() {
    companion object {

        fun registerNewEmployee(employee: MutableList<EmployeeData>) {

            Logger.info("registration","please enter your national code")
            val nationalCode = readLine()!!
            checkNationalCode(nationalCode)
            checkEmployeeExistence(nationalCode, employee)

            Logger.info("registration","please enter your firstname")
            val firstName = readLine()!!


            Logger.info("registration","please enter your lastname")
            val lastName = readLine()!!


            Logger.info("registration","please enter your phone number")
            val phoneNumber = readLine()!!.toLong()
            checkPhoneNumber(phoneNumber)


            Logger.info("registration","please enter your birth year")
            val birthYear = readLine()!!.toShort()
            checkBirthYear(birthYear.toInt())


            employee.add(
                EmployeeData(
                    nationalCode,
                    AccessLevels.DEFAULT,
                    firstName,
                    lastName,
                    phoneNumber,
                    birthYear,
                    mutableListOf()
                )
            )

            Logger.success("registration", "new employee registered successfully")
        }
    }
}