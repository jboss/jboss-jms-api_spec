package javax.jms;

/**
 * <P> This exception must be thrown when an unexpected 
 *     end of stream has been reached when a <CODE>StreamMessage</CODE> or 
 *     <CODE>BytesMessage</CODE> is being read.
 **/

public class MessageEOFException extends JMSException
{
   private static final long serialVersionUID = -4829621000056590895L;

   /** Constructs a <CODE>MessageEOFException</CODE> with the specified 
    *  reason and error code.
    *
    *  @param  reason        a description of the exception
    *  @param  errorCode     a string specifying the vendor-specific
    *                        error code
    *                        
    **/
   public MessageEOFException(String reason, String errorCode)
   {
      super(reason, errorCode);
   }

   /** Constructs a <CODE>MessageEOFException</CODE> with the specified 
    *  reason. The error code defaults to null.
    *
    *  @param  reason        a description of the exception
    **/
   public MessageEOFException(String reason)
   {
      super(reason);
   }

}
