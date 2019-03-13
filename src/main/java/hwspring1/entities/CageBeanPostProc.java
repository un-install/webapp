package hwspring1.entities;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CageBeanPostProc implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Cage cage = null;
        if (bean instanceof Cage) {
            System.out.println("Postprocessing Cage");
            cage = (Cage) bean;
            cage.setSquere(6);
        }
        return cage;
    }
}
