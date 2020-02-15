import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    when(a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
        true -> print("1")
        else -> print("0")
    }
}
//연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.