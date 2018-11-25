package hello
import io.StdIn._
import java.lang._
object first extends App {
//  println("hello worldl")
//  val myStr="hellowrdsfas"
//  println(myStr)
//  val mystr2: String ="hell, machao"
//  println(mystr2)
//  val mystr3: java.lang.String ="hellow lichaobo"
//  println(mystr3)
//  var price: Double =12.04
//  println(price)
//  val sum1=(5).+(3)
//  println(sum1)
//  val vamax=(3).max(5)
//  println(vamax)
//  var list1 : scala.collection.immutable.Range =1 until 5 by 2
//  println(list1)
//  println(1.to(5))
//  for (i<- 1 to 5)
//    println(i)
//控制结构
  //  val x=6
//  if (x>0){
//    println("this is a positive number")
//  }
//  else{
//    println("this is  a negative number")
//  }
//  //if -else支持嵌套
//var i=9
//  while(i>0){
//    i-=1
//    println("i is ",i)
//  }
//for (i<-1 to 5)
//  println(i)
//  for (i<-1 to 5 if i%2==0)
//    println(i)
////双重循环
//  for (i<-1 to 5;j<-2 to 4)
//    println(i*j)
//
//  //for推导式
//  val r=for(i <- 1 to 5 if i%2==0) yield {
//    println(i);i
//  }
//  println(r)
  //数据结构
  var strlist=List("bigdata","hadoop","spark")
  println(strlist)
  println(strlist.head)
  println(strlist.tail)
  //添加元素
  val otherlist="apache"::strlist
  println(otherlist)
  //建立新列表
  //Nil 是空列表的意思
val intlist=1::2::3::Nil
  //or
  val intlists=List(1,2,3)
  //set集合，不重复元素，无顺序
  //默认建立的是不可变集，scala.collection.immutable
  var mySet=Set("hadoop","spark")
  mySet+="scala"//指针指向了新的mySet
  //映射map 类似于字典
  var university=Map("XMU"->"厦门大学","THU"->"清华大学","PKU"->"北京大学")
  var xmu=if(university.contains("XMU")) university("XMU") else 0
  println(xmu)
  //添加值
  //university("FZU")="福州大学"//适用于map是可变，定义是val
  university+=("HD"->"黑龙江大学")//适用于map是不可变，定义是var
  println(university)
  for ((k,v) <- university)
    println(k,v)
  for (k <- university.keys)
    println(k)
  for(v <- university.values)
    println(v)
}
