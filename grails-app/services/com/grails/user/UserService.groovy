package com.grails.user

import com.grails.angular.User
import grails.transaction.Transactional

@Transactional
class UserService {

    void register(User user){
      user.save(flush: true)
    }
    def userList(){
        return User.findAll()
    }
    def delete(long id){
        User.get(id).delete(flush: true)
    }

}
