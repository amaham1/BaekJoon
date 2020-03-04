import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val one = n % 10 // 숫자의 일의 자리수
    val five = n / 5 //숫자를 5로 나눌때의 몫

    if ( n > 7 || n == 3 || n == 5 || n == 6) {
        if (one == 1) {
            bw.write("${five - 1 + 2}")
        } else if (one == 5 || one == 0) {
            bw.write("$five")
        } else if (one == 8) {
            bw.write("${five + 1}")
        } else if (one == 3 || one == 6 || one == 9) {
            bw.write("${(n % 10 / 3) + ((n - n % 10) / 5)}")
        } else if (one == 2 || one == 4 || one == 7) {
            bw.write("${five - 2 + 4}")
        } else bw.write("-1")
    }
    else bw.write("-1")
    bw.flush()
    bw.close()
}
//상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
//
//상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
//
//상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.