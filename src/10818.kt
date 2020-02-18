import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var str = br.readLine()//size 받는 구간
    val b = str.toInt()//size
    var numbers = Array(b) {0} //사이즈가 0인 배열

    var stx = StringTokenizer(str)
    str = br.readLine() //배열의 원소 받을준비
    stx = StringTokenizer(str) //배열의 원소 받을준비

    var i = 0
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    while (stx.hasMoreTokens()) {
        numbers[i] = stx.nextToken().toInt() //배열의 원소받기
        if (numbers[i] < min) // 첫 번째 수 temp가 min ( 21억~ ) 보다 작으므로 temp가 min이 됨. temp는 첫 번째 수가 되고, 반복문이 돌아 다음 수와 비교
            min = numbers[i] // temp와 비교하여 작은 수는 min 값이 됨
        if (numbers[i] > max) // 첫 번째 수 temp가 max ( -21억~ ) 보다 크므로 temp가 min이 됨. temp는 첫 번째 수가 되고, 반복문이 돌아 다음 수와 비교
            max = numbers[i]
        i++
    }
    bw.write("$min $max")
    bw.flush()
    bw.close()
}
//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.