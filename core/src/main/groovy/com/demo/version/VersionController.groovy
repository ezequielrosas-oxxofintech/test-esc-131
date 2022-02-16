package com.demo.version

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class VersionController {

    @Value("\${my.version}")
    String version

    @ResponseBody
    @RequestMapping(path = "/version", method = RequestMethod.GET)
    String version() {
        return version
    }
}
