import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val r = br.readLine().toInt()

    for(i in 1..r){
        for(e in 1..(r-i)){
            bw.write(" ")
        }
        for(f in 0 until i){
            bw.write("*")
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}
/*
    *
   **
  ***
 ****
*****
*/