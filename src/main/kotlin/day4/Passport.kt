package day4

import day4.Passport.Companion.containsOnlyDigits
import day4.Passport.Companion.containsOnlyDigitsOrLettersToF

class Passport(private val content: String) {
    companion object {
        const val BIRTH_YEAR = "byr:"
        const val ISSUE_YEAR = "iyr:"
        const val EXPIRATION_YEAR = "eyr:"
        const val HEIGHT = "hgt:"
        const val HAIR_COLOR = "hcl:"
        const val EYE_COLOR = "ecl:"
        const val PASSWORD_ID = "pid:"


        fun containsOnlyDigits(value: String): Boolean {
            val onlyDigits = Regex("[0-9]+")
            return value.matches(onlyDigits)
        }

        fun containsOnlyDigitsOrLettersToF(value: String): Boolean {
            val onlyLetters = Regex("[0-9a-f]+")
            return value.matches(onlyLetters)
        }
    }

    private val conditions: MutableList<Condition> = mutableListOf()

    fun assignConditions() {
        val rawConditions = content.split(" ", "\n")
        rawConditions.forEach {
            when {
                it.startsWith(BIRTH_YEAR) -> {
                    conditions.add(BirthYearCond(it.drop(4)))
                }
                it.startsWith(ISSUE_YEAR) -> {
                    conditions.add(IssueYearCond(it.drop(4)))
                }
                it.startsWith(EXPIRATION_YEAR) -> {
                    conditions.add(ExpirationYearCond(it.drop(4)))
                }
                it.startsWith(HEIGHT) -> {
                    conditions.add(HeightCond(it.drop(4)))
                }
                it.startsWith(HAIR_COLOR) -> {
                    conditions.add(HairColorCond(it.drop(4)))
                }
                it.startsWith(EYE_COLOR) -> {
                    conditions.add(EyeColorCond(it.drop(4)))
                }
                it.startsWith(PASSWORD_ID) -> {
                    conditions.add(PasswordIdCond(it.drop(4)))
                }
                else -> {
                    // do nothing
                }
            }
        }
    }

    fun isComplete1(): Boolean = content.contains(BIRTH_YEAR) &&
            content.contains(ISSUE_YEAR) &&
            content.contains(EXPIRATION_YEAR) &&
            content.contains(HEIGHT) &&
            content.contains(HAIR_COLOR) &&
            content.contains(EYE_COLOR) &&
            content.contains(PASSWORD_ID)

    fun isComplete2(): Boolean {
        var count = 0

        conditions.forEach {
            if (it.isComplete())
                count++
        }
        return count == 7
    }

}

abstract class Condition {
    abstract fun isComplete(): Boolean
}

class BirthYearCond(private val value: String) : Condition() {
    override fun isComplete(): Boolean {
        return try {
            value.toInt() in 1920..2002 && value.length == 4
        } catch (e: Exception) {
            false
        }

    }
}

class IssueYearCond(private val value: String) : Condition() {
    override fun isComplete(): Boolean {
        return try {
            value.toInt() in 2010..2020 && value.length == 4
        } catch (e: Exception) {
            false
        }
    }
}

class ExpirationYearCond(private val value: String) : Condition() {
    override fun isComplete(): Boolean {
        return try {
            value.toInt() in 2020..2030 && value.length == 4
        } catch (e: Exception) {
            false
        }
    }
}

class HeightCond(private val value: String) : Condition() {
    override fun isComplete(): Boolean {
        return when {
            value.endsWith("cm") -> {
                try {
                    val height = value.take(3).toInt()
                    return height in 150..193
                } catch (e: Exception) {
                    false
                }
            }
            value.endsWith("in") -> {
                try {
                    val height = value.take(2).toInt()
                    return height in 59..79
                } catch (e: Exception) {
                    false
                }
            }
            else -> false
        }
    }
}

class HairColorCond(private val value: String) : Condition() {
    override fun isComplete(): Boolean {
        return when {
            value.startsWith('#') && value.length == 7 -> {
                val color = value.removePrefix("#")
                return containsOnlyDigitsOrLettersToF(color.toLowerCase())
            }
            else -> false
        }
    }
}


class EyeColorCond(private val value: String) : Condition() {
    override fun isComplete(): Boolean {
        val value2 = value.toLowerCase()
        return value2 == "amb" ||
                value2 == "blu" ||
                value2 == "brn" ||
                value2 == "gry" ||
                value2 == "grn" ||
                value2 == "hzl" ||
                value2 == "oth"
    }
}

class PasswordIdCond(private val value: String) : Condition() {
    override fun isComplete(): Boolean {
        return containsOnlyDigits(value) && value.length == 9
    }
}