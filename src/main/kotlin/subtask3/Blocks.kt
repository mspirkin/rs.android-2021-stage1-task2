package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when(blockB) {
            Int::class -> {
                val listInt = blockA.filterIsInstance<Int>()
                return listInt.sum()
            }
            String::class -> {
                val listStr = blockA.filterIsInstance<String>()
                var sumStr = ""
                for (item in listStr) {
                    sumStr += item
                }
                return sumStr
            }
            LocalDate::class -> {
                val listData = blockA.filterIsInstance<LocalDate>()
                val data = listData[0]
                return data.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))

            }
        }

        throw NotImplementedError("Not implemented")
    }
}
