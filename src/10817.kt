import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    var a = scanner.nextInt()
    var b = scanner.nextInt()
    var c = scanner.nextInt()

    when {
        a > b && a > c && b > c -> print(b)//a가 가장 크고 b가 2번째 일때
        a > b && a > c && b < c -> print(c)//a가 가장 크고 c가 2번째 일때
        b > a && b > c && a > c -> print(a)//b가 가장 크고 a가 2번째 일때
        b > a && b > c && a < c -> print(c)//b가 가장 크고 c가 2번째 일때
        c > a && c > b && a > b -> print(a)//c가 가장 크고 a가 2번째 일때
        c > a && c > b && a < b -> print(b)//c가 가장 크고 b가 2번째 일때
        a == b -> print(a)//숫자 2개가 같다는건 남은 1개는 작거나 크다는 얘기
        b == c -> print(b)
        a == c -> print(c)
    }
}
//세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.