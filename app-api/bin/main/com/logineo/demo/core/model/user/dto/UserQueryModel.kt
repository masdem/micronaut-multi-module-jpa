package com.logineo.demo.core.model.user.dto

import com.logineo.demo.core.model.user.domain.Role
import java.util.UUID

class UserQueryModel(
    val id: UUID,
    val name: String,
    val username: String,
    val admin: Boolean,
    val role: Role
)
