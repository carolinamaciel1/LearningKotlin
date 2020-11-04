var x = 50
var y = 100

//type "Unit" describes a function without return

fun initial() : Unit{
    println("Mathematical operations examples")
}

// simple way to sum two numbers
fun sum(x:Int, y:Int): Int{
    return x + y
}

// another way to create a function
fun multiply (x:Int, y:Int) = x * y

fun main(){
    initial()
    println("Result Sum: " + sum(x,y))
    println("Result Multiply: " + multiply(x,y))
}