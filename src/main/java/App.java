import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 = applicationContext.getBean("helloworld",HelloWorld.class);
        Cat catBean = applicationContext.getBean("cat", Cat.class);
        Cat catBean1 = applicationContext.getBean("cat", Cat.class);
        System.out.println(bean==bean1);
        System.out.println(catBean==catBean1);
    }
}