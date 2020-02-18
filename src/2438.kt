import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    //val st: StringTokenizer
    var sum: String = ""

    val a = br.readLine().toInt()

    for(i in 1 .. a){
        sum +="*"
        bw.write("$sum\n")
    }
    bw.flush()
    bw.close()
}
/*첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
*
**
***
****
*****
*/