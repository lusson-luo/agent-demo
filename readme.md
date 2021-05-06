java agent demo

java agent 是作用于虚拟机级别的类似 AOP 的能力。它用于打印日志等非业务场景，可以做到代码无侵入。

agent 可以启动时设置 -javaagent:xxx 来附加；也可以直接附加已运行的 java 进程上，通过 pid。

pid 方式 demo：https://github.com/thegreystone/java-svc/tree/master/attach

本项目是启动时设置 -javaagent:xxx 来实现模拟日志打印的 demo，供学习参考。

执行方式

```
gradle build
java -javaagent:build/libs/agent-demo-1.0-SNAPSHOT.jar cc.shixicheng.AgentTest
```

参考介绍博客：https://www.cnblogs.com/dongguangming/p/12990664.html