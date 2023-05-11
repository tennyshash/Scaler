package Design_Pattern.adapter;

import Design_Pattern.adapter.thirdParty.LoggerADAPTER;

public class loggerFactory {
    public static ILogger getLoggerFromMe(String name){
        if(name.equals("Log4J")){
            return  new slo4JADAPTER();
        }
        return new LoggerADAPTER();
    }
}
