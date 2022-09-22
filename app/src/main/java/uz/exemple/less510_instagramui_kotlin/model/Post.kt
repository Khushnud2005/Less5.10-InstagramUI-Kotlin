package uz.exemple.less510_instagramui_kotlin.model

class Post {
   var profile:Int = 0
    lateinit var fullname:String
    var photo:Int = 0
    var photos: IntArray? = null

    constructor(profile: Int, fullname: String, photo: Int) {
        this.profile = profile
        this.fullname = fullname
        this.photo = photo
    }

    constructor(profile: Int, fullname: String, photos: IntArray?) {
        this.profile = profile
        this.fullname = fullname
        this.photos = photos
    }

}