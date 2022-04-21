
import scala.collection.mutable.ListBuffer

import scala.io.StdIn.readLine

object dependency extends App{
val projects=readLine.split(" ").toList
  val buf = collection.mutable.ListBuffer(projects: _*)
val dependency:List[(String,String)]=readLine.split(" ").toList.sliding(2,2).map{case List(a,b)=>(a,b)}.toList
  for(x<-dependency) {
    val i=x._1
    val j=x._2
    if(buf.indexOf(i)>buf.indexOf(j)) {
      buf.update(buf.indexOf(i),j)
      buf.update(buf.indexOf(j),i)
    }
}
println("dependency is "+dependency)
  println("buf is " + buf)
  val itr=buf.toList.grouped(2).flatMap{case List(a,b) if dependency.contains((b,a)) => List(b,a) case List(a,b)=>List(a,b)}.toList
  println("itr after is " + itr)

  println(dependency)
}

