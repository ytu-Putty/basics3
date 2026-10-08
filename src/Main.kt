//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
    println("Введите натуральное число:  ")
    val num = readln().toInt()
    val digit = num.toString(2)
    println(digit)
}