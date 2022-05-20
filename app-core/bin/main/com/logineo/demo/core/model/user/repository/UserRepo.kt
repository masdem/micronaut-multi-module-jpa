package com.logineo.demo.core.model.user.repository

import com.logineo.demo.core.model.user.domain.User
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import java.util.UUID

@Repository
interface UserRepo : CrudRepository<User, UUID>
