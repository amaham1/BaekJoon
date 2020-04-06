import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val a = br.readLine().toDouble()

    bw.write("%.6f\n".format(a * a * Math.PI))
    bw.write("%.6f".format(a * a * 2))
    bw.flush()
    bw.close()
}