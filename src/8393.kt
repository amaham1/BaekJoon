import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var sum = 0

    for(i in 1..n)
        sum += i
    print(sum)
}
//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.