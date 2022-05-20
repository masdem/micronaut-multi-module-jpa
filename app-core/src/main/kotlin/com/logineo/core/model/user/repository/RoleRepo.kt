package com.logineo.core.model.user.repository

import com.logineo.core.model.user.domain.Role
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import java.util.UUID

@Repository
interface RoleRepo : CrudRepository<Role, UUID>
