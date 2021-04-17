import java.util.Scanner

fun add(a:Double , b:Double ):Double  = a+b
fun sub(x:Double , y:Double ):Double  = x-y
fun mul(x:Double , y:Double ):Double  = x*y
fun div(x:Double , y:Double ):Double  = x/y
fun per(x:Double , y:Double ):Double  = (x/100)*y

fun main(args: Array<String>) {

    var result:Double = -1000.0  // Dummy value to display the output if one only number is  displayed
    var operator = ' '
    val reader = Scanner(System.`in`)
   println("Please select '=' operator to get result")
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
       if (result == -1000.0) {
           result = num
        }

        }while(operator != '=')
         print("$result")
    }




