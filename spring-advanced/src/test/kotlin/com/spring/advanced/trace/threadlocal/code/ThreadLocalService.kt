package com.spring.advanced.trace.threadlocal.code

import mu.KotlinLogging

class ThreadLocalService {
    private val logger = KotlinLogging.logger {}
    private val nameStore: ThreadLocal<String> = ThreadLocal()

    fun logic(name: String): String{
        logger.info { "์ ์ฅ name=$name -> nameStore=${nameStore.get()}" }
        nameStore.set(name)
        sleep(1000)
        logger.info { "์กฐํ nameStore=${nameStore.get()}" }
        return nameStore.get()
    }

    private fun sleep(millis: Long) {
        try {
            Thread.sleep(millis)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
}