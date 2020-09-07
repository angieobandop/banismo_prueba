package co.com.bancolombia.certification.pruebasbanistmo.exceptions;


import java.util.NoSuchElementException;

@SuppressWarnings("serial")
public class WriteTxtException extends NoSuchElementException {
       
       public static final String MESSAGE_FAILED = "Error" ;
       public WriteTxtException(String message, Throwable testErrorException) {
              super();
              
       }

}
