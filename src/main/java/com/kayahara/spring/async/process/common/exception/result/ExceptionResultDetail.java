package com.kayahara.spring.async.process.common.exception.result;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "of")
public class ExceptionResultDetail {

  /**
   * DebugId.
   */
  private String debugId;

  /**
   * resolve message.
   */
  private String resolveMessage;

}
