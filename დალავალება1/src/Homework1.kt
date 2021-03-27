class Homework1 {
}

fun main() {
    multiplyMinusSum(256)
}

fun multiplyMinusSum(number: Int): Int{
    var n = number
    var m = number
    var r: Int
    var l: Int
    var sum = 0
    var multiple = 1

    while (n > 0) {
        r = n % 10
        sum += r
        n /= 10
    }
    while (m>0) {
        l = m%10
        multiple *= l
        m/=10
    }
    var result:Int=multiple-sum
    println("Multiple of digits:$multiple");
    println("Sum of digits:$sum");
    println(result);
    return result;
}