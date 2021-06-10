package subtask2

class Abbreviation {

	fun abbreviationFromA(a: String, b: String): String {
		var matchCount = 0
		for (index in 0 until a.length) {
			if (matchCount < b.length) {
				if (a[index].toUpperCase() == b[matchCount])
					matchCount++
				else if (a[index].isUpperCase())
					matchCount = 0
			}
		}
		when (matchCount == b.length) {
			true -> return("YES")
			false -> return ("NO")
		}
	}
}
