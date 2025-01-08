package com.fuki.hatimmatik.infrastructure

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig : WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry) {
        registry
            .addMapping("/**") // Tüm endpoint'ler için geçerli
            .allowedOrigins("*") // Tüm domain'lere izin ver
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH") // İzin verilen HTTP metotları
            .allowedHeaders("*") // Tüm header'lara izin ver
            .maxAge(3600) // Pre-flight isteklerin geçerlilik süresi (saniye)
    }
}
