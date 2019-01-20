package com.grails.angular

class User {
String fullName
    String userName
    String password
    static constraints = {
        fullName nullable: false
        userName nullable: false
        password nullable: false
    }
}
