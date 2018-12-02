package com.kayahara.spring.async.process.common.exception;

import com.kayahara.spring.async.process.common.exception.result.ExceptionResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Application exception
 *
 * @author masashi.kayahara
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public abstract class AbstractApplicationException extends RuntimeException {

  /**
   * Exception result definition.
   */
  private ExceptionResult result;
}
