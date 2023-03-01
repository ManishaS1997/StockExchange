package dataImport.exchange.exceptions;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StockNotFoundException extends RuntimeException{

}
