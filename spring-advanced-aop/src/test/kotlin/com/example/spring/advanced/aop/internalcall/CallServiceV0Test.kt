package com.example.spring.advanced.aop.internalcall

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@Import(CallLogAspect::class)
@SpringBootTest
class CallServiceV0Test {
    @Autowired
    lateinit var callServiceV0: CallServiceV0

    @Test
    fun external(){
        callServiceV0.external()
    }

    @Test
    fun internal(){
        callServiceV0.internal()
    }
}