package com.example;

import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fengz on 2017/05/03.
 */
@RestController
@Log4j
public class ComputeController {

    @RequestMapping(value = "/add")
    public Integer add(Integer a,Integer b) {
        log.info(">>>>>----- Compute02:10004 ----->");
        return a + b;
    }
}
