import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val abc = StringTokenizer(br.readLine()) /// A B C 받음

    var a = abc.nextToken().toInt() // A = 고정비용
    var b = abc.nextToken().toInt() // B = 가변비용
    var c = abc.nextToken().toInt() // C = 노트북 가격

    if (c <= b) bw.write("-1")
    else bw.write("${(a/(c-b)+1)}")

    bw.flush()
    bw.close()
}