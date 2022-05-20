package com.logineo.demo.core.model.user.domain

import com.logineo.demo.core.Schema
import org.jetbrains.annotations.NotNull
import java.util.*
import javax.persistence.*

@Entity
@Table(name = Schema.USERS)
data class User (
    @Id
    var id: UUID? = null,

    @NotNull
    var username: String? = null,

    @NotNull
    var password: String? = null,

    @NotNull
    var name: String? = null,

    var admin: Boolean? = false,

){
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", insertable = false, updatable = false)
    val role: Role? = null

    @Column(name = "last_login")
    var lastLogin: Date? = null
}
