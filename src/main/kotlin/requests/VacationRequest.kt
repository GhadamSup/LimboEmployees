package requests

import entities.data.BreakData
import entities.data.EmployeeData
import util.ConsoleUtil.Companion.clearConsole
import util.Logger

class VacationRequest private constructor(){

    companion object {

        fun registerNewVacation(employee: MutableList<EmployeeData>) {

            clearConsole()

            Logger.info("vcrq", "please enter the employee code")
            val inputCode = readLine()!!
                val checkExistence = employee.filter { it.id == inputCode }


            if (checkExistence.isEmpty()) {

                throw Exception("${Logger.error("vcrq", "the employee does not exist")}")

            } else {


                Logger.info("vcrq", "please enter the date, example -> 1403/4/28 - 15:30")
                val vacationDate = readLine()!!

                Logger.info("vcrq", "trying to register new vacation")

                checkExistence[0].breakInfo.add(BreakData(vacationDate, false))

                clearConsole()

                Logger.success("vcrq", "vacation registered successfully")
            }

        }

    }

}