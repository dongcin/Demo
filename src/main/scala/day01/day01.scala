package day01

/**
  * Created by acer on 2018/2/17.
  */
class day01 {

}
object day01{
  def main(args:Array[String]):Unit ={
    val str = "qqq"
    for (i<- 1 to 10){
      println(i)
    }
    val arr = Array("java","scala","c#")
    for (i <- arr)
      println(i)
    for(i<- 1 to 3; j<- 2 to 5 )
      if (i != j)
        println(i * 10 +j + "")
    println(str)
  }
}
