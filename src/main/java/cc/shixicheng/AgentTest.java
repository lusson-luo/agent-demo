package cc.shixicheng;

public class AgentTest {
    public static void main(String[] args) {
        AgentTest sm = new AgentTest();
        System.out.println("准备进入测试阶段");
        sm.print();
    }

    public void print() {
        System.out.println("真正的业务方法");
    }
}
