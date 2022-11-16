import interfaces.Observer;
import model.EmailTopic;
import model.EmailTopicSubscriber;

public class Main {
    public static void main(String[] args) {
        EmailTopic topic = new EmailTopic();

        //observers
        Observer observer1 = new EmailTopicSubscriber("first");
        Observer observer2 = new EmailTopicSubscriber("second");
        Observer observer3 = new EmailTopicSubscriber("third");

        //register
        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);

        //attach observer to subject
        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);

        //check for updates
        observer1.update();

        //broadcast
        topic.postMessage("Hello all!");
    }
}