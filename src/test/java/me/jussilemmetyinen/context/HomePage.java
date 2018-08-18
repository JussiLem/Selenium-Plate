package me.jussilemmetyinen.context;

import com.google.common.flogger.FluentLogger;
import me.jussilemmetyinen.utils.EnvironmentManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomePage extends EnvironmentManager {


    private static FluentLogger logger = FluentLogger.forEnclosingClass();

    @Test
    void checkThatTitleIsCorrect() {

        logger.atInfo().log("Open the page and check the title");
        String appURL = "http://www.google.fi";
        driver.get(appURL);
        assertEquals("Google", driver.getTitle());
    }
}