import java.io.*
import java.lang.Exception
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var a = 1
    var b = 1

    try {
        while (a != 0){
            val stf = br.readLine()
            val stk = StringTokenizer(stf)

            a = stk.nextToken().toInt()
            b = stk.nextToken().toInt()
            bw.write("${a + b}\n")
            bw.flush()

        }
    }
    catch (e: Exception){
        print("숫자를 입력하셔야죠")
    }
    bw.close()
}//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//null 들어오면 프로그램 끝