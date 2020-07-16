package Analysis

fun main() {

}

class Vk(
    var id: Int,
    var ownerId: Int,
    var fromId: Int,
    var createdBy: Int,
    var date: Int,
    var text: String,
    var replyOwnerId: Int,
    var replyPostId: Int,
    var friendsOnly: Boolean,
    comments: Comments,
    likes: Likes,
    views: Views

) {

}
class Likes(count:Int, userLikes:Boolean, canLikes:Boolean, canPublish:Boolean){}
class Comments(count:Int, canPost:Boolean, groupsCanPost:Boolean, canClose:Boolean, canOpen:Boolean){}
class Views(count:Int){}