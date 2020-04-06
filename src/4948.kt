import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var a: Int
    var sum: Int
    var arr: BooleanArray
    var doubleOfa:Int

    do {
        a = br.readLine().toInt()
        if ( a == 0) break
        sum = 0
        doubleOfa = a * 2
        arr = BooleanArray(doubleOfa +1)

        var c = a + 1
        while ( c <= doubleOfa ) {
            arr[c] = true
            c += 1
        }


        var i = 2
        while ( i * i <= doubleOfa ) {
            var j = i * 2
            while ( j <= doubleOfa ) {
                arr[j] = false
                j += i
            }
        i += 1
        }

        for ( i in arr.indices ) {
            if ( arr[i] ) sum += 1
        }
        bw.write("$sum\n")
        bw.flush()
    } while (a != 0)
    bw.close()
}
// n보다 크고 2n보다 작은소수 갯수