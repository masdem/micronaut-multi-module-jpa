package com.logineo.demo.core.model.user.dto

import com.logineo.demo.core.model.user.domain.Role

class UserSaveModel(
    val name: String,
    val username: String,
    val admin: Boolean,
    val role: Role
)
