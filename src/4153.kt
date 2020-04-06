import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while ( true ) {
        val gerNumber = StringTokenizer(br.readLine())
        val a = gerNumber.nextToken().toInt()
        if ( a == 0 ) break
        val b = gerNumber.nextToken().toInt()
        val c = gerNumber.nextToken().toInt()

        when {
            (a * a) + (b * b) == c * c -> {
                bw.write("right\n")
            }
            (a * a) + (c * c) == b * b -> {
                bw.write("right\n")
            }
            (b * b) + (c * c) == a * a -> {
                bw.write("right\n")
            }
            else -> bw.write("wrong\n")
        }
    }
    bw.flush()
    bw.close()
}
//피타고라스 정리에 의하여 직각삼각형인지 아닌지 구하기
