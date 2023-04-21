package pga.com.api.common;

public class ResponseEntity<T> {
  public boolean success;
  public String message;
  public T data;
  
  public ResponseEntity(boolean success, String message, T data) {
    this.success = success;
    this.message = message;
    this.data = data;
  }
}