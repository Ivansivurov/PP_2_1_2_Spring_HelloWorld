import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 = applicationContext.getBean(HelloWorld.class);
        Cat catBean2 = applicationContext.getBean(Cat.class);
        Cat catBean3 = applicationContext.getBean(Cat.class);
        System.out.println(bean == bean1);
        System.out.println(catBean3 == catBean2);
    }
}