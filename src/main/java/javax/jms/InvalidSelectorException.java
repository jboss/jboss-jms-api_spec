package javax.jms;

/**
 * <P> This exception must be thrown when a 
 *     JMS client attempts to give a provider a message selector with 
 *     invalid syntax.
 **/

public class InvalidSelectorException extends JMSException
{
   private static final long serialVersionUID = 6223038613086963841L;

   /** Constructs an <CODE>InvalidSelectorException</CODE> with the specified 
    *  reason and error code.
    *
    *  @param  reason        a description of the exception
    *  @param  errorCode     a string specifying the vendor-specific
    *                        error code
    *                        
    **/
   public InvalidSelectorException(String reason, String errorCode)
   {
      super(reason, errorCode);
   }

   /** Constructs an <CODE>InvalidSelectorException</CODE> with the specified 
    *  reason. The error code defaults to null.
    *
    *  @param  reason        a description of the exception
    **/
   public InvalidSelectorException(String reason)
   {
      super(reason);
   }

}
