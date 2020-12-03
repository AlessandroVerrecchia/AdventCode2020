package day2

class Password(
    val minimumOccurrence: Int,
    val maximumOccurrence: Int,
    val mustContainChar: Char,
    val content: String
) {
    private fun getMustContainCharOccurrence(): Int {
        return content.filter { it == mustContainChar }.count()
    }

    fun isComplete(): Boolean {
        return getMustContainCharOccurrence() in minimumOccurrence..maximumOccurrence
    }

    fun isComplete2(): Boolean {
        return content.getOrNull(minimumOccurrence - 1) == mustContainChar &&
                content.getOrNull(maximumOccurrence - 1) != mustContainChar ||
                content.getOrNull(maximumOccurrence - 1) == mustContainChar &&
                content.getOrNull(minimumOccurrence - 1) != mustContainChar
    }
}