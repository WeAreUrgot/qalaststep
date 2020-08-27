package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;

public class Mile_demo extends BaseStep {

    public Mile_demo(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void milestones() {
        MilestonesPage milestonesPage = new MilestonesPage(browsersService);

        milestonesPage.editStonesButton.click();
    }
}
