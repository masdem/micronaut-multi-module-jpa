package com.logineo.api.inbound

import com.logineo.core.model.user.domain.User
import com.logineo.core.model.user.dto.UserSaveModel
import com.logineo.core.user.UserService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.security.annotation.Secured

//@Suppress("UNCHECKED_CAST")
//@Transactional
@Controller("/users")
class MainRest(private val service: UserService) {
    @Get(produces = [MediaType.TEXT_PLAIN])
    @Secured("isAnonymous()")
    fun index() = "Hello World"

    @Post
    fun create(user: UserSaveModel) = service.save(user as User)
}
