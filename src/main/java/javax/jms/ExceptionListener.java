package javax.jms;

/** If a JMS provider detects a serious problem with a <CODE>Connection</CODE>
 * object, it informs the <CODE>Connection</CODE> object's 
 * <CODE>ExceptionListener</CODE>, if one has been registered. 
 * It does this by calling the listener's <CODE>onException</CODE> method, 
 * passing it a <CODE>JMSException</CODE> argument describing the problem.
 *
 * <P>An exception listener allows a client to be notified of a problem 
 * asynchronously. Some connections only consume messages, so they would have no
 * other way to learn that their connection has failed.
 *
 * <P>A JMS provider should attempt to resolve connection problems 
 * itself before it notifies the client of them.
 *
 * @see javax.jms.Connection#setExceptionListener(ExceptionListener)
 */

public interface ExceptionListener
{

   /** Notifies user of a JMS exception.
    *
    * @param exception the JMS exception
    */

   void onException(JMSException exception);
}
