package day12

import readFileAsLinesUsingUseLines

/**
 * north = 0
 * east = 1
 * south = 2
 * west = 3
 */
class Day12 {
    fun execute() {
        println("day12 : ")

        var x = 0
        var y = 0
        var dir = 1

        getList().forEach {
            val action = it.first().toString()
            val amount = it.drop(1).toInt()
            if (action == "N" || (dir == 0 && action == "F"))
                y += amount
            if (action == "S" || (dir == 2 && action == "F"))
                y -= amount
            if (action == "E" || (dir == 1 && action == "F"))
                x += amount
            if (action == "W" || (dir == 3 && action == "F"))
                x -= amount
            if (action == "R") {
                dir += amount / 90
                dir = Math.floorMod(dir, 4)
            }
            if (action == "L") {
                dir -= amount / 90
                dir = Math.floorMod(dir, 4)
            }
        }
        println(kotlin.math.abs(x) + kotlin.math.abs(y))

        part2()
    }

    private fun part2() {
        var x = 0
        var y = 0
        var i = 10
        var j = 1

        getList().forEach {
            val action = it.first().toString()
            var amount = it.drop(1).toInt()

            if (action == "F") {
                x += amount * i
                y += amount * j
            }

            if (action == "N")
                j += amount
            if (action == "S")
                j -= amount
            if (action == "E")
                i += amount
            if (action == "W")
                i -= amount

            if (action == "R") {
                while (amount > 0) {
                    val i1 = j
                    val j1 = i * -1
                    i = i1
                    j = j1
                    amount -= 90
                }
            }

            if (action == "L") {
                while (amount > 0) {
                    val i1 = j * -1
                    val j1 = i
                    i = i1
                    j = j1
                    amount -= 90
                }
            }
        }
        println(kotlin.math.abs(x) + kotlin.math.abs(y))
    }

    private fun getList(): List<String> {
        return readFileAsLinesUsingUseLines("day12.txt")
    }
}