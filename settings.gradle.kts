rootProject.name = "template-apis"

//include("core")
//include("api")
//listOf("core", "api").forEach {
//    include(":${it}")
//    project(":${it}").projectDir = file(it)
//}
listOf("api", "core").forEach {
    include(":app-$it")
    project(":app-$it").name = rootProject.name + "-$it"
}


//listOf("core", "web").forEach {
//    include(":$it")
//    project(":$it").name = rootProject.name + "/$it"
//}
