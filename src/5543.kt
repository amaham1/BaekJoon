import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = 800// br.readLine().toInt()
    val b = 700//br.readLine().toInt()
    val c = 900//br.readLine().toInt()
    val d = 198//br.readLine().toInt()
    val e = 330//br.readLine().toInt()

    val temp1 = a + d
    val temp2 = a + e
    val temp3 = b + d
    val temp4 = b + e
    val temp5 = c + d
    val temp6 = c + e

    var save = temp1
    if ( save > temp2 ) save = temp2
    if ( save > temp3 ) save = temp3
    if ( save > temp4 ) save = temp4
    if ( save > temp5 ) save = temp5
    if ( save > temp6 ) save = temp6

    bw.write("${save - 50} \n")
    bw.flush()
    bw.close()

}
//상근날드에서 가장 잘 팔리는 메뉴는 세트 메뉴이다. 주문할 때, 자신이 원하는 햄버거와 음료를 하나씩 골라, 세트로 구매하면, 가격의 합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.
//
//햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고, 음료는 콜라와 사이다 두 종류가 있다.
//
//햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.