package javax.jms;

/**
 * <P> This exception must be thrown when a 
 *     call to <CODE>Session.commit</CODE> results in a rollback of the current 
 *     transaction.
 **/

public class TransactionRolledBackException extends JMSException
{
   private static final long serialVersionUID = 9157976009672865857L;

   /** Constructs a <CODE>TransactionRolledBackException</CODE> with the 
    *  specified reason and error code.
    *
    *  @param  reason        a description of the exception
    *  @param  errorCode     a string specifying the vendor-specific
    *                        error code
    *                        
    **/
   public TransactionRolledBackException(String reason, String errorCode)
   {
      super(reason, errorCode);
   }

   /** Constructs a <CODE>TransactionRolledBackException</CODE> with the 
    *  specified reason. The error code defaults to null.
    *
    *  @param  reason        a description of the exception
    **/
   public TransactionRolledBackException(String reason)
   {
      super(reason);
   }

}
