package baseEntity;

import core.BrowsersService;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePageFactory {
    protected static final int WAIT_FOR_PAGE_LOAD_IN_SECONDS = 10;
    protected final BrowsersService browsersService;

    protected abstract void openPage();

    public abstract boolean isPageOpened();

    public BasePageFactory(BrowsersService browsersService,boolean OpenByUrl) {
        this.browsersService = browsersService;
        PageFactory.initElements(browsersService.getDriver(), this);

        if (OpenByUrl) {
            openPage();
        }
        waitForOpen();
    }

    protected void waitForOpen() {
        int secondsCount = 0;
        boolean PageOpenedTrigger = isPageOpened();
        while (!PageOpenedTrigger && secondsCount < WAIT_FOR_PAGE_LOAD_IN_SECONDS) {
            browsersService.sleep(1000);
            secondsCount++;
            PageOpenedTrigger = isPageOpened();
        }
        if (!PageOpenedTrigger) {
            throw new AssertionError("PAGE Not Opened! LOL!");
        }
    }
}
