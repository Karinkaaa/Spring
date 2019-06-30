package spring.component;


import org.springframework.stereotype.Component;

@Component
public class OperationComponent {

    public int add(int a, int b, int param3) {
        return a + b;
    }
}
