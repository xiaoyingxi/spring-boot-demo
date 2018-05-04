package com.yuuyoo.demo.controller;

import com.yuuyoo.demo.exception.DemoException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

  @GetMapping("/test")
  public void test() throws DemoException {
    log.debug("if you see this,it's work!");
    throw new DemoException("测试异常");
  }

}
