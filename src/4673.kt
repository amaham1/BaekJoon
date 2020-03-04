
    var d = IntArray(10036)

    fun main(args: Array<String>) {
        for (i in 1..10000) {
            d[dn(i)] = 1
            if (d[i] != 1) println(i)
        }
    }

    fun dn(i: Int): Int {
        var i = i
        var res = i
        if (i >= 10000) {
            res += i / 10000
            i %= 10000
        }
        if (i >= 1000) {
            res += i / 1000
            i %= 1000
        }
        if (i >= 100) {
            res += i / 100
            i %= 100
        }
        if (i >= 10) {
            res += i / 10
            i %= 10
        }
        return i.let { res += it; res }
    }
