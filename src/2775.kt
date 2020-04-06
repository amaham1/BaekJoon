import java.io.*
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var testNum = br.readLine().toInt()

    for ( i in 0 until testNum ) {
        val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)
        var k = br.readLine().toInt()
        var n = br.readLine().toInt()

        for (i in 0 until k) {
            var sum = 0
            for (j in 0 until n) {
                sum += arr[j]
                arr[j] = sum
            }
        }
        bw.write("${arr[n - 1]}\n")
        bw.flush()
    }
    bw.close()
}
//이 아파트에 거주를 하려면 조건이 있는데, “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다” 는 계약 조항을 꼭 지키고 들어와야 한다.
//
//아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때, 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라. 단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
//
//입력
//첫 번째 줄에 Test case의 수 T가 주어진다. 그리고 각각의 케이스마다 입력으로 첫 번째 줄에 정수 k, 두 번째 줄에 정수 n이 주어진다. (1 <= k <= 14, 1 <= n <= 14)
//
//출력
//각각의 Test case에 대해서 해당 집에 거주민 수를 출력하라.