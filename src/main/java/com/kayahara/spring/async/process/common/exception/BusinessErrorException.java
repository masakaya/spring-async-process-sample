package com.kayahara.spring.async.process.common.exception;

import com.kayahara.spring.async.process.common.exception.result.ExceptionResult;
import com.kayahara.spring.async.process.common.exception.result.ExceptionResultDetail;
import com.kayahara.spring.async.process.common.exception.result.ExceptionType;

/**
 * Business Error Exception.
 *
 * @author masashi.kayahara
 */
public class BusinessErrorException extends AbstractApplicationException {

  /**
   * Exception Type
   */
  private static final ExceptionType type = ExceptionType.BUSINESS_ERROR;

  /**
   * Constructor
   *
   * @param result exception result.
   */
  public BusinessErrorException(ExceptionResultDetail result) {
    super(new ExceptionResult(type.name(), result));
  }

}
