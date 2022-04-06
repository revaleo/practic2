object lockers extends App {
  val key=1 to 100
  var value=List.fill(100)(false)
  val locks = key.zip(value)
  println(locks)
  //First pass: Opening all locker
  val first= locks.map{case(i,_)=>(i,true)}
  println("1"+first)
  //Second pass: Closing every second locker
  val second= first.map{case(i,_)=>if(i%2!=0)(i,true) else (i,false)}
  println("2"+second)
  //Third pass: toggles every third locker
  val third=second.map{case(i,x)=>if(i%3==0)(i,!x) else(i,x)}
  println("3"+third)
  //ith pass iteration
  var status=third
  var itr=4
  while(itr<= 100){status=status.map{case(i,x)=>if(i%itr==0)(i,!x) else(i,x)}; itr+=1}
  println("100"+status)
  println(status.filter{case(_,x)=>x==true}.size)
}
