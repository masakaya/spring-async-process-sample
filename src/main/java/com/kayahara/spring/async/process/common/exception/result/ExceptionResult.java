package com.kayahara.spring.async.process.common.exception.result;

import lombok.Value;

@Value
public class ExceptionResult {

  /**
   * Error type.
   */
  private String type;

  /**
   * Exception detail's.
   */
  private ExceptionResultDetail detail;
}
