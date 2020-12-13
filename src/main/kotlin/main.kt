import day1.Day1
import day2.Day2
import day3.Day3
import day4.Day4
import day5.Day5
import day6.Day6
import java.io.File

fun readFileAsLinesUsingUseLines(fileName: String): List<String> = File(fileName).useLines { it.toList() }

fun main() {

    val day1 = Day1()
    day1.execute()

    val day2 = Day2()
    day2.execute()

    val day3 = Day3()
    day3.execute()

    val day4 = Day4()
    day4.execute()

    val day5 = Day5()
    day5.execute()

    val day6 = Day6()
    day6.execute()
}






