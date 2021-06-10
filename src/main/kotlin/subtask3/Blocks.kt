package subtask3

import java.lang.RuntimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.reflect.*

class Blocks {

	fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
		val group = blockA.filter { it != null && it::class == blockB }

		return when (blockB) {
			String::class -> group.joinToString(separator = "")
			Int::class -> group.sumBy { it as Int }
			LocalDate::class -> (group.maxBy { it as LocalDate }!! as LocalDate)
					.format(DateTimeFormatter
					.ofPattern("dd.MM.yyyy")
					.withLocale(Locale("ru")))
			else -> throw RuntimeException("UnknownType")
		}
	}
}
