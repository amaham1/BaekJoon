import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()

    when {
        a > b -> print(">")
        a < b -> print("<")
        else -> print("==")
    }
}
//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.