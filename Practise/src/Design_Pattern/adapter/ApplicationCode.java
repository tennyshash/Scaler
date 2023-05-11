package Design_Pattern.adapter;

public class ApplicationCode {
    ILogger loggerObj= loggerFactory.getLoggerFromMe("log4j");//Using  Factory Method.
    public ApplicationCode( ILogger loggerObj){//Using Dependency Injection
        // we cant take logger obj from client as well or use factory and define in factory
        this.loggerObj=loggerObj;
    }
}
// Many logging libraries - having methods
// - Log4J => sendStream()
// - Logger => printLog()
// - Slo4j =>out()