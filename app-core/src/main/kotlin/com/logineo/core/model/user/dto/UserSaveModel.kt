package com.logineo.core.model.user.dto

import com.logineo.core.model.user.domain.Role

class UserSaveModel(
    val name: String,
    val username: String,
    val admin: Boolean,
    val role: Role
)
