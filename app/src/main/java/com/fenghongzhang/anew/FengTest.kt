package com.fenghongzhang.anew

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking{
    flow<Int> {
        emit(1)
        emit(2)
    }.flowOn(Dispatchers.IO).map {
        it * 2
    }.filter {
        it > 3
    }.flowOn(Dispatchers.Main).collect{
        println(it)
    }

    println("---")
}