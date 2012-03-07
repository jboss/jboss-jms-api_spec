package javax.jms;

/** A <CODE>MessageListener</CODE> object is used to receive asynchronously 
 * delivered messages.
 *
 * <P>Each session must insure that it passes messages serially to the
 * listener. This means that a listener assigned to one or more consumers
 * of the same session can assume that the <CODE>onMessage</CODE> method 
 * is not called with the next message until the session has completed the 
 * last call.
 */

public interface MessageListener
{

   /** Passes a message to the listener.
    *
    * @param message the message passed to the listener
    */

   void onMessage(Message message);
}
