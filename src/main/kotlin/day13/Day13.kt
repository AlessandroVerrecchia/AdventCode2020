package day13

import java.io.File

class Day13 {
    fun execute() {
        //part1()
        part2()
    }

    private fun part1() {
        val timeStamp = File("day13.txt").readText(Charsets.UTF_8).split("\r\n").first().toInt()
        val buses = File("day13.txt").readText(Charsets.UTF_8).split("\r\n")[1].split(",")
        val validBuses = mutableListOf<Int>()
        buses.forEach {
            if (it != "x")
                validBuses.add(it.toInt())
        }

        var currentBusBestTimeStamp = 0
        val busesBestTimeStamp = mutableListOf<Pair<Int, Int>>()

        validBuses.forEach {
            var i = 0
            while (currentBusBestTimeStamp <= timeStamp) {
                currentBusBestTimeStamp = it * i
                i++
            }
            busesBestTimeStamp.add(Pair(it, currentBusBestTimeStamp))
            currentBusBestTimeStamp = 0
        }
        val result = busesBestTimeStamp.sortedWith(compareBy({ it.second }, { it.second }))

        println((result.first().second - timeStamp) * result.first().first)
    }

    private fun part2() {
        val buses = File("day13.txt").readText(Charsets.UTF_8).split("\r\n")[1].split(",")
        val validBuses = mutableListOf<Pair<Int, Long>>()
        for (i in buses.indices) {
            if (buses[i] != "x")
                validBuses.add(Pair(i, buses[i].toLong()))
        }

        var currentBusBestTimeStamp = 0L
        var success = false
        var j = 1

        for (i in validBuses.indices) {
            while (success.not()) {
                currentBusBestTimeStamp = validBuses[i].second
                if (validBuses[j].second == currentBusBestTimeStamp + validBuses[j].first){
                    j++
                }
            }
        }

    }
}