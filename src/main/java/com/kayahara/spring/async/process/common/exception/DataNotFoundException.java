package com.kayahara.spring.async.process.common.exception;

import com.kayahara.spring.async.process.common.exception.result.ExceptionResult;
import com.kayahara.spring.async.process.common.exception.result.ExceptionResultDetail;
import com.kayahara.spring.async.process.common.exception.result.ExceptionType;

/**
 * Resource not found Exception
 *
 * @author masashi.kayahara
 */
public class DataNotFoundException extends AbstractApplicationException {

  /**
   * Exception Type
   */
  private static final ExceptionType type = ExceptionType.DATA_NOT_FOUND;

  /**
   * Constructor
   *
   * @param result result.
   */
  public DataNotFoundException(ExceptionResultDetail result) {
    super(new ExceptionResult(type.name(), result));
  }
}
