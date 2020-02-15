import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    if (a > b && b > c){
        print(b)}
        else if (a < b && b < c) {
            print(b)
        }
        a < b && b > c && a > c-> print(a)
        a < b && b > c && a < c-> print(c)

        a > b && b < c && a > c-> print(c)
        a > b && b < c && a < c-> print(a)
    }
}