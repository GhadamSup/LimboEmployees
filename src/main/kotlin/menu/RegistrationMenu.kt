package menu

import entities.data.EmployeeData
import requests.RegistrationRequest
import requests.VacationRequest
import util.ConsoleUtil.Companion.printBorder
import util.Logger

class RegistrationMenu {

    companion object {

        fun mainMenu() {
            val employeeList = mutableListOf<EmployeeData>()

            while(true) {

                try {
                    when(loopInputTracker()) {

                        1 -> RegistrationRequest.registerNewEmployee(employeeList)

                        2 -> VacationRequest.registerNewVacation(employeeList)

                        3 -> Logger.info("main", "$employeeList")

                        4 -> break

                        else -> {
                            throw Exception("${Logger.error("main", "please enter a valid code")}")
                        }
                    }
                } catch (e: Exception) {

                }

            }
        }

        private fun loopInputTracker(): Int {
            printBorder()
            Logger.info("main","please enter a code")
            Logger.info("main","[1] register new employee")
            Logger.info("main","[2] register new vacation")
            Logger.info("main","[3] view all employee data's")
            Logger.info("main","[4] exit")
            return readLine()!!.toInt()
        }

    }

}