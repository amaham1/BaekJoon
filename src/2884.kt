import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val h =scanner.nextInt()
    val m = scanner.nextInt()

    when{
        h >= 0 && m >= 45 -> print("$h ${m -45}")
        h <= 0 && m < 45 -> print("${h -1 +24} ${m -45 +60}")
        h > 0 && m < 45 -> print("${h -1} ${m -45 +60}")
    }
}
//시간에서 45분 빼기 