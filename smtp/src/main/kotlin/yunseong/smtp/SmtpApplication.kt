package yunseong.smtp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SmtpApplication

fun main(args: Array<String>) {
    runApplication<SmtpApplication>(*args)
}