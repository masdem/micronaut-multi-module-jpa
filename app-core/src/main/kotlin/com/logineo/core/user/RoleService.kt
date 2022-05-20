package com.logineo.core.user

import com.logineo.core.model.user.domain.Role
import com.logineo.core.model.user.repository.RoleRepo
import jakarta.inject.Inject
import jakarta.inject.Singleton
import javax.transaction.Transactional

@Singleton
class RoleService {

    @Inject
    lateinit var roleRepo: RoleRepo

    @Transactional
    fun save(role: Role): Role = roleRepo.save(role)
}
