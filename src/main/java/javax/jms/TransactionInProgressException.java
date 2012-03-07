package javax.jms;

/**
 * <P> This exception is thrown when an 
 *     operation is invalid because a transaction is in progress. 
 *     For instance, an attempt to call <CODE>Session.commit</CODE> when a 
 *     session is part of a distributed transaction should throw a 
 *     <CODE>TransactionInProgressException</CODE>.
 **/

public class TransactionInProgressException extends JMSException
{
   private static final long serialVersionUID = -5611340150426335231L;

   /** Constructs a <CODE>TransactionInProgressException</CODE> with the 
    *  specified reason and error code.
    *
    *  @param  reason        a description of the exception
    *  @param  errorCode     a string specifying the vendor-specific
    *                        error code
    *                        
    **/
   public TransactionInProgressException(String reason, String errorCode)
   {
      super(reason, errorCode);
   }

   /** Constructs a <CODE>TransactionInProgressException</CODE> with the 
    *  specified reason. The error code defaults to null.
    *
    *  @param  reason        a description of the exception
    **/
   public TransactionInProgressException(String reason)
   {
      super(reason);
   }

}
