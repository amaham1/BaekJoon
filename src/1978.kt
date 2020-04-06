import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val testNumber = br.readLine().toInt()
    var arr = IntArray(testNumber)//테스트케이스만큼 배열크기지정

    val a = StringTokenizer(br.readLine())//입력된 숫자들을 하나씩 배열에 저장한다
    var i = 0
    while ( a.hasMoreTokens() ) {
        arr[i] = a.nextToken().toInt()
        i++
    }

    var cnt = 0
    var f: Int
    for ( i in 0 until testNumber ) {
        f = 1 //소수판별기
        if ( arr[i] == 1 ) continue //1에는 건너뜀
        for ( j in 2 until arr[i] ) {
            if ( arr[i] % j == 0 ) {
                f = 0
                break
            } else f = 1
        }
        if ( f == 1 ) cnt++
    }
    bw.write("$cnt")
    bw.flush()
    bw.close()
}
//주어진 값 소수인지 판별문제