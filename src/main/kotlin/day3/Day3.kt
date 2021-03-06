package day3

import readFileAsLinesUsingUseLines


class Day3 {

    fun execute() {
        println("day3")
        test1()
        test2()
    }

    private fun test1() {
        var count = 0
        var row = 0
        var column = 0
        val forestList = getList()

        while (row + 1 < forestList.size) {
            row += 1
            column += 3

            if (forestList[row][column % forestList[row].length] == '#')
                count++
        }
        println("test 1 $count")
    }

    private fun test2() {
        var count1 = 0
        var row1 = 0
        var column1 = 0
        var count2 = 0
        var row2 = 0
        var column2 = 0
        var count3 = 0
        var row3 = 0
        var column3 = 0
        var count4 = 0
        var row4 = 0
        var column4 = 0
        var count5 = 0
        var row5 = 0
        var column5 = 0
        val forestList = getList()

        while (row1 + 1 < forestList.size) {
            row1 += 1
            column1 += 3
            if (forestList[row1][column1 % forestList[row1].length] == '#')
                count1++
        }
        while (row2 + 1 < forestList.size) {
            row2 += 1
            column2 += 1
            if (forestList[row2][column2 % forestList[row2].length] == '#')
                count2++
        }
        while (row3 + 1 < forestList.size) {
            row3 += 1
            column3 += 5
            if (forestList[row3][column3 % forestList[row3].length] == '#')
                count3++
        }
        while (row4 + 1 < forestList.size) {
            row4 += 1
            column4 += 7
            if (forestList[row4][column4 % forestList[row4].length] == '#')
                count4++
        }
        while (row5 + 1 < forestList.size) {
            row5 += 2
            column5 += 1
            if (forestList[row5][column5 % forestList[row5].length] == '#')
                count5++
        }
        println("test2 ${count1 * count2 * count3 * count4 * count5}")
    }

    private fun getList(): List<String> {
        return readFileAsLinesUsingUseLines("day3.txt")
    }

}