package hierarcy.view

fun main() {
    val text = TextView("Some Text")
    text.click()
    println(text.number)
    text.number = "Something bad happened"
    println(text.number)
}

class TextView(var number:String):View() {
}