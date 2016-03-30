package net.pizzacrust.cinject;

import net.pizzacrust.mixin.Inject;
import net.pizzacrust.mixin.Mixin;

/**
 * A minecraft client injection.
 *
 * @author PizzaCrust
 */
@Mixin(InjectionAgent.MINECRAFT_CLASS_MAPPING)
public class MinecraftMixin {
    /**
     * Declares the startGame method here, as a method injection.
     */
    @Inject(Inject.Execution.AFTER)
    /**
     * The startGame method with a obfuscated name.
     */
    public void an() {
        System.out.println("ClientInjection > Injection has injected to the client successfully!");
    }
}
