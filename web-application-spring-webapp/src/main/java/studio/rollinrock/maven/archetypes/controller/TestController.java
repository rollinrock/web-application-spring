package studio.rollinrock.maven.archetypes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import studio.rollinrock.maven.archetypes.response.HttpResp;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2019-01-04 18:01
 * @description
 **/
@RestController
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public HttpResp<Boolean> test(){
        throw new IllegalArgumentException("bububu");
    }
}
