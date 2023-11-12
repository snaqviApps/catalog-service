package learn.ghar.spring.revise.catalogservice.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

/**
 * This annotation [@Service] serves as a specialization of @Component,
 * allowing for implementation classes to be autodetected through classpath scanning.
 *
 * @author:  Abbas Naqvi
 *
 */
@Service
class GreetingsService {

    @Value("\${message}")               // reading from yml file for profile information
    lateinit var singleMessage : String
    fun retrieveGreeting(name : String) = "$name $singleMessage"
}