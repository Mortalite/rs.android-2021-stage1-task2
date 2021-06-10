package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

	fun toTextDay(day: String, month: String, year: String): String {
		try {
			return DateTimeFormatter.ofPattern("dd MMMM, EEEE")
				.withLocale(Locale("RU"))
				.format(LocalDate.of(year.toInt(), month.toInt(), day.toInt()))
		}
		catch (exception: DateTimeException) {
			return "Такого дня не существует"
		}
	}
}
