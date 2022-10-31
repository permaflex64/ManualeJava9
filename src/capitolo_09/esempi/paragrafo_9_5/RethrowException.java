package capitolo_09.esempi.paragrafo_9_5;
public class RethrowException {
    class FirstException extends Exception { }
  class SecondException extends Exception { }

  public void rethrowException(String exceptionName) throws FirstException, 
      SecondException {
    try {
      if (exceptionName.equals("First")) {
        throw new FirstException();
      } else {
        throw new SecondException();
      }
    } catch (Exception e) {
      throw e;
    }
  }
}