package com.demo.version

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@PropertySource(value = "classpath:META-INF/com/demo/version.properties")
class VersionConfig {

}
