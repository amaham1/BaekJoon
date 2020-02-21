import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var arr = IntArray(9)

    var i = 0
    var place = 0
    var n = 0
    while (i <= 8) {
        arr[i] = br.readLine().toInt()
        if (arr[i] > n) {
            n = arr[i]
            place = i+1
        }
        i++
    }
    bw.write("$n\n" + "$place")
    bw.flush()
    bw.close()
}
//최댓값이 어디에 있는지 찾는 문제