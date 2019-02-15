package studio.rollinrock.maven.archetypes.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import studio.rollinrock.maven.archetypes.response.HttpResp;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2019-01-04 18:01
 * @description
 **/
@RestController
public class TestController {

    @Value("${message}")
    private String message;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public HttpResp<Boolean> test(){
        throw new IllegalArgumentException("nonono");
    }

    @GetMapping("/ckie")
    public HttpResp<String> cookie(@CookieValue("msg") String msg) {
//        if (null == msg || "".equalsIgnoreCase(msg))
//            return HttpResp.fail("cookie已失效，请检查");
        return HttpResp.succeed("没问题");
    }

    @GetMapping("ckie_set")
    public HttpResp<Void> set(@CookieValue(value = "msg", required = false) String msg, HttpServletResponse response) {
        if (null == msg || "".equalsIgnoreCase(msg)) {
            Cookie cookie = new Cookie("msg", "helloworld");
            cookie.setMaxAge(10); // an expiry of 10 secs.
            response.addCookie(cookie);
        }

        return HttpResp.succeed(null);
    }
}
