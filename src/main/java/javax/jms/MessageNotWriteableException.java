package javax.jms;

/**
 * <P> This exception must be thrown when a JMS client attempts to write to a 
 *     read-only message.
 **/

public class MessageNotWriteableException extends JMSException
{
   private static final long serialVersionUID = -4241931174711518830L;

   /** Constructs a <CODE>MessageNotWriteableException</CODE> with the specified 
    *  reason and error code.
    *
    *  @param  reason        a description of the exception
    *  @param  errorCode     a string specifying the vendor-specific
    *                        error code
    *                        
    **/
   public MessageNotWriteableException(String reason, String errorCode)
   {
      super(reason, errorCode);
   }

   /** Constructs a <CODE>MessageNotWriteableException</CODE> with the specified 
    *  reason. The error code defaults to null.
    *
    *  @param  reason        a description of the exception
    **/
   public MessageNotWriteableException(String reason)
   {
      super(reason);
   }

}
