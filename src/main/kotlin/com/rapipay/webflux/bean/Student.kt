package com.rapipay.webflux.bean

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
import lombok.Builder
import lombok.Data
import lombok.ToString
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
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Data
@Builder
@AllArgsConstructor
@Document
@ToString
class Student {
    @Id
    var id: String? = null
    var firstName: String? = null
    var lastName: String? = null
}