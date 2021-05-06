package cc.shixicheng;

import java.lang.instrument.Instrumentation;

public class CustomAgent {
    /**
     * 设置的 agent 会先执行 premain 方法
     * @param agentArgs
     * @param instrumentation
     */
    public static void premain(String agentArgs, Instrumentation instrumentation) {
        System.out.println("开始代理 Agent");

        CustomClassFileTransformer transformer = new CustomClassFileTransformer();
        instrumentation.addTransformer(transformer);
    }
}
