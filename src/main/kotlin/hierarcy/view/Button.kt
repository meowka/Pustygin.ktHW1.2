package hierarcy.view

fun main() {
    val button = Button("Click me")
    button.click()
    println(button.number)
    button.number = "Don't click me"
    println(button.number)
}

class Button(var number:String):View() {

}