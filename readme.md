java agent demo

java agent 是作用于虚拟机级别的类似 AOP 的能力。它用于打印日志等非业务场景，可以做到代码无侵入。本项目是使用 agent 实现模拟日志打印的 demo，供学习参考。

执行方式

```
gradle build
java -javaagent:build/libs/agent-demo-1.0-SNAPSHOT.jar cc.shixicheng.AgentTest
```

参考介绍博客：https://www.cnblogs.com/dongguangming/p/12990664.html