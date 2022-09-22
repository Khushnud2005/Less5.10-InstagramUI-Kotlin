package uz.exemple.less510_instagramui_kotlin.model

class Post {
   var profile:Int = 0
    lateinit var fullname:String
    var photo:Int = 0
    var photos: IntArray? = null
    var isAdd:Boolean = false

    constructor(profile: Int, fullname: String, photo: Int,isAdd:Boolean) {
        this.profile = profile
        this.fullname = fullname
        this.photo = photo
        this.isAdd = isAdd
    }

    constructor(profile: Int, fullname: String, photos: IntArray?,isAdd:Boolean) {
        this.profile = profile
        this.fullname = fullname
        this.photos = photos
        this.isAdd = isAdd
    }

}