import java.util.*

fun main() {
        val sc = Scanner(System.`in`)
        val input = sc.next()
        var c = 'a'
        while (c <= 'z') {
            print(input.indexOf(c).toString() + " ")
            c++
        }
}
