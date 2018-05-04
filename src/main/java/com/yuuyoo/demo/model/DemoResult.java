package com.yuuyoo.demo.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DemoResult {

  @ApiModelProperty("结果码")
  private String code;
  @ApiModelProperty("消息")
  private String message;
  @ApiModelProperty("内容")
  private Object content;

}
