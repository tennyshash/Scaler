package Design_Pattern.adapter.thirdParty;

import Design_Pattern.adapter.ILogger;
import Design_Pattern.adapter.thirdParty.Logger.loggerAPI;

public class LoggerADAPTER implements ILogger {
    private loggerAPI loggerapi= new loggerAPI();
    public void log(String message) {
        loggerapi.printLog(message.getBytes());
    }
}
