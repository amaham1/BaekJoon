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
        //st = StringTokenizer(br.readLine()!!)
        //val a = st.nextToken().toInt()
        var a = 0
        a += i
        bw.write("${a}\n")
    }
    bw.flush()
    bw.close()
}
//자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.