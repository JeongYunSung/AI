extra["springAiVersion"] = "1.0.0"

dependencies {
    implementation("org.springframework.ai:spring-ai-starter-model-vertex-ai-gemini")
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.ai:spring-ai-bom:${property("springAiVersion")}")
    }
}