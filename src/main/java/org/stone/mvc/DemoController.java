package org.stone.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Peter on 12/6/16.
 */
@RestController
public class DemoController {
    @RequestMapping("/")
    public String hello(){
        return "Hello World";
    }
}
