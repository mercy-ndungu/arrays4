fun main(){
    var y=myFun(arrayOf(3,4,5,6))
    println(y)
    var x = numeral(arrayOf("Kenya", 36.2, 5.5, false  ))
    println(x)
    var z = mySentence(arrayOf('f', 'a', 'e', 'b', 'i', 'c', 'o', 'u', 'z', 'x'))
    println(z)
}
fun myFun(number:Array<Int>):Int{
    var digit=1
    number.forEach { numb->
        digit*=numb
    }
    return digit
}
fun numeral(tally:Array<Any>):Double{
    var int = 0.0
    tally.forEach{unit->
        if(unit is Double || unit is Float){
            int+=unit.toString().toDouble()
        }
    }
    return int
}
fun mySentence(vowels:Array<Char>):Int{
    var figure = 0
    vowels.forEach { stmt->
        if(stmt=='a' || stmt=='e' || stmt=='i' || stmt=='o' || stmt=='u'){
            figure++
        }
    }
    return figure
}