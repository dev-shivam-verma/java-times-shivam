fun dosomething() {
        println("shivam")
 }

fun main(){


    var second : () -> Unit = { println("verma") }

    second() .also {
        println("shivam")
    }
}
