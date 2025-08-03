package yunseong.grpc.exception

import io.grpc.Status
import net.devh.boot.grpc.server.advice.GrpcAdvice
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.ExceptionHandler

@Component
class GrpcExceptionHandler {

    @GrpcAdvice
    @ExceptionHandler(IllegalArgumentException::class)
    fun handleIllegalArgument(ex: IllegalArgumentException): Status {
        return Status.INVALID_ARGUMENT.withDescription(ex.message)
    }

    @GrpcAdvice
    @ExceptionHandler(NoSuchElementException::class)
    fun handleNotFound(ex: NoSuchElementException): Status {
        return Status.NOT_FOUND.withDescription(ex.message)
    }
}