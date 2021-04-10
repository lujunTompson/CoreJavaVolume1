package JavaCore.Ninth;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestProxy {
    @Test
    public void note() {

    }

}

interface Speaker {
    public void speak();
}

class LawyerProxy implements InvocationHandler {

    private Object object;

    public LawyerProxy(Object obj) {
        this.object = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("speak")) {
            System.out.println("引用法律条文");
            method.invoke(object, args);
            System.out.println("打人是不对的");
        }
        return null;
    }
}

class ZhangSan implements Speaker {

    @Override
    public void speak() {
        System.out.println("我老婆打我");
    }
}

class ZhangSanLawer implements Speaker {
    //代理类中有一个实例的本体
    private ZhangSan zhangSan = new ZhangSan();

    @Override
    public void speak() {
        System.out.println("引用法律条文");
        zhangSan.speak();
        System.out.println("打人是不对的");
    }
}

class Demo {
    public static void main(String[] args) {
        //静态代理
        Speaker speaker = new ZhangSanLawer();
        speaker.speak();
        //动态代理 本体必须实现接口
        LawyerProxy lawyerProxy = new LawyerProxy(new ZhangSan());
        Speaker speaker1 = (Speaker) Proxy.newProxyInstance(Demo.class.getClassLoader(),
                new Class[]{Speaker.class}, lawyerProxy);
        speaker1.speak();
        //CGLib_动态代理 是JDK代理的补充，不要求本体实现接口
        String name = speaker1.getClass().getSimpleName();
        System.out.println(name);
    }
}
