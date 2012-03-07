package javax.jms;

/**
 * <P> This exception must be thrown when a 
 *     destination either is not understood by a provider or is no 
 *     longer valid.
 **/

public class InvalidDestinationException extends JMSException
{
   private static final long serialVersionUID = -8588063794606036755L;

   /** Constructs an <CODE>InvalidDestinationException</CODE> with the specified 
    *  reason and error code.
    *
    *  @param  reason        a description of the exception
    *  @param  errorCode     a string specifying the vendor-specific
    *                        error code
    *                        
    **/
   public InvalidDestinationException(String reason, String errorCode)
   {
      super(reason, errorCode);
   }

   /** Constructs an <CODE>InvalidDestinationException</CODE> with the specified 
    *  reason. The error code defaults to null.
    *
    *  @param  reason        a description of the exception
    **/
   public InvalidDestinationException(String reason)
   {
      super(reason);
   }

}
