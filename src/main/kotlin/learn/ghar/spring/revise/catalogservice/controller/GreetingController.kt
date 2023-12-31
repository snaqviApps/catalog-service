package learn.ghar.spring.revise.catalogservice.controller

import learn.ghar.spring.revise.catalogservice.service.GreetingsService
import mu.KLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/greetings")
class GreetingController(val greetingsService: GreetingsService) {                  // service class-injection to 'controller

    companion object : KLogging()

    @GetMapping("/{inputName}")
    fun retrieveGreeting(@PathVariable("inputName") name : String) : String{

        logger.info { "Name is $name" }
        return greetingsService.retrieveGreeting(name)                              // invoking service-class to build the greeting
    }
}