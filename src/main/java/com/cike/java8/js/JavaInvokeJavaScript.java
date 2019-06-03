package com.cike.java8.js;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Description Java 中调用 JavaScript
 * @Author kou
 * @Version 1.0
 **/
public class JavaInvokeJavaScript {
    public static void main(String args[]) throws Exception {

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval("print('Hello World!');");

        JavaInvokeJavaScript javaInvokeJavaScript = new JavaInvokeJavaScript();
        javaInvokeJavaScript.invokeJsFunction();


    }

    public void invokeJsFunction() throws Exception {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        File file = new File(this.getClass().getResource("/js/sample1.js").getPath());
        System.out.println(file);

        engine.eval(new FileReader(file));
        Invocable invocable = (Invocable) engine;
        Object result = invocable.invokeFunction("fun1", "Peter Parker");
        System.out.println(result);
        System.out.println(result.getClass());

        invocable.invokeFunction("fun2", new Date());

        invocable.invokeFunction("fun2", LocalDateTime.now());

        invocable.invokeFunction("fun2", new Person());
    }
}
