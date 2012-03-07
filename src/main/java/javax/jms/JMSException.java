package javax.jms;

/**
 * <P>This is the root class of all JMS API exceptions.
 *
 * <P>It provides the following information:
 * <UL>
 *   <LI> A provider-specific string describing the error. This string is 
 *        the standard exception message and is available via the
 *        <CODE>getMessage</CODE> method.
 *   <LI> A provider-specific string error code 
 *   <LI> A reference to another exception. Often a JMS API exception will 
 *        be the result of a lower-level problem. If appropriate, this 
 *        lower-level exception can be linked to the JMS API exception.
 * </UL>
 **/

public class JMSException extends Exception
{
   private static final long serialVersionUID = 8951994251593378324L;

   /** Vendor-specific error code.
    **/
   private String errorCode;

   /** <CODE>Exception</CODE> reference.
    **/
   private Exception linkedException;

   /** Constructs a <CODE>JMSException</CODE> with the specified reason and 
    *  error code.
    *
    *  @param  reason        a description of the exception
    *  @param  errorCode     a string specifying the vendor-specific
    *                        error code
    **/
   public JMSException(String reason, String errorCode)
   {
      super(reason);
      this.errorCode = errorCode;
      linkedException = null;
   }

   /** Constructs a <CODE>JMSException</CODE> with the specified reason and with
    *  the error code defaulting to null.
    *
    *  @param  reason        a description of the exception
    **/
   public JMSException(String reason)
   {
      super(reason);
      this.errorCode = null;
      linkedException = null;
   }

   /** Gets the vendor-specific error code.
    *  @return   a string specifying the vendor-specific
    *                        error code
    **/
   public String getErrorCode()
   {
      return this.errorCode;
   }

   /**
    * Gets the exception linked to this one.
    *
    * @return the linked <CODE>Exception</CODE>, null if none
    **/
   public Exception getLinkedException()
   {
      return (linkedException);
   }

   /**
    * Adds a linked <CODE>Exception</CODE>.
    *
    * @param ex       the linked <CODE>Exception</CODE>
    **/
   public synchronized void setLinkedException(Exception ex)
   {
      linkedException = ex;
   }
}
