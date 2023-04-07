data class Point(val x: Int, val y: Int)
operator fun Point.unaryMinus() = Point(-x, -y)

fun main() {

    /**Перегрузка операторов*/
    val point = Point(10, 20)
    println(-point)  // выведет "Point(x=-10, y=-20)"

    //////////////////////////////

    /**Диапазоны*/
    for (i in 1..8 step 2) print(i) // 1357
    println()
    for (i in 8 downTo 1 step 2) print(i) // 8642
    println()

    ///////////////////////////////

    for (i in 1..5) {
        println(i)
    }

    for (x in 1..5) {
        print("$x")
    }
    println()

    val range = 1..5
    for (i in range) {
        println("Элемент $i")
    }

    /////////////////////////////

    /**Массивы строк*/
    val cats = arrayListOf<String>()
    cats.add("Мурзик")
    cats.add("Васька")
    cats.add("Барсик")

    for (cat in cats) {
        println("Кот $cat")
    }

    //////////////////////////////////

/**Выражение Break и Continue*/
    var i = 1
    while (i < 13) {
        if (i == 11) {
            break
        }
        println(i)
        i += 1
        if (i == 6) {
            println("После пяти")
            continue
        }
    }
}
