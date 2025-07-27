package yunseong.ai.gemini

import org.springframework.ai.chat.client.ChatClient
import org.springframework.stereotype.Service

@Service
class SimpleChatService(
    chatClientBuilder: ChatClient.Builder
) {

    private val chatClient: ChatClient = chatClientBuilder.build()

    fun chat(message: String): String {
        return chatClient.prompt().user(message).call().content()!!
    }
}