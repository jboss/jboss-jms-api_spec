package javax.jms;

import java.util.Enumeration;

/** A <CODE>ConnectionMetaData</CODE> object provides information describing the 
 * <CODE>Connection</CODE> object.
 */

public interface ConnectionMetaData
{

   /** Gets the JMS API version.
    *
    * @return the JMS API version
    *  
    * @exception JMSException if the JMS provider fails to retrieve the
    *                         metadata due to some internal error.
    */
   public String getJMSVersion() throws JMSException;

   /** Gets the JMS major version number.
    *  
    * @return the JMS API major version number
    *  
    * @exception JMSException if the JMS provider fails to retrieve the
    *                         metadata due to some internal error.
    */
   public int getJMSMajorVersion() throws JMSException;

   /** Gets the JMS minor version number.
    *  
    * @return the JMS API minor version number
    *  
    * @exception JMSException if the JMS provider fails to retrieve the
    *                         metadata due to some internal error.
    */
   public int getJMSMinorVersion() throws JMSException;

   /** Gets the JMS provider name.
    *
    * @return the JMS provider name
    *  
    * @exception JMSException if the JMS provider fails to retrieve the
    *                         metadata due to some internal error.
    */
   public String getJMSProviderName() throws JMSException;

   /** Gets the JMS provider version.
    *
    * @return the JMS provider version
    *  
    * @exception JMSException if the JMS provider fails to retrieve the
    *                         metadata due to some internal error.
    */
   public String getProviderVersion() throws JMSException;

   /** Gets the JMS provider major version number.
    *  
    * @return the JMS provider major version number
    *  
    * @exception JMSException if the JMS provider fails to retrieve the
    *                         metadata due to some internal error.
    */
   public int getProviderMajorVersion() throws JMSException;

   /** Gets the JMS provider minor version number.
    *  
    * @return the JMS provider minor version number
    *  
    * @exception JMSException if the JMS provider fails to retrieve the
    *                         metadata due to some internal error.
    */
   public int getProviderMinorVersion() throws JMSException;

   /** Gets an enumeration of the JMSX property names.
    *  
    * @return an Enumeration of JMSX property names
    *  
    * @exception JMSException if the JMS provider fails to retrieve the
    *                         metadata due to some internal error.
    */
   public Enumeration getJMSXPropertyNames() throws JMSException;
}
