import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


//String 배열에 한 글자씩 저장하는 배열입니다.
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val textNumber = br.readLine().toInt()
    var word: String
    var arr: CharArray

    var sum: Int
    var s: Int
    var cnt = 1
    while (cnt <= textNumber ) {
        s = 0
        sum = 0

        word = br.readLine()
        arr = CharArray(word.length) // String 담을 배열
        for (i in arr.indices) {
            arr[i] = word[i] //String 한글자씩 끊어 배열에 저장
        }

        for (i in arr.indices) { //출력
            if (arr[i] == 'X') {
                s = 0
            }
            if (arr[i] == 'O') {
                s += 1
            }
            sum += s
        }
        bw.write("$sum\n")
        bw.flush()
        cnt++
    }
    bw.close()
}
//"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
//
//"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//
//OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.