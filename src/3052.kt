import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val arr = hashSetOf<Int>()
    var a: Int
    var ee = 0

    while ( ee < 10) {
        a = br.readLine().toInt() % 42
        arr.add(a)
            ee++
    }
    bw.write("${arr.size}")
    bw.flush()
    bw.close()
}
//두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
//
//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.