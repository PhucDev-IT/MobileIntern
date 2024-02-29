fun main() {
    val brackets = "()())"
    val brackets2 =  ")()(())("
    minimumSwaps1(brackets)  //-1
    minimumSwaps1(brackets2)  //1
}
fun isCanSwapsStr(brackets: String): Boolean {
    val openCount: Int = brackets.count { it == '(' }
    val closeCount: Int = brackets.count { it == ')' }
    return (openCount - closeCount) == 0
}

fun minimumSwaps1(str: String) {
    if (!isCanSwapsStr(str)) {
        println("-1")
        return
    }
    var openCount = 0
    var closeCount = 0
    for (i in str) {
        if (i == '(') {
            openCount++
        } else {
            if (openCount > 0) {
                openCount--
            } else {
                closeCount++
            }
        }
    }
    println("Tối thiểu: ${(openCount + closeCount) / 2}")
}