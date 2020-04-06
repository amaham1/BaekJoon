import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val testCase = br.readLine().toInt()
    var cnt: Int
    var yy: Int
    var xx: Int
    var h: Int
    var w: Int
    var n: Int
    for ( i in 1..testCase ) {
        cnt  = 0
        yy = 0
        xx  = 1
        val numbers = StringTokenizer(br.readLine())
        h = numbers.nextToken().toInt()
        w = numbers.nextToken().toInt()
        n = numbers.nextToken().toInt()
        w = 1
        for ( i in 1..n) {
            if ( yy >= h && cnt < n) {
                yy = 0
                xx += 1
                w++
            }
            cnt++
            yy++
        }
        if( w > 9) bw.write("$yy$xx")
        else bw.write("${yy}0$xx")
        bw.flush()
    }
    bw.close()
}
//프로그램은 표준 입력에서 입력 데이터를 받는다.
// 프로그램의 입력은 T 개의 테스트 데이터로 이루어져 있는데 T 는 입력의 맨 첫 줄에 주어진다.
// 각 테스트 데이터는 한 행으로서 H, W, N, 세 정수를 포함하고 있으며
// 각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지를 나타낸다
// (1 ≤ H, W ≤ 99, 1 ≤ N ≤ H × W).