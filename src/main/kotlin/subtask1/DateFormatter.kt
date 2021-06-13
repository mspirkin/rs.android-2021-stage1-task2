package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val date = LocalDate.of(year.toInt(),month.toInt(), day.toInt() )
            date.format(DateTimeFormatter.ofPattern("dd MMMM, EEEE"))
        } catch (ex:DateTimeException) {
            "Такого дня не существует"
        }
        throw NotImplementedError("Not implemented")
    }
}
