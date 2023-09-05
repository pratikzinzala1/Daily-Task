package temp

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlin.coroutines.suspendCoroutine


fun main() {

    temp3()


}

fun temp3() {
    runBlocking {

        val job = CoroutineScope(Dispatchers.Default).async {

            val data = withContext(Dispatchers.IO) {
                delay(500)
                "hello"
            }
            println(data)
            val data2 = withContext(Dispatchers.IO) {
                delay(500)
                "world"
            }
            println(data2)
            data+data2
        }
//        job.join()
        println(job.await())

    }

}

suspend fun <T : Any> getValue(provider: () -> T): T =
    suspendCoroutine { continuation ->
        continuation.resumeWith(Result.runCatching { provider() })
    }

suspend fun <T : Any> getValue2(provider: () -> T): T =
    suspendCoroutine { continuation ->
        continuation.resumeWith(Result.success(provider()))
    }

fun temp2() {
    runBlocking {

        val job = CoroutineScope(Dispatchers.Default).launch {

            CoroutineScope(Dispatchers.Default).launch {

                println("1 start at ${Thread.currentThread().name}")
                delay(1000)
                println("1 end at ${Thread.currentThread().name}")

            }

            CoroutineScope(Dispatchers.Default).launch {

                println("2 start at ${Thread.currentThread().name}")
                delay(1000)
                println("2 end at ${Thread.currentThread().name}")

            }
            CoroutineScope(Dispatchers.Default).launch {

                println("3 start at ${Thread.currentThread().name}")
                delay(1000)
                println("3 end at ${Thread.currentThread().name}")

            }
        }
        job.join()

    }
}

fun temp1() {

    runBlocking {

        val job = CoroutineScope(Dispatchers.Default).launch {

            for (i in 1..100) {

                withContext(Dispatchers.IO) {

                    println("$i start at ${Thread.currentThread().name}")
                    delay(1000)
                    println("$i end at ${Thread.currentThread().name}")

                }

            }

//            val job1 = launch {
//                println("One ${Thread.currentThread().name}")
//                delay(1000)
//                println("One finished ${Thread.currentThread().name}")
//            }
//            val job2 = launch {
//                println("Two ${Thread.currentThread().name}")
//                delay(1000)
//                println("Two finished ${Thread.currentThread().name}")
//            }
//            val job3 = launch {
//                println("Three ${Thread.currentThread().name}")
//                delay(1000)
//                println("Three finished ${Thread.currentThread().name}")
//            }

        }

        job.join()
    }
}

fun ex3() {
    var isDoorOpen = false
    println("Unlocking the door... please wait.\n")
    GlobalScope.launch {
        delay(3000)
        isDoorOpen = true
    }
    GlobalScope.launch {
        repeat(4) {
            println("Trying to open the door...\n")
            delay(800)
            if (isDoorOpen) {
                println("Opened the door!\n")
            } else {
                println("The door is still locked\n")
            }
        }
    }
    Thread.sleep(5000)
}

fun ex2() {
    with(GlobalScope) {
        val parentJob = launch() {
            delay(200)
            println("I'm the parent")
            delay(200)
        }
        launch(context = parentJob) {
            delay(200)
            println("I'm a child")
            delay(200)
        }
        if (parentJob.children.iterator().hasNext()) {
            println("The Job has children ${parentJob.children}")
        } else {
            println("The Job has NO children")
        }
        Thread.sleep(1000)
    }
}

fun ex1() {
    val job1 = GlobalScope.launch(start = CoroutineStart.LAZY) {
        delay(200)
        println("Pong")
        delay(200)
    }

    GlobalScope.launch() {
        delay(200)
        println("Ping")
        job1.join()
        println("Ping")
        delay(200)
    }
    Thread.sleep(1000)
}


fun downloadImage() {

    runBlocking {

        val job = GlobalScope.launch {
            for (i in 1..8) {

                val parentJob = launch() {
                    println("Downloading started $i on ${Thread.currentThread().name}")
                    delay(3000)

                    println("Parent completed")
                }

                val childJob = launch(context = parentJob) {
                    delay(4000)
                    println("Downloading finished $i on ${Thread.currentThread().name}")
                }
                childJob.join()
            }
        }

        job.join()

    }

}

suspend fun doDownload(number: Int) {

}

