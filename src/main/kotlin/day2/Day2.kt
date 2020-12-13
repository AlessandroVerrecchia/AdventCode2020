package day2

import readFileAsLinesUsingUseLines

class Day2 {
    fun execute() {
        println("DAY2 " + computeCorrectPasswords().toString())
    }

    private fun computeCorrectPasswords(): Int {
        var correctPasswords = 0
        getCompletePasswords().forEach {
            if (it.isComplete2()) {
                correctPasswords++
            }
        }
        return correctPasswords
    }

    private fun getCompletePasswords(): List<Password> {
        val passwords = mutableListOf<Password>()
        getRawPasswords().forEach {
            passwords.add(
                Password(
                    minimumOccurrence = it.substringBefore("-").toInt(),
                    maximumOccurrence = it.substringAfter("-").substringBefore(' ').toInt(),
                    mustContainChar = it.substringAfter(' ').substringBefore(": ").single(),
                    content = it.substringAfter(": ")
                )
            )
        }
        return passwords
    }

    private fun getRawPasswords(): List<String> {
        return readFileAsLinesUsingUseLines("day2.txt")
    }
}


