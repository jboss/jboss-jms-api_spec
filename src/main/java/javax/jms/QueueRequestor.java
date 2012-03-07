package javax.jms;

/**
 * A queue requestor
 *
 * @author Chris Kimpton (chris@kimptoc.net)
 * @author Adrian Brock (adrian@jboss.com)
 * @version $Revision$
 */
public class QueueRequestor
{
   private QueueSession queueSession = null;

   private QueueSender requestSender = null;

   private QueueReceiver replyReceiver = null;

   private TemporaryQueue replyQueue = null;

   public QueueRequestor(QueueSession session, Queue queue) throws JMSException
   {
      queueSession = session;

      requestSender = queueSession.createSender(queue);
      replyQueue = queueSession.createTemporaryQueue();
      replyReceiver = queueSession.createReceiver(replyQueue);
   }

   public Message request(Message message) throws JMSException
   {
      message.setJMSReplyTo(replyQueue);
      message.setJMSDeliveryMode(DeliveryMode.NON_PERSISTENT);
      requestSender.send(message);
      return replyReceiver.receive();
   }

   public void close() throws JMSException
   {
      try
      {
         replyReceiver.close();
      }
      catch (JMSException ignored)
      {
      }
      try
      {
         replyQueue.delete();
      }
      catch (JMSException ignored)
      {
      }
      queueSession.close();
   }
}
