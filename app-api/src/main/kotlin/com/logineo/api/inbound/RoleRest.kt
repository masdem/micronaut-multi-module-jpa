package com.logineo.api.inbound

import com.logineo.core.model.user.domain.Role
import com.logineo.core.model.user.dto.RoleSaveModel
import com.logineo.core.user.RoleService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.security.annotation.Secured
import jakarta.inject.Inject

@Controller("/roles")
class RoleRest() {

    @Inject
    lateinit var service: RoleService

    @Get(produces = [MediaType.TEXT_PLAIN])
    @Secured("isAnonymous()")
    fun index() = "Hello World form role rest"

    fun create (role: RoleSaveModel) = service.save(role as Role)
}
