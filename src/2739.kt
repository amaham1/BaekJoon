import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    for(i in 1..9){
        println("$n * $i = ${n * i}")
    }
}
//구구단