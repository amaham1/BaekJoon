import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    val st: StringTokenizer = StringTokenizer(br.readLine())
    val a = st.nextToken().toInt()

    for(i in a downTo 1){
        bw.write("$i\n")
    }
    bw.flush()
    bw.close()
}
//자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.