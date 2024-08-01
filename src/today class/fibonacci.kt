package `today class`

fun main(args:Array<String>) {


    var f = 0
    var s = 1
    var sum = 0
    for (i in 1..10){
        sum += f
    println(sum)
    f = s
    s = sum
}
}