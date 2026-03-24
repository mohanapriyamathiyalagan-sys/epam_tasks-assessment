package core_java.hometask_languageConstructs;

import core_java.hometask_basics.vehicle_management.MainVehicleManagement;
import core_java.util.LoggerUtil;

import java.io.IOException;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
        LoggerUtil.setLoggerCapabilities(logger);
        logger.info("Here we are implemented the logic for language construct: ");
        LanguageConstructs lc = new LanguageConstructs();
        System.out.println(lc.caughtSpeeding(65, false));
        System.out.println(lc.love6(6,4));
        System.out.println(lc.teaParty(6,8));
        System.out.println(lc.blueTicket(9,1,0));
        System.out.println(lc.inOrder(1,2,4,false));
        System.out.println(lc.shareDigit(12,23));
        System.out.println(lc.sumLimit(2,3));
        System.out.println(lc.withoutString("Hello there", "llo"));
        System.out.println(lc.maxBlock("hoopla"));
    }
}
