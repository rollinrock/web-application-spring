package studio.rollinrock.maven.archetypes.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import studio.rollinrock.maven.archetypes.response.HttpResp;

import javax.servlet.http.HttpServletRequest;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2019-01-04 10:53
 * @description
 **/

@Slf4j
@Order //default value is Ordered.LOWEST_PRECEDENCE, indicating the lowest priority
@ControllerAdvice(annotations = {RestController.class/*, Controller.class*/})
public class LastOrderedControllerAdvice {

    @Value("${date.format.pattern}")
    private String dateFormatPattern = "yyyy-MM-dd hh:mm:ss";

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addCustomFormatter(new DateFormatter(dateFormatPattern));
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public HttpResp handle(Exception e, HttpServletRequest request){
        log.error("接口[uri:{}]处理异常:{}", request.getRequestURI(), e.getMessage()/*, e*/);
        return HttpResp.of(e);
    }



}
