package yunseong.ai.gemini.tools

import org.springframework.ai.tool.annotation.Tool
import org.springframework.context.i18n.LocaleContextHolder
import java.time.LocalDateTime

class DateTimeTools {

    @Tool(description = "PC의 Timezone을 기반으로 시간을 가져온다.")
    fun getCurrentDateTime(): String {
        return LocalDateTime.now().atZone(LocaleContextHolder.getTimeZone().toZoneId()).toString()
    }
}