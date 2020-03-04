import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val a = br.readLine().toInt()

    var b = br.readLine()
    val arr = CharArray(a)
    for (i in arr.indices) { //문자열을 한글자씩 취득
        arr[i] = b[i]
    }

    var sum: Int = 0
    for (i in arr.indices) {
        sum += arr[i] - '0'
        print(arr.contentToString())
    }

    bw.write("$sum")
    bw.flush()
    bw.close()

}
//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.