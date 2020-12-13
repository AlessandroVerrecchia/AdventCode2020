package day1

import readFileAsLinesUsingUseLines

class Day1 {
    companion object {
        const val SUM = 2020
    }

    fun execute() {
        println("DAY 1")
        test1()
        test2()
    }

    private fun test1() {
        val list = getList()
        var valToFind = 0
        list.forEach {
            valToFind = SUM - it
            if (list.contains(valToFind)) {
                println("val1 =$it val2 =$valToFind output = ${it * valToFind}")
                return
            }
        }
    }

    private fun test2() {
        val list = readFileAsLinesUsingUseLines("day1.txt").map { it.toInt() }
        val sortedList = list.sorted().reversed()
        var valToFind = 0
        var val1 = 0
        var val2 = 0
        sortedList.forEach {
            if (it + sortedList[sortedList.indexOf(it) + 1] <= SUM) {
                val1 = it
                val2 = sortedList[sortedList.indexOf(it) + 1]
                valToFind = SUM - val1 - val2
                if (sortedList.contains(valToFind)) {
                    println("val1 =$it val2 =$val2 val3=$valToFind output = ${it * val2 * valToFind}")
                    return
                }
            }
        }
    }

    private fun getList(): List<Int> {
        return readFileAsLinesUsingUseLines("day1.txt").map { it.toInt() }
    }

}