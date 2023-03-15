fun main() {

    println(maxRot(56789))

    println(maxRot(38458215))
    println(maxRot(195881031))

    println(maxRot(896219342))

}

// https://www.codewars.com/kata/56484848ba95170a8000004d/train/kotlin
fun gps(s: Int, x: DoubleArray): Int? = (1..x.lastIndex).maxOfOrNull { (x[it] - x[it - 1]) * 3600 / s }?.toInt() ?: 0

// https://www.codewars.com/kata/56a4872cbb65f3a610000026/train/kotlin
fun maxRot(n: Long): Long {
    // your code
    var nString = n.toString()
    var result = nString
    for (i in 0 until nString.lastIndex) {
        nString = nString.take(i) + nString.drop(i + 1) + nString[i]
        if (nString > result) {
            result = nString
        }
    }
    return result.toLong()
}

// https://www.codewars.com/kata/5613d06cee1e7da6d5000055/train/kotlin
// if these g-steps prime numbers don't exist return []
fun step(g: Int, m: Long, n: Long): LongArray {
    // your code

    return LongArray(0)
}