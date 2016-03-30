# ClientInjection
An PizzaMixin example. Prints out this text: ```"ClientInjection > Injection has injected to the client successfully!"``` after client has done booting.
## Injecting

- Retrieve a PizzaMixin JAR
- Retrieve a ClientInjection JAR
- Retrieve a compatible Minecraft client **from the launcher.**
- Place the PizzaMixin and ClientInjection JAR into your .minecraft directory.
- Add these JVM arguments ($ <- stands for variable): ```-javaagent:$MIXINLOCATION.jar=$INJECTIONLOCATION.jar -javaagent:$INJECTIONLOCATION.jar``` to your profile JVM args.