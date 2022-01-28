package com.rapipay.webflux.controller

import com.rapipay.webflux.bean.Student
import com.rapipay.webflux.service.RegistrationService
import lombok.AllArgsConstructor
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RequestMapping("adminDept")
@AllArgsConstructor
@RestController
class RegistrationController(private val registrationService: RegistrationService){


    @GetMapping
    fun getAll(): Flux<Student?> {
        println("::will return all Student record::")
        return registrationService.getAll()
    }

    @GetMapping("{id}")
    fun getById(@PathVariable("id") id: String): Mono<Student?>? {
        println("::will return a Student record::")
        return registrationService.getById(id)
    }

    @PutMapping("{id}")
    fun updateById(@PathVariable("id") id: String?, @RequestBody student: Student): Mono<*>? {
        println("::update the Student record::")
        return registrationService.update(id, student)
    }

    @PostMapping
    fun save(@RequestBody student: Student): Mono<*>? {
        println("will insert the student's record :: " + student.id + " :: " + student.firstName)
        return registrationService.save(student)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: String): Mono<*>? {
        println("::will delete a Student record::")
        return registrationService.delete(id)
    }
}