package com.rapipay.webflux

import lombok.AllArgsConstructor
import org.springframework.transaction.annotation.Transactional
import org.springframework.beans.factory.annotation.Autowired
import com.rapipay.webflux.repository.RegistrationRepository
import reactor.core.publisher.Flux
import com.rapipay.webflux.bean.Student
import reactor.core.publisher.Mono
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.rapipay.webflux.service.RegistrationService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import kotlin.jvm.JvmStatic
import org.springframework.boot.SpringApplication

@SpringBootApplication
open class WebfluxApplication

fun main(args: Array<String>)
{
    SpringApplication.run(WebfluxApplication::class.java, *args)
}