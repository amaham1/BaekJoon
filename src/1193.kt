import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val targetNumber = br.readLine().toInt()
    var line = 0
    var cnt = 0
    while ( cnt < targetNumber ) {
        line++
        cnt = line * (line+1) / 2
    }

    if ( line % 2 == 0 ) bw.write("${ line - (cnt - targetNumber) }/${ cnt - targetNumber + 1}")
    if ( line % 2 != 0 )bw.write("${ cnt - targetNumber + 1}/${ line - (cnt - targetNumber) }")
    bw.flush()
    bw.close()
}
//이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
//
//X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.