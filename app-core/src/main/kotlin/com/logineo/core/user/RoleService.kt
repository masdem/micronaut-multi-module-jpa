package com.logineo.core.user

import com.logineo.core.model.user.domain.Role
import com.logineo.core.model.user.repository.RoleRepo
import jakarta.inject.Singleton
import javax.transaction.Transactional

@Singleton
open class RoleService(private val roleRepo: RoleRepo) {

    @Transactional
    open fun save(role: Role): Role = roleRepo.save(role)

    @Transactional
    open fun list(): MutableIterable<Role> = roleRepo.findAll()
}
