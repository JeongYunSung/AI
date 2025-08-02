package yunseong.flyway.entity

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@Entity(name = "member_entity")
@EntityListeners(AuditingEntityListener::class)
class MemberEntity(
    @[Id GeneratedValue(strategy = GenerationType.IDENTITY)]
    val id: Long,
    val username: String,
    val password: String,
    val name: String,
    @CreatedDate
    @Column(updatable = false)
    val createdAt: LocalDateTime,
    @LastModifiedDate
    val updatedAt: LocalDateTime,
)