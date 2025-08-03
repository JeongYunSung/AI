package yunseong.smtp.service

import org.springframework.mail.MailSender
import org.springframework.mail.SimpleMailMessage
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service

@Service
class EmailService(
    private val mailSender: MailSender
) {

    @Async
    fun sendSimpleEmail(to: String, subject: String, text: String) {
        val message = SimpleMailMessage().apply {
            setTo(to)
            setSubject(subject)
            setText(text)
        }

        mailSender.send(message)
    }
}