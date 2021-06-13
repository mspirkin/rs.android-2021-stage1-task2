package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        if (a.any { it.isUpperCase() }) {
            if (b.contains(a.filter { it.isUpperCase() })) return "YES"
        } else {
            return "NO"
        }
        throw NotImplementedError("Not implemented")
    }
}
