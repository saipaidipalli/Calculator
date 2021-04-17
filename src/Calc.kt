import java.util.Scanner

fun add(a:Double , b:Double ):Double  = a+b
fun sub(x:Double , y:Double ):Double  = x-y
fun mul(x:Double , y:Double ):Double  = x*y
fun div(x:Double , y:Double ):Double  = x/y
fun per(x:Double , y:Double ):Double  = (x/100)*y

fun main(args: Array<String>) {
// Dummy value to display the output if one only number is  displayed
    var result:Double = -1000.0
// Initially keep the operator blank
    var operator = ' '
    val reader = Scanner(System.`in`)
   println("Please select '=' operator to get result")
/*
Looping to get input number and operator based on users choice
and exit the loop when '=' operator is chose in order to display result
*/
    do {
        print("Enter number : ")
        val num = reader.nextDouble()
        if (operator != ' ') {
            when (operator) {
                '+' -> {
                    result = add(result,num)
                    operator = ' '
                }
                '-' -> {
                    result = sub(result,num)
                    operator = ' '
                }
                '*' -> {
                    result = mul(result,num)
                    operator = ' '
                }
                '/' -> {
                    if (num != 0.0) {
                        result = div(result,num)
                        operator = ' '
                    } else {
                        println("Cannot divide by zero")
                        operator = ' '
                        continue
                    }

                }
                '%' -> {
                    result = per(result,num)
                    operator = ' '
                }

                else -> {
                    println("Enter the operator present in the list")
                    operator = ' '
                    continue
                }
            }
        }
        if (operator == ' ') {
            print("Enter an operator (+, -, *, /, %, =): ")
             operator = reader.next()[0]
        }
// When only one number is chose, and no second number chosen then display the first number
       if (result == -1000.0) {
           result = num
        }

        }while(operator != '=')
// To print the result
         print("$result")
    }




