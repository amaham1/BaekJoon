import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val a = br.readLine().toInt()
    var stx: StringTokenizer
    var arr = DoubleArray(a)

    var dd:Double
    stx = StringTokenizer(br.readLine())
    for (i in 0 until a) { //입력받은 점수 배열구성
        dd = stx.nextToken().toDouble()
        arr[i] = dd
    }

    var max = 0.0
    for ( i in 0 until a){ //받은 점수 중 가장 큰 숫자 찾기
        if ( arr[i] > max ) {
            max = arr[i]
        }
    }

    var score = 0.0
    for ( i in 0 until a) { // 평균구하기
        score += arr[i] / max * 100 / a
    }

    bw.write("$score")
    bw.flush()
    bw.close()
}

//예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
//
//세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.