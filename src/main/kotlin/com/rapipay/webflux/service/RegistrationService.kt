package com.rapipay.webflux.service

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
import org.springframework.stereotype.Service
import java.util.*
import java.util.function.Function

@Service
@Transactional
@AllArgsConstructor
class RegistrationService(private val registrationRepository: RegistrationRepository) {

    fun getAll(): Flux<Student?> {
        return registrationRepository.findAll()
    }

    fun getById(id: String): Mono<Student?> {
        return registrationRepository.findById(id)
    }

    fun update(id: String?, student: Student): Mono<*> {
        return registrationRepository.save(student)
    }

    fun save(student: Student): Mono<*> {
        return registrationRepository.save(student)
    }


    fun delete(id: String): Mono<*> {
        val dbStudent = getById(id)
        return registrationRepository.delete(dbStudent.toProcessor().block())
    }
}