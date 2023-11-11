package learn.ghar.spring.revise.catalogservice.controller

import learn.ghar.spring.revise.catalogservice.service.GreetingsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/greetings")
class GreetingController(val greetingsService: GreetingsService) {                  // service class-injection to 'controller

    @GetMapping("/{inputName}")
    fun retrieveGreeting(@PathVariable("inputName") name : String) : String{
        return greetingsService.retrieveGreeting(name)                              // invoking service-class to build the greeting
    }
}