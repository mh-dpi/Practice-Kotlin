fun main(){
    var salary = mutableMapOf("Akib" to 1234,"Sakib" to 342,"Rakib " to 442, "Nakib" to 1212)
    println(salary)
    for(i in salary){
        println(i)
    }
    println(salary["Akib"])

    println(salary.keys)
    println(salary.values)

}