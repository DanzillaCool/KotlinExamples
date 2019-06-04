import java.util.*

fun main(args : Array<String>){
    var a = readLine()
    //Task 1
    /*
    var value : Int
    var array = Array<Int>(10, {ind -> ind})
    for (i in 0 until 10){
        value = readLine()!!.toInt()
        array[i] = value
    }

    for (i in 0 until 10){
        print("$i: ")
        println(array[i])
    }
    */

    //Task 2
    /*
    var array = ArrayList<Int>()
    var value : Int
    do {
        value = readLine()!!.toInt();
        array.add(value)
    }
        while (value != 0)

    var i = 0
    while (array[i] != 0){
        print("$i: ")
        println(array[i++])
    }
    */

    //Task 3
    /*
    var names = ArrayList<String>()
    var numbers = ArrayList<Int>()
    var i = 0;
    var name : String
    var number : Int
    var ind_of_max = 0

    while (true) {
        name = readLine()!!
        if (name == "0") break
        number = readLine()!!.toInt()

        names.add(name)
        numbers.add(number)
        if (number > numbers[ind_of_max]){
            ind_of_max = i;
        }
        i++
    }
    println("The biggest number is associated with name ${names[ind_of_max]}" + " and it is ${numbers[ind_of_max]}")
    */
    //Task 4
    var matrix = Array(3, {Array<Int>(3, {0})})
    for (i in 0 until 3){
        for (j in 0 until 3){
            matrix[i][j] = Random().nextInt(1000)
        }
    }
    Out(matrix)
    var temp : Int
    for (i in 0 until 3){
        temp = matrix[i][0]
        matrix[i][0] = matrix[i][2]
        matrix[i][2] = temp
    }
    Out(matrix)
}

fun Sum(a : Int, b : Int = 5) : Int{
    return a + b
}

fun Format(name : String, surname : String) : String{
    return "Фамилия: $surname, Имя: $name\n"
}

fun Out(matrix : Array<Array<Int>>) : Int {
    for (i in 0 until 3){
        for (j in 0 until 3){
            print("${matrix[i][j]} ")
        }
        println()
    }
    println()
    return 0
}