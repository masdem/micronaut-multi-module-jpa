package com.logineo.core.model.user.domain

import com.logineo.core.Schema
import org.jetbrains.annotations.NotNull
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = Schema.ROLES)
data class Role (
    @Id
    var id: UUID? = null,

    @NotNull
    var name: String? = null,

    @NotNull
    var permissions: String? = null,
)


