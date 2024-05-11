package com.example.lobby.model

class User {
    var name:String = ""
    var email:String = ""
    var password:String = ""
    var id:String = ""
    var loan:String = ""

    constructor(name: String, email: String, password: String, id: String) {
        this.name = name
        this.email = email
        this.password = password
        this.id = id
        this.loan = id
    }

    constructor()
}