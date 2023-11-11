package learn.ghar.spring.revise.catalogservice.service

import org.springframework.stereotype.Service

/**
 * This annotation [@Service] serves as a specialization of @Component,
 * allowing for implementation classes to be autodetected through classpath scanning.
 *
 * @author Abbas Naqvi
 */
@Service
class GreetingsService {
    fun retrieveGreeting(name : String) = "Hi $name"
}