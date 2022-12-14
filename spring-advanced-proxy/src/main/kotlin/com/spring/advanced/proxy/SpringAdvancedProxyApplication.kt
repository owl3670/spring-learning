package com.spring.advanced.proxy

import com.spring.advanced.proxy.config.v6_aop.AopConfig
import com.spring.advanced.proxy.trace.logtrace.LogTrace
import com.spring.advanced.proxy.trace.logtrace.ThreadLocalLogTrace
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Import

//@Import(AppV1Config::class, AppV2Config::class)
//@Import(InterfaceProxyConfig::class)
//@Import(ConcreteProxyConfig::class)
//@Import(DynamicProxyBasicConfig::class)
//@Import(DynamicProxyFilterConfig::class)
//@Import(ProxyFactoryConfigV1::class)
//@Import(ProxyFactoryConfigV2::class)
//@Import(BeanPostProcessorConfig::class)
//@Import(AutoProxyConfig::class)
@Import(AopConfig::class)
@SpringBootApplication(scanBasePackages = ["com.spring.advanced.proxy.app"])
class SpringAdvancedProxyApplication{
    @Bean
    fun logTrace(): LogTrace {
        return ThreadLocalLogTrace()
    }
}

fun main(args: Array<String>) {
    runApplication<SpringAdvancedProxyApplication>(*args)
}
