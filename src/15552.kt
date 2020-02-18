import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>) {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))

        var st: StringTokenizer
        val t = br.readLine().toInt()

        for(i in 1..t) {

            st = StringTokenizer(br.readLine()!!)

            val a = st.nextToken().toInt()
            val b = st.nextToken().toInt()
            val sum = a + b
            bw.write("$sum\n")
        }
        bw.flush()
        bw.close()
}
//빠른 A+B 출력