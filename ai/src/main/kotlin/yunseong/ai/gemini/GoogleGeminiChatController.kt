package yunseong.ai.gemini

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/google-gemini")
class GoogleGeminiChatController(
    private val simpleChatService: SimpleChatService
) {

    @PostMapping("/chat")
    fun chat(@RequestBody message: String): ChatResponse {
        return ChatResponse(simpleChatService.chat(message))
    }

    @GetMapping("/time")
    fun time(): ChatResponse {
        return ChatResponse(simpleChatService.time())
    }
}

data class ChatResponse(val message: String)