/*
Jose Ramos
10/2/2017
"Additive Persistence and additive root"

Calculates the additive persistence and additive root of a given number.
 */

fun main(args: Array<String>){
    println("Please enter the number you want to calculate")

    var num = readLine()!!.toInt()
    var persistence = 0
    var root = 0
    var i = 0
    var base[10]

    if(num < 0 ){
        println("Error, please enter a number greater than 0")

    }else if( num < 10 ){
        root = num
        println("The additive root is: " + root  + "\nThe persistence is: " + persistence)
    }

    //for small value
    else if (num < 10000){
        while(i < 50){
            i++
            base[i] = num % 10
            num = num/10
        }

        root = base[0]+base[1]+base[3]+base[2]

        println("The additive root is: " + root  + "\nThe persistence is: " + persistence)
    }
    //for bigger value
    else {

        println("The additive root is: " + root  + "\nThe persistence is: " + persistence)
    }


}