package hierarcy.view

class ViewGroup() :View(){

    fun addView(value:View) {
        val text: View = value
        println("text added")
    }
}