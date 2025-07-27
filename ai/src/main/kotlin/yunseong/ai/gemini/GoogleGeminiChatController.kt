package yunseong.ai.gemini

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/google-gemini")
class GoogleGeminiChatController(
    private val simpleChatService: SimpleChatService
) {

    @PostMapping("/chat")
    fun chat(@RequestBody message: String): ChatResponse {
        return ChatResponse(simpleChatService.chat(message))
    }
}

data class ChatResponse(val message: String)