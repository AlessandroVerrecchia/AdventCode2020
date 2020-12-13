package day4

import java.io.File

class Day4 {
    fun execute() {
        test1()
        test2()
    }

    private fun test1() {
        println("Day4 : ")
        println("test1")
        val passports = mutableListOf<Passport>()
        var count = 0
        getRawPasswords().forEach {
            passports.add(Passport(it))
        }
        passports.forEach {
            if (it.isComplete1())
                count++
        }
        println(count)
    }

    private fun test2() {
        println("Day4 : ")
        println("test2")
        val passports = mutableListOf<Passport>()
        var count = 0
        getRawPasswords().forEach {
            passports.add(Passport(it))
        }
        passports.forEach {
            it.assignConditions()
        }
        passports.forEach {
            if (it.isComplete2())
                count++
        }
        println(count)
    }

    private fun getRawPasswords(): List<String> {
        return File("day4.txt").readText(Charsets.UTF_8).split("\r\n\r\n")
    }
}

