package com.example.lobby.model

class loans {
    var name:String = ""
    var amount:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, quantity: String, price: String, imageUrl: String, id: String) {
        this.name = name
        this.amount = quantity
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}