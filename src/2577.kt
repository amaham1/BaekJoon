import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = br.readLine().toInt()
    val b = br.readLine().toInt()
    val c = br.readLine().toInt()
    val arr = arrayOf(0,1,2,3,4,5,6,7,8,9)

    val sum = a * b * c
    for (i in 0..9) {
        var cnt = 0
        var temp = sum

        while (temp != 0) {
            if (temp % 10 == arr[i]) {
                cnt++
            }
            temp /= 10
        }
        bw.write("$cnt\n")

    }
    bw.flush()
    bw.close()
}
//세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.