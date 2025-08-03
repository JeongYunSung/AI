package yunseong.grpc.controller

import kotlinx.coroutines.runBlocking
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import yunseong.grpc.client.UserGrpcClient
import yunseong.grpc.dto.UserDto

@RestController
@RequestMapping("/api/user")
class UserController(
    private val userGrpcClient: UserGrpcClient
) {

    @GetMapping
    fun getUser(): UserDto {
        return runBlocking {
            userGrpcClient.getUser(1)
        }
    }
}