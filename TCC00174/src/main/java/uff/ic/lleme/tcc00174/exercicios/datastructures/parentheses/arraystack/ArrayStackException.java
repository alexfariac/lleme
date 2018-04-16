package uff.ic.lleme.tcc00174.exercicios.datastructures.parentheses.arraystack;

/**
 * Exception class for access in empty containers such as stacks, queues, and
 * priority queues.
 *
 * @author Mark Allen Weiss
 */
public class ArrayStackException extends RuntimeException {

  /**
   * Construct this exception object.
   *
   * @param message the error message.
   */
  public ArrayStackException(String message) {
    super(message);
  }
}