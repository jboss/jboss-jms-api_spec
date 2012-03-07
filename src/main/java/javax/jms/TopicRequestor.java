package javax.jms;

/**
 * Provides a basic request/reply layer ontop of JMS.
 * Pass the constructor details of the session/topic to send requests upon.
 * Then call the request method to send a request.  The method will block
 * until the reply is received.
 *
 * @author Chris Kimpton (chris@kimptoc.net)
 * @author adrian brock (adrian@jboss.com)
 * @version $Revision$
 */
public class TopicRequestor
{
   private TopicSession topicSession = null;

   private TopicPublisher requestPublisher = null;

   private TemporaryTopic responseTopic = null;

   private TopicSubscriber responseSubscriber = null;

   public TopicRequestor(TopicSession session, Topic topic) throws JMSException
   {
      topicSession = session;
      requestPublisher = topicSession.createPublisher(topic);
      responseTopic = topicSession.createTemporaryTopic();
      responseSubscriber = topicSession.createSubscriber(responseTopic);
   }

   public Message request(Message message) throws JMSException
   {
      message.setJMSReplyTo(responseTopic);
      requestPublisher.publish(message);
      return responseSubscriber.receive();
   }

   public void close() throws JMSException
   {
      try
      {
         responseSubscriber.close();
      }
      catch (JMSException ignored)
      {
      }
      try
      {
         responseTopic.delete();
      }
      catch (JMSException ignored)
      {
      }
      topicSession.close();
   }
}
