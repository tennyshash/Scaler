package Design_Pattern.adapter;
import Design_Pattern.adapter.ILogger;
import Design_Pattern.adapter.thirdParty.Log4J.log4JSDK;
public class Log4JADAPTER implements ILogger {
    private log4JSDK logObj= new log4JSDK();
    @Override
    public void log(String message) {
        logObj.sendSteam(message);
    }
}
