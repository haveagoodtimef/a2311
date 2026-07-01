package com.fenghongzhang.anew

@Target(AnnotationTarget.FUNCTION,AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class Feng(
    val value: String,
    val haha: String
)

