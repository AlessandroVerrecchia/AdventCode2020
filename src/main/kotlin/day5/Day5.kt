package day5

import readFileAsLinesUsingUseLines

class Day5 {
    fun execute() {
        test1()
    }

    private fun test1() {
        println("Day5 : ")
        println("test1 : ")
        val boardingPasses = mutableListOf<BoardingPass>()
        val list = mutableListOf<Int>()
        getRawInput().forEach {
            boardingPasses.add(BoardingPass(it))
        }
        boardingPasses.forEach {
            it.createBoardingPass()
        }
        boardingPasses.forEach {
            list.add(it.binaryValue.toInt())
            list.sort()
        }
        for (i in 0 until list.size) {
            if (list[i] - 48 != i) {
                println(list.getOrNull(i - 1))
                println(list.getOrNull(i))
                println(list.getOrNull(i + 1))
                return
            }
        }
    }

    private fun getRawInput(): List<String> {
        return readFileAsLinesUsingUseLines("day5.txt").toMutableList()
    }
}