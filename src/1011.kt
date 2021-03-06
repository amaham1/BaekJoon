import java.io.*
import java.util.*
import kotlin.math.round
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    //테스트케이스
    val testCase = br.readLine().toInt()

    for ( i in 1..testCase ) {
        //X값과 Y값 구분
        val xy = StringTokenizer(br.readLine())
        val x = xy.nextToken().toInt()
        val y = xy.nextToken().toInt()
        //X값과 Y값을 뺀 값
        val yMinusX = y - x
        //yMinusX의 제곱근
        var zeGop = sqrt(yMinusX.toDouble())
        //yMinusX 제곱근을 반올림한 값
        var roundUp = round(zeGop)
        //y-x가 3이하면 그냥 출력
        //4 이상부터는 제곱근이 제곱근의 반올림값보다 크면 제곱근 * 2
        //4 이상부터는 제곱근이 제곱근의 반올림값보다 작으면 제곱근 * 2 - 1
        when {
            yMinusX <= 3 -> bw.write("$yMinusX\n")
            zeGop > roundUp -> bw.write("${roundUp.toInt() * 2}\n")
            zeGop <= roundUp -> bw.write("${roundUp.toInt() * 2 - 1}\n")
        }
        bw.flush()
    }
    bw.close()
}
//그가 탑승하게 될 우주선은 Alpha Centauri라는 새로운 인류의 보금자리를 개척하기 위한 대규모 생활 유지 시스템을 탑재하고 있기 때문에, 그 크기와 질량이 엄청난 이유로 최신기술력을 총 동원하여 개발한 공간이동 장치를 탑재하였다. 하지만 이 공간이동 장치는 이동 거리를 급격하게 늘릴 경우 기계에 심각한 결함이 발생하는 단점이 있어서,
// 이전 작동시기에 k광년을 이동하였을 때는 k-1 , k 혹은 k+1 광년만을 다시 이동할 수 있다.
// 예를 들어, 이 장치를 처음 작동시킬 경우 -1 , 0 , 1 광년을 이론상 이동할 수 있으나 사실상 음수 혹은 0 거리만큼의 이동은 의미가 없으므로 1 광년을 이동할 수 있으며, 그 다음에는 0 , 1 , 2 광년을 이동할 수 있는 것이다. ( 여기서 다시 2광년을 이동한다면 다음 시기엔 1, 2, 3 광년을 이동할 수 있다. )
//김우현은 공간이동 장치 작동시의 에너지 소모가 크다는 점을 잘 알고 있기 때문에 x지점에서 y지점을 향해 최소한의 작동 횟수로 이동하려 한다. 하지만 y지점에 도착해서도 공간 이동장치의 안전성을 위하여 y지점에 도착하기 바로 직전의 이동거리는 반드시 1광년으로 하려 한다.
//김우현을 위해 x지점부터 정확히 y지점으로 이동하는데 필요한 공간 이동 장치 작동 횟수의 최솟값을 구하는 프로그램을 작성하라.
//
//입력
//입력의 첫 줄에는 테스트케이스의 개수 T가 주어진다. 각각의 테스트 케이스에 대해 현재 위치 x 와 목표 위치 y 가 정수로 주어지며, x는 항상 y보다 작은 값을 갖는다. ( 0 ≤ x < y < 231)
//
//출력
//각 테스트 케이스에 대해 x지점으로부터 y지점까지 정확히 도달하는데 필요한 최소한의 공간이동 장치 작동 회수를 출력한다.