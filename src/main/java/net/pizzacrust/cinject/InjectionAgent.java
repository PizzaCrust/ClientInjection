package net.pizzacrust.cinject;

import java.lang.instrument.Instrumentation;

/**
 * The entry class for the agent.
 *
 * @author PizzaCrust
 */
public class InjectionAgent {
    /**
     * The Minecraft class mapping for the compatible version of the Injection agent.
     */
    public static final String MINECRAFT_CLASS_MAPPING = "bcf";

    /**
     * The entry method for Java to start the agent.
     * @param agentArguments the arguments the executor has launched the agent with
     * @param instrumentation the instrumentation obj
     */
    public static void premain(String agentArguments, Instrumentation instrumentation) {
        System.out.println("ClientInjection > Injected Mixins into class loader!");
    }
}
