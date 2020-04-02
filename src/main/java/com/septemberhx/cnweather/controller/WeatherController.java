package com.septemberhx.cnweather.controller;

import com.septemberhx.cnweather.utils.MBaseUtils;
import com.septemberhx.common.bean.MResponse;
import com.septemberhx.mclient.annotation.MFuncDescription;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/3/30
 */
@Controller
public class WeatherController {

    @PostMapping(path = "/weather")
    @ResponseBody
    @MFuncDescription(value = "weather", level = 2)
    public MResponse weather(HttpServletRequest request) {
        return MBaseUtils.generateResInKBSize(20);
    }
}
