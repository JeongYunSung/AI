package yunseong.grpc.client

import net.devh.boot.grpc.client.inject.GrpcClient
import org.springframework.stereotype.Component
import yunseong.grpc.UserServiceGrpcKt
import yunseong.grpc.dto.UserDto
import yunseong.grpc.userRequest

@Component
class UserGrpcClient {

    @GrpcClient("user-service")
    private lateinit var userServiceCoroutineStub: UserServiceGrpcKt.UserServiceCoroutineStub

    suspend fun getUser(userId: Int): UserDto {
        val request = userRequest {
            id = userId
        }
        val user = userServiceCoroutineStub.getUser(request)
        return UserDto(
            user.email,
            user.name
        )
    }
}