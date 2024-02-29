import java.util.Stack
fun main() {
    val brackets = ")()(())())"
    println("Số lần tối thiểu để hoán vị thành chuỗi cân bằng là: ${minimumSwaps(brackets)}")
}
fun isCanSwaps(brackets: String): Boolean {
    return brackets.length % 2 == 0
}
fun minimumSwaps(brackets: String): Int {
    val stack = Stack<Char>()
    if (!isCanSwaps(brackets)) {
        return -1
    }
    //Trường hợp ) ở index = 0
    var count = 0
    for (i in brackets) {
        if (i == '(') {
            stack.push(i)
        } else {
            if (!stack.isEmpty()) {
                stack.pop()
            } else {
                count++
            }
        }
    }
    return (stack.size + count) / 2
}