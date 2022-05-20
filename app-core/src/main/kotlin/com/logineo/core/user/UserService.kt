package com.logineo.core.user

import com.logineo.core.model.user.domain.User
import com.logineo.core.model.user.repository.UserRepo
import jakarta.inject.Singleton
import org.mindrot.jbcrypt.BCrypt
import javax.transaction.Transactional

@Singleton
open class UserService (private val userRepo: UserRepo) {

//    @Transactional
//    fun save(user: User): User {
//        if(user.id == null && !user.password.isNullOrBlank()){
//            val passwordHashed: String = BCrypt.hashpw(user.password, BCrypt.gensalt(12))
//            user.password = passwordHashed
//        }
//        return userRepo.save(user)
//    }

}
