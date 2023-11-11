package learn.ghar.spring.revise.catalogservice.service

import org.springframework.stereotype.Service

@Service
class GreetingsService {

    fun retrieveGreeting(name : String) = "Hi $name"
}