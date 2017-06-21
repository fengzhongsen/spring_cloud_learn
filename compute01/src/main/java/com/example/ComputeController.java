package com.example;

import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fengz on 2017/05/03.
 */
@RestController
@Log4j
public class ComputeController {
    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a,@RequestParam Integer b) {
        log.info(">>>>>----- Compute:10001 ----->");
        return a + b;
    }
}
