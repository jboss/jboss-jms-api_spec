package javax.jms;

/**
 * <P> This exception must be thrown when a provider rejects a user 
 *     name/password submitted by a client. It may also be thrown for any case 
 *     where a security restriction prevents a method from completing.
 **/

public class JMSSecurityException extends JMSException
{
   private static final long serialVersionUID = -7512859695190450217L;

   /** Constructs a <CODE>JMSSecurityException</CODE> with the specified 
    *  reason and error code.
    *
    *  @param  reason        a description of the exception
    *  @param  errorCode     a string specifying the vendor-specific
    *                        error code
    *                        
    **/
   public JMSSecurityException(String reason, String errorCode)
   {
      super(reason, errorCode);
   }

   /** Constructs a <CODE>JMSSecurityException</CODE> with the specified 
    *  reason. The error code defaults to null.
    *
    *  @param  reason        a description of the exception
    **/
   public JMSSecurityException(String reason)
   {
      super(reason);
   }

}
