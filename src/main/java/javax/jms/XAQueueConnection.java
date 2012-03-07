package javax.jms;

/** An <CODE>XAQueueConnection</CODE> provides the same create options as 
 * <CODE>QueueConnection</CODE> (optional).  
 * The only difference is that an <CODE>XAConnection</CODE> is by definition 
 * transacted.
 *
 *<P>The <CODE>XAQueueConnection</CODE> interface is optional.  JMS providers 
 * are not required to support this interface. This interface is for 
 * use by JMS providers to support transactional environments. 
 * Client programs are strongly encouraged to use the transactional support
 * available in their environment, rather than use these XA
 * interfaces directly. 
 *
 * @see         javax.jms.XAConnection
 */

public interface XAQueueConnection extends XAConnection, QueueConnection
{

   /** Creates an <CODE>XAQueueSession</CODE> object.
    *  
    * @return a newly created <CODE>XAQueueSession</CODE>
    *  
    * @exception JMSException if the <CODE>XAQueueConnection</CODE> object 
    *                         fails to create an XA queue session due to some
    *                         internal error.
    */

   XAQueueSession createXAQueueSession() throws JMSException;

   /** Creates an <CODE>XAQueueSession</CODE> object.
    *
    * @param transacted       usage undefined
    * @param acknowledgeMode  usage undefined
    *  
    * @return a newly created <CODE>XAQueueSession</CODE>
    *  
    * @exception JMSException if the <CODE>XAQueueConnection</CODE> object 
    *                         fails to create an XA queue session due to some
    *                         internal error.
    */
   QueueSession createQueueSession(boolean transacted, int acknowledgeMode) throws JMSException;
}
