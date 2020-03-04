fun main() {
    val a = readLine()?.toUpperCase() ?: return
    val num = ('A'..'Z').map { ii -> a.count {it == ii} }
    val max = num.max() ?: return

    print( if ( num.count {it == max} == 1) (num.indexOf(max) + 65).toChar() else "?")
}
//단어에서 가장 많이 쓰인 단어 출력
//2개 이상일경우 ? 출력