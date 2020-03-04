import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = IntArray(1_001)
    var testCase = br.readLine().toInt()

    var sum: Double
    var eveRage: Double
    var sumCnt: Double
    var d: Double
    for ( i in 1..testCase) {
        sum = 0.0
        eveRage = 0.0
        sumCnt = 0.0
        d = 0.0
        val str2 = StringTokenizer(br.readLine())

        //입력값 배열 저장
        var i:Int = 0
        while (str2.hasMoreTokens()) {
            arr[i] = str2.nextToken().toInt()
            i++
        }

        //평균구하기
        for ( i in 1..arr[0]) {
            sum += arr[i]
            eveRage = sum / arr[0]
        }

        //학생 비율
        for ( i in 1..arr[0]) {
            if ( arr[i] > eveRage)
                sumCnt += 1
        }
        d = sumCnt / arr[0] * 100
        bw.write("%.3f".format(d)+"%\n")//소수점 3자리
        bw.flush()
    }
    bw.close()
}
//첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//
//둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//
//출력
//각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.