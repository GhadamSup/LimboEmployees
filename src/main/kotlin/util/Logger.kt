package util

import java.time.LocalTime

class Logger private constructor(){

    companion object {

        val green = "\u001b[32m"
        val red = "\u001b[31m"
        val reset = "\u001b[0m"

        fun info(title: String, message: String) {
            println("[${LocalTime.now().hour}:${LocalTime.now().minute}:${LocalTime.now().second}] [$title/INFO]: $message")
        }

        fun success(title: String, message: String) {
            println(green + "[${LocalTime.now().hour}:${LocalTime.now().minute}:${LocalTime.now().second}] [$title/SUCCESS]: $message" + reset)
        }

        fun error(title: String, message: String) {
            println(red + "[${LocalTime.now().hour}:${LocalTime.now().minute}:${LocalTime.now().second}] [$title/ERROR]: $message" + reset)
        }

    }

}