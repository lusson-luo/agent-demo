package cc.shixicheng;

import java.lang.instrument.Instrumentation;

public class CustomAgent {
    public static void premain(String agentArgs, Instrumentation instrumentation) {
        System.out.println("开始代理 Agent");

        CustomClassFileTransformer transformer = new CustomClassFileTransformer();
        instrumentation.addTransformer(transformer);
    }
}
