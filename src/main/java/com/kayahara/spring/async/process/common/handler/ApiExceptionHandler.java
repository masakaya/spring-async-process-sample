package com.kayahara.spring.async.process.common.handler;

import com.kayahara.spring.async.process.common.exception.BusinessErrorException;
import com.kayahara.spring.async.process.common.exception.DataNotFoundException;
import com.kayahara.spring.async.process.common.exception.result.ExceptionResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Error handling
 *
 * @author masashi kayahara.
 */
@Slf4j
@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

  /**
   * Return Data not found exception.
   *
   * @param ex Exception
   * @return response
   */
  @ExceptionHandler(DataNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public @ResponseBody
  ExceptionResult handleDataNotFoundException(
      DataNotFoundException ex) {
    log.error("Data not found.");
    return ex.getResult();

  }

  @ExceptionHandler
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public @ResponseBody
  ExceptionResult handleDataNotFoundException(
      BusinessErrorException ex) {
    log.error("Business. Exception.");
    return ex.getResult();
  }

}
