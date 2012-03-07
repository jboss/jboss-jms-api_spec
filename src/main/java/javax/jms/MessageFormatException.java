package javax.jms;

/**
 * <P> This exception must be thrown when a JMS client 
 *     attempts to use a data type not supported by a message or attempts to 
 *     read data in a message as the wrong type. It must also be thrown when 
 *     equivalent type errors are made with message property values. For 
 *     example, this exception must be thrown if 
 *     <CODE>StreamMessage.writeObject</CODE> is given an unsupported class or 
 *     if <CODE>StreamMessage.readShort</CODE> is used to read a 
 *     <CODE>boolean</CODE> value. Note that the special case of a failure 
 *     caused by an attempt to read improperly formatted <CODE>String</CODE> 
 *     data as numeric values must throw the 
 *     <CODE>java.lang.NumberFormatException</CODE>.
 **/

public class MessageFormatException extends JMSException
{
   private static final long serialVersionUID = -3642297253594750138L;

   /** Constructs a <CODE>MessageFormatException</CODE> with the specified 
    *  reason and error code.
    *
    *  @param  reason        a description of the exception
    *  @param  errorCode     a string specifying the vendor-specific
    *                        error code
    *                        
    **/
   public MessageFormatException(String reason, String errorCode)
   {
      super(reason, errorCode);
   }

   /** Constructs a <CODE>MessageFormatException</CODE> with the specified 
    *  reason. The error code defaults to null.
    *
    *  @param  reason        a description of the exception
    **/
   public MessageFormatException(String reason)
   {
      super(reason);
   }

}
