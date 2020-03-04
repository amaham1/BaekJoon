import java.io.*
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()

    bw.write("${d(n)}")
    bw.flush()
    bw.close()
}

fun d(n: Int): Int {
    var cnt = 0
    var arr = IntArray(3)
    var w = 0
    for ( i in 1..n) {
        if (i in 1..99)  cnt = i
        else if ( i == 1000 ) break
        else {
            w = 0
            var temp = i
            while (temp > 0) {
                arr[w] = temp % 10
                temp /= 10
                w++
            }
            if (arr[0] - arr[1] == arr[1] - arr[2]) cnt++
        }

    }
    return cnt
}
//어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다.
// 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.