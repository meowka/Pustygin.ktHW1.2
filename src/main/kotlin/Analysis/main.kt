package Analysis

fun main() {

}

class Vk(
    id: Int,
    ownerId: Int,
    fromId: Int,
    createdBy: Int,
    date: Int,
    text: String,
    replyOwnerId: Int,
    replyPostId: Int,
    friendsOnly: Boolean,
    comments: Comments,
    likes: Likes,
    views: Views,
    postType: PostType,
    postSource: Any,
    geo: Geo,
    signerId: Int,
    canPin: Boolean,
    canDelete: Boolean,
    canEdit: Boolean,
    isPinned: Boolean,
    markedAsAds: Boolean,
    isFavorite: Boolean,
    postponedId: Int
) {

}

class Likes(count: Int, userLikes: Boolean, canLikes: Boolean, canPublish: Boolean) {}
class Comments(count: Int, canPost: Boolean, groupsCanPost: Boolean, canClose: Boolean, canOpen: Boolean) {}
class Views(count: Int) {}
enum class PostType {
    POST, COPY, REPLY, POSTPONE, SUGGEST
}

class Geo(type: String, coordinates: String, place: Any) {}