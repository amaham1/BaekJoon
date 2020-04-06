import java.io.*
import java.lang.Math.pow
import java.util.*
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val testCase = br.readLine().toInt()
    for ( i in 1..testCase) {
        val st = StringTokenizer(br.readLine())
        val x1 = st.nextToken().toInt()
        val y1 = st.nextToken().toInt()
        val r1 = st.nextToken().toInt()
        val x2 = st.nextToken().toInt()
        val y2 = st.nextToken().toInt()
        val r2 = st.nextToken().toInt()

        val distance = sqrt((x2 - x1).toDouble().pow(2.0) + (y2 - y1).toDouble().pow(2.0))

        when {
            x1 == x2 && y1 == y2 && r1 == r2 -> bw.write("-1\n") //두 원 100%겹침
            distance == r1 + r2.toDouble() || abs(r1 - r2).toDouble() == distance -> bw.write("1\n") //두 원 외접or내접
            distance > r1 + r2 || x1 == x2 && y1 == y2 && r1 != r2 || distance < abs((r2 - r1)) -> bw.write("0\n") //두 원이 떨어져있거나 접하지 않으며 안 만남
            else -> bw.write("2\n") //나머지
        }
        bw.flush()
    }
    bw.close()
}
//이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.
//
//조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때, 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.