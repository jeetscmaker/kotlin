import kotlinx.coroutines.*

fun main() {
    val x = runBlocking {
        println("Thread name: ${Thread.currentThread().name} starts")

        // A coroutine:
        launch {
            println("Thread name: ${Thread.currentThread().name} starts")
            delay(3000)
            println("Thread name: ${Thread.currentThread().name} ends")
        }
        delay(6000)
        println("Thread name: ${Thread.currentThread().name} ends")
    }
    GlobalScope.async {
        println("Thread name: ${Thread.currentThread().name} starts")
        println("Thread name: ${Thread.currentThread().name} ends")
    }
}