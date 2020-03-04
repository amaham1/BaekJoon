import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = br.readLine().toInt() //테스트개수
    var arr: CharArray = CharArray(0)

    var n = 0
    while ( n != t ) {
        val se = StringTokenizer(br.readLine())
        var st = se.nextToken()
        var stt = se.nextToken()

        arr = CharArray(stt.length)
        for ( i in arr.indices) {
            arr[i] = stt[i]
        }
        for (i in arr.indices) {
            for (j in 1..st.toInt()) {
                bw.write("${arr[i]}")
            }
        }
        bw.write("\n")
        bw.flush()
        n++
    }
    bw.close()
}