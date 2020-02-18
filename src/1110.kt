import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val str = br.readLine()
    val stx = StringTokenizer(str)

    var num = stx.nextToken().toInt()

    var a = 0
    var b = 0
    var temp =  0
    var cnt = 0
    var c= num

    while (true) {

        a = num / 10
        b = num % 10
        temp = (a + b) % 10
        num =  b * 10 + temp
        cnt++
        if(c == num ) break
    }
    bw.write("$cnt")
    bw.flush()
    bw.close()
}