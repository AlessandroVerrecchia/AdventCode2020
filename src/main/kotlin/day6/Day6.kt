package day6

import java.io.File


class Day6 {
    fun execute() {
        println("day 6")

        var count = 0
        var charIsPresent = true
        var list = listOf<String>()

        getList().forEach {
            list = it.split("\r\n")
            for (i in list[0].indices) {
                charIsPresent = true
                for (j in 1..list.size) {
                    try {
                        if (list[j].contains(list[0][i]).not()) {
                            charIsPresent = false
                        }
                    } catch (e: Exception) {
                    }
                }
                if (charIsPresent)
                    count++
            }
        }
        println(count)
    }

    private fun getList(): List<String> {
        return File("day6.txt").readText(Charsets.UTF_8).split("\r\n\r\n")
    }
}