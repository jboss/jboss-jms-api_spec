package javax.jms;

/**
 * <P> This exception must be thrown when a 
 *     client attempts to set a connection's client ID to a value that 
 *     is rejected by a provider.
 **/

public class InvalidClientIDException extends JMSException
{
   private static final long serialVersionUID = 2410181719763491702L;

   /** Constructs an <CODE>InvalidClientIDException</CODE> with the specified 
    *  reason and error code.
    *
    *  @param  reason        a description of the exception
    *  @param  errorCode     a string specifying the vendor-specific
    *                        error code
    *                        
    **/
   public InvalidClientIDException(String reason, String errorCode)
   {
      super(reason, errorCode);
   }

   /** Constructs an <CODE>InvalidClientIDException</CODE> with the specified 
    *  reason. The error code defaults to null.
    *
    *  @param  reason        a description of the exception
    **/
   public InvalidClientIDException(String reason)
   {
      super(reason);
   }

}
