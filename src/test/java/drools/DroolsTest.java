package drools;

import com.cike.drools.entity.Order;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * @Author Kou
 * @Date 2020/10/9
 * @Version 1.0
 **/
public class DroolsTest {

    @Test
    public void test1() {
        KieServices kieServices = KieServices.Factory.get();
        //获得kie容器对象
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        //从kie容器对象中获取会话对象
        KieSession kieSession = kieContainer.newKieSession();
        //Fact对象，事实对象
        Order order = new Order();
        order.setOriginalPrice(500d);
        //将Order对象插入到工作内存
        kieSession.insert(order);
        //激活规则，由Drools框架自动进行规则匹配，如果规则匹配成功，则执行当前规则
        kieSession.fireAllRules();
        //关闭会话
        kieSession.dispose();
        System.out.println("优惠后的价格："+order.getRealPrice());
    }
}
