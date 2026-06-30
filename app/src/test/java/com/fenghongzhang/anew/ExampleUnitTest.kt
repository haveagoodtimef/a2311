package com.fenghongzhang.anew

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import org.junit.Test

import org.junit.Assert.*
import kotlin.random.Random

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        Random(1).nextInt()
    }

    @Test
    suspend fun test(){
        coroutineScope {
            delay(1000)
            println(1)
        }
        println(2)
    }
}