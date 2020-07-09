package profile

class Profile constructor(val id: Int, val login: String, private val name: String, private val surname:String, val status: String, val avatar: Boolean) {

    val fullName: String
    get() = "name : $name surname: $surname"
}