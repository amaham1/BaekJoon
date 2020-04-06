import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val firstNum = br.readLine().toInt()
    val secondNum = br.readLine().toInt()

    val a = (firstNum..secondNum).filter {
        var f = true //소수판별기
        when (it) {
            1 -> f = false
            2 -> f = true
            else -> {
                for (i in 2 until it) {
                    if (it % i == 0) {
                        f = false
                        break
                    }
                }
            }
        }
        f //여기의 filter는 true일때만 값을 반환해준다. 그래서 f는 이 위치.
    }
    if (a.isEmpty()) bw.write("-1")
    else bw.write("${a.sumBy { it }}\n${a.minBy { it }}")
    bw.flush()
    bw.close()
}
//자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
//
//예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.