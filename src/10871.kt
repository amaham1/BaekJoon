import java.io.*
import java.util.*

fun main() {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        var str = br.readLine() //콘솔창 한 줄을 받음(공백상관)
        var stk = StringTokenizer(str) //공백을 기준으로 숫자를 나눔
        val n = stk.nextToken().toInt() //수열의 갯수 몇개받을 것인지
        val m = stk.nextToken().toInt() // 판단기준 숫자

        //여기서 부터 수열의 숫자들을 받음
        str = br.readLine()
        stk = StringTokenizer(str)

        if (stk.hasMoreTokens()) {
            for(i in 1..n) {
                val num = stk.nextToken().toInt()
                if (num < m)
                    bw.write("$num ")
            }
        }
    bw.flush()
    bw.close()
}
//정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
// 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
