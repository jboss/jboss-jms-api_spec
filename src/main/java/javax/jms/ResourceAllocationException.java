package javax.jms;

/**
 * <P>This exception is thrown when a provider is unable to allocate the 
 *    resources required by a method. For example, this exception should be 
 *    thrown when a call to 
 *    <CODE>TopicConnectionFactory.createTopicConnection</CODE> fails due to a
 *    lack of JMS provider resources.
 **/

public class ResourceAllocationException extends JMSException
{
   private static final long serialVersionUID = -1172695755360706776L;

   /** Constructs a <CODE>ResourceAllocationException</CODE> with the specified 
    *  reason and error code.
    *
    *  @param  reason        a description of the exception
    *  @param  errorCode     a string specifying the vendor-specific
    *                        error code
    *                        
    **/
   public ResourceAllocationException(String reason, String errorCode)
   {
      super(reason, errorCode);
   }

   /** Constructs a <CODE>ResourceAllocationException</CODE> with the specified 
    *  reason. The error code defaults to null.
    *
    *  @param  reason        a description of the exception
    **/
   public ResourceAllocationException(String reason)
   {
      super(reason);
   }

}
