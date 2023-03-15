
import java.util.Random

fun dataType() {
  var x:Int? =10
    val y = 50
  x=10

  val z:Int = x+y


    println(x)

    x=y

    println(z)
    println(x)
}
fun main() {
//    dataType()
//
//  println("===================")
//
//  println(singleEpxFun(x=10.0f))
//
//  println("===================")
//
//  println(mergeInfo(fName = "Ng", lName =  "Mai", age = 10))
//
//  array(6)
//  var init = arrayOf<String>("cdIw", "tzIy", "xDu", "rThG")
//  var result = partlist(init)
//  for(i in result){
//    println(i.contentToString())
//  }
  println(findShort("bitcoin take over the world maybe who knows perhaps"))
}

//bundle hay su dung array
fun array(num:Int){
  val mArray = IntArray(num)

  val rd= Random()

  mArray.indices.forEach { i ->
    mArray[i]= rd.nextInt(100)
  }

  mArray.forEach { item -> println("item ne $item") }



}

fun mergeInfo(lName: String, fName: String="", age:Int): String {
return "My name's $fName $lName.\nI'm $age years old."
}

fun singleEpxFun(x:Float):Float = x*2

fun partlist(arr:Array<String>):Array<Array<String>> {
  // your code
  val fullText = arr.joinToString(" ")
  val last = arr.size-1
  var result = arrayOf<Array<String>>()
  return (0..last-1).map { it -> arrayOf(arr.take(it).joinToString(" "), arr.drop(it).joinToString(" ")) }.toTypedArray()
  return result
}


/*
fun findShort(s: String): Int = s.split(" ")..minOf { it.length }
* */
fun findShort(s: String): Int = s.split(" ").map { it.length }.minOf { it }