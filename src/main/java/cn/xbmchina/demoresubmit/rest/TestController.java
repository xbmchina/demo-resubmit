package cn.xbmchina.demoresubmit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：xbm
 * @date ：Created in 2020/12/1 17:45
 * @description：
 */
@Controller
@RequestMapping("/test")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @ResponseBody
    @PostMapping(value = "/str")
    public String queryStr(@RequestBody String json) {
        logger.info("json : {}", json);
        return "ok";
    }

}
