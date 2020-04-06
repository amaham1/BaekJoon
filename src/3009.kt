import java.io.*
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val firstArr = ArrayList<Int>()
    val secondArr = ArrayList<Int>()

    val firstLine = StringTokenizer(br.readLine())
    val a = firstLine.nextToken().toInt()
    val b = firstLine.nextToken().toInt()

    val secondLine = StringTokenizer(br.readLine())
    val aa = secondLine.nextToken().toInt()
    val bb =  secondLine.nextToken().toInt()

    val thirdLine = StringTokenizer(br.readLine())
    val aaa = thirdLine.nextToken().toInt()
    val bbb = thirdLine.nextToken().toInt()

    firstArr.add(a)
    firstArr.add(aa)
    firstArr.add(aaa)
    secondArr.add(b)
    secondArr.add(bb)
    secondArr.add(bbb)

    val firstArrMax = firstArr.max()
    val firstArrMin = firstArr.min()
    val firstArrSuMx2 = (firstArrMax!! + firstArrMin!!) * 2

    val secondArrMax = secondArr.max()
    val secondArrMin = secondArr.min()
    val secondArrSuMx2 = (secondArrMax!! + secondArrMin!!) * 2

    bw.write("${firstArrSuMx2 - (a+aa+aaa)} ${secondArrSuMx2 - (b+bb+bbb) }")
    bw.flush()
    bw.close()
}//세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.