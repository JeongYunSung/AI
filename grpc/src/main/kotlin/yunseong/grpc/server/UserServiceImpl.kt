package yunseong.grpc.server

import net.devh.boot.grpc.server.service.GrpcService
import yunseong.grpc.*

@GrpcService
class UserServiceImpl : UserServiceGrpcKt.UserServiceCoroutineImplBase() {

    override suspend fun getUser(request: UserRequest): UserResponse {
        return userResponse {
            name = "JYS"
            email = "123dbstjd@gmail.com"
        }
    }
}