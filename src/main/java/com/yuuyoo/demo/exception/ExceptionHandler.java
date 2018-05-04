package com.yuuyoo.demo.exception;

import lombok.Builder;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandler {

  @Builder
  @Value
  static class ExceptionInfo {
    String message;
    String code;
  }

  @org.springframework.web.bind.annotation.ExceptionHandler(DemoException.class)
  public @ResponseBody
  ResponseEntity<ExceptionInfo> handleDemoException(DemoException ex) {
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
        ExceptionInfo.builder().message(ex.getMessage())
            .code(String.valueOf(HttpStatus.CONFLICT))
            .build());
  }

}
