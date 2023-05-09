import javax.management.MBeanRegistration

fun main() {
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    getSum(numbers)
    getIndex(numbers)
    sortednumbers(numbers)
    println(getNames("mercy","orishaba","kwash"))
}

//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
fun getSum(numbers: Array<Int>){
    var sum=numbers[1]+numbers[4]
    println(sum)



}
//(ii) prints out the index of 158 (1 point)
fun getIndex(numbers: Array<Int>){
    var index=numbers.indexOf(158)
    println(index)



}
//(iii) prints out the elements in ascending order.
fun sortednumbers(numbers: Array<Int>){
    var sorted =numbers.sorted()
    println(sorted)
}



//2. Given a list of Person objects, each with the attributes,
// name, age, height, and weight. Sort the list in order of descending age (2 points)
class Person(var name:String,var age:Int,var height:Double,var weight:Double){


}
//
//3. Create a function that takes in 3 names and returns a string
// array containing all 3 names. (2 points)
fun getNames(name1: String,name2: String,name3: String):Array<String>{
    return arrayOf(name1,name2,name3)
}
//
//4. Write a function that takes in a list of Car objects
// each with a registration and mileage attribute and returns
// the average mileage of all the vehicles in the list. (3 points)
class Car(var registration: String,var millage:Double ){

}