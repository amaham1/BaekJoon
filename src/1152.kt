import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sd = StringTokenizer(br.readLine())
    bw.write("${sd.countTokens()}")
    bw.flush()
    bw.close()
}