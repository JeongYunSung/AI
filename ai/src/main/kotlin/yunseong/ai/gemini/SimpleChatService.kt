package yunseong.ai.gemini

import org.springframework.ai.chat.client.ChatClient
import org.springframework.stereotype.Service
import yunseong.ai.gemini.tools.DateTimeTools


@Service
class SimpleChatService(
    chatClientBuilder: ChatClient.Builder
) {

    private val chatClient: ChatClient = chatClientBuilder.build()

    fun chat(message: String): String {
        return chatClient.prompt().user(message).call().content()!!
    }

    fun time(): String {
        return chatClient.prompt("지금 시각의 yyyyMMdd'T'HH24mmss'Z'에 대한 시간을 가져와줘").tools(DateTimeTools()).call().content()!!
    }
}