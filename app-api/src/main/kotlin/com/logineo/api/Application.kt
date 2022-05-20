package com.logineo.api
//import io.micronaut.core.annotation.Introspected
//import io.micronaut.runtime.Micronaut.*
//import javax.persistence.Entity

import io.micronaut.runtime.Micronaut
//@Introspected(packages= ["com.logineo.core"], includedAnnotations= Entity.class )
//    @Introspected(packages= arrayOf("foo.bar"), includedAnnotations=Entity.class, [])
//@Introspected(packages = ["com.logineo.core"], includedAnnotations = User.class);
object Application {
    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.run(Application.javaClass)
    }
}
//fun main(args: Array<String>) {
//    build()
//        .args(*args)
//        .packages("com.logineo.core")
//        .start()
//}
