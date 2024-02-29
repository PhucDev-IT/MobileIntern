fun main(){
    val bikes = intArrayOf(2, 7, 2, 1, 1, 1, 7, 1, 2, 1)
    val bikes2 = intArrayOf(1, 2, 7, 2, 1, 1, 1, 2, 1, 2, 1)
    solution(bikes)
    solution(bikes2)

}

fun solution(bikes:IntArray){
    val checkBike = mutableListOf<Int>()
    for(i in bikes){
        if(checkBike.contains(i)){
            checkBike.remove(i)
        }else{
            checkBike.add(i)
        }
    }
    println(checkBike.toString())
}