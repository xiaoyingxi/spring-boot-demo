package com.yuuyoo.demo.controller;

import com.yuuyoo.demo.model.DemoResult;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController extends Throwable {

  @GetMapping("/demo")
  @ApiOperation("测试接口")
  public DemoResult demo(@ApiParam("结果码") @RequestParam("code")String code){
    return DemoResult.builder()
        .code(code)
        .message("successful")
        .build();
  }

}
