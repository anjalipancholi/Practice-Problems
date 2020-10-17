package array;

import java.util.Stack;

public class ImplementQueueUsingStacks {

  /**
   * Initialize your data structure here.
   */


  Stack<Integer> mainStack = new Stack<>();
  Stack<Integer> extraStack = new Stack<>();


  /**
   * Push element x to the back of queue.
   */
  public void push(int x) {
    mainStack.push(x);
  }

  /**
   * Removes the element from in front of queue and returns that element.
   */
  public int pop() {
    while (!mainStack.isEmpty()) {
      extraStack.push(mainStack.pop());
    }
    int result = extraStack.pop();
    while (!extraStack.isEmpty()) {
      mainStack.push(extraStack.pop());
    }
    return result;

  }

  /**
   * Get the front element.
   */
  public int peek() {
    while (!mainStack.isEmpty()) {
      extraStack.push(mainStack.pop());
    }
    int result = extraStack.peek();
    while (!extraStack.isEmpty()) {
      mainStack.push(extraStack.pop());
    }
    return result;

  }

  /**
   * Returns whether the queue is empty.
   */
  public boolean empty() {
    return mainStack.isEmpty();
  }
}
