
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*

    fun main(args: Array<String>) {
        val br = BufferedReader(InputStreamReader(System.`in`))
        var str = br.readLine() // 입력할 숫자의 개수 입력
        val n = str.toInt() // 입력받은 수 Int로 형변환
        str = br.readLine()
        val stk = StringTokenizer(str)
        var min = Int.MAX_VALUE // 최소값을 구할 첫 기준의 수 min에 최고 큰 값을 넣어 줌
        var max = Int.MIN_VALUE // 최대값을 구할 첫 기준의 수 max에 최고 작은 값을 넣어 줌
        while (stk.hasMoreTokens()) {
            val temp = stk.nextToken().toInt()
            if (temp < min) // 첫 번째 수 temp가 min ( 21억~ ) 보다 작으므로 temp가 min이 됨. temp는 첫 번째 수가 되고, 반복문이 돌아 다음 수와 비교
                min = temp // temp와 비교하여 작은 수는 min 값이 됨
            if (temp > max) // 첫 번째 수 temp가 max ( -21억~ ) 보다 크므로 temp가 min이 됨. temp는 첫 번째 수가 되고, 반복문이 돌아 다음 수와 비교
                max = temp // temp와 비교하여 큰 수는 max 값이 됨
        }
        println("$min $max")
    }