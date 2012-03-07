package javax.jms;

/**
 * <P> This exception must be thrown when a JMS client attempts to read a 
 *     write-only message.
 **/

public class MessageNotReadableException extends JMSException
{
   private static final long serialVersionUID = 8044835867550650748L;

   /** Constructs a <CODE>MessageNotReadableException</CODE> with the specified 
    *  reason and error code.
    *
    *  @param  reason        a description of the exception
    *  @param  errorCode     a string specifying the vendor-specific
    *                        error code
    *                        
    **/
   public MessageNotReadableException(String reason, String errorCode)
   {
      super(reason, errorCode);
   }

   /** Constructs a <CODE>MessageNotReadableException</CODE> with the specified 
    *  reason. The error code defaults to null.
    *
    *  @param  reason        a description of the exception
    **/
   public MessageNotReadableException(String reason)
   {
      super(reason);
   }

}
