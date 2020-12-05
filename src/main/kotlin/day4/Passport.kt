package day4

import day4.Passport.Companion.containsOnlyDigits
import day4.Passport.Companion.containsOnlyLetters

class Passport(private val content: String) {
    companion object {
        const val BIRTH_YEAR = "byr:"
        const val ISSUE_YEAR = "iyr:"
        const val EXPIRATION_YEAR = "eyr:"
        const val HEIGHT = "hgt:"
        const val HAIR_COLOR = "hcl:"
        const val EYE_COLOR = "ecl:"
        const val PASSWORD_ID = "pid:"
        const val COUNTRY_ID = "cid:"

        fun containsOnlyDigits(value: String): Boolean {
            val onlyDigits = Regex("[0-9]+")
            return value.matches(onlyDigits)
        }

        fun containsOnlyLetters(value: String): Boolean {
            val onlyDigits = Regex("[a-zA-Z]+")
            return value.matches(onlyDigits)
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
        var success = true
        conditions.forEach {
            success = it.isComplete()
        }
        return success
    }


}

abstract class Condition() {
    abstract fun isComplete(): Boolean
}

class BirthYearCond(private val value: String) : Condition() {
    override fun isComplete(): Boolean {
        return try {
            value.toInt() in 2002 downTo 1920
        } catch (e: Exception) {
            false
        }
    }
}

class IssueYearCond(private val value: String) : Condition() {
    override fun isComplete(): Boolean {
        return try {
            value.toInt() in 2020 downTo 2010
        } catch (e: Exception) {
            false
        }
    }
}

class ExpirationYearCond(private val value: String) : Condition() {
    override fun isComplete(): Boolean {
        return try {
            value.toInt() in 2020 downTo 2030
        } catch (e: Exception) {
            false
        }
    }
}

class HeightCond(private val value: String) : Condition() {
    override fun isComplete(): Boolean {
        return when {
            value.endsWith("cm") -> {
                val height = value.take(3).toInt()
                return height in 193 downTo 150
            }
            value.endsWith("in") -> {
                val height = value.take(2).toInt()
                return height in 76 downTo 59
            }
            else -> false
        }
    }
}

class HairColorCond(private val value: String) : Condition() {
    override fun isComplete(): Boolean {
        return when {
            value.startsWith('#') -> {
                if (value.length == 7) {
                    val color = value.drop(0)
                    return containsOnlyDigits(color) || containsOnlyLetters(color)
                } else {
                    false
                }
            }
            else -> false
        }
    }
}

class EyeColorCond(private val value: String) : Condition() {
    override fun isComplete(): Boolean {
        return value == "abm" ||
                value == "blu" ||
                value == "brn" ||
                value == "gry" ||
                value == "grn" ||
                value == "hzl" ||
                value == "oth"
    }
}

class PasswordIdCond(private val value: String) : Condition() {
    override fun isComplete(): Boolean {
        return containsOnlyDigits(value) && value.length == 9
    }
}