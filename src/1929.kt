import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val a = StringTokenizer(br.readLine())
    val aa = a.nextToken().toInt()
    val bb = a.nextToken().toInt()
    val arr = BooleanArray(bb + 1)


    var i = aa
    while ( i <= bb ) {
        arr[i] = true
        i += 1
    }
    if ( aa == 1 ) arr[1] = false

    var z = 2
    while ( z * z <= bb ) {
        var j = z * 2
        while ( j <= bb ) {
            arr[j] = false
            j += z
        }
        z += 1
    }

    for ( i in arr.indices ) {
        if ( arr[i] ) {
            bw.write("$i\n")
        }
    }
    bw.flush()
    bw.close()
}
//a~b까지 소수출력


