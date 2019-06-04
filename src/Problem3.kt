fun main(args : Array<String>){
    //Task 1
    /*
    var str = readLine()!!
    var res = isPalindrome(str)
    if (res) print("Palindrome")
    else print("Not a palindrome")
    */
    //Task 3

}

fun isPalindrome(str : String) : Boolean{
    var len = str.length
    for (i in 0 until len / 2){
        if (str[i] != str[len - 1 - i]) return false
    }
    return true
}

class Student(){

}