import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var a = 1
    var b = 1

    while (a != 0 || b != 0){
        var str = br.readLine()
        var stk = StringTokenizer(str)
        a = stk.nextToken().toInt()
        b = stk.nextToken().toInt()
        if ( a != 0 || b != 0) bw.write("${a + b}\n")
        bw.flush()
    }
    bw.close()
}
//0 0이 들어올 때까지 A+B를 출력하는 문제