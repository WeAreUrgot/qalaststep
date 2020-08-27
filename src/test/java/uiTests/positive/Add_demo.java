package uiTests.positive;

import baseEntity.BaseTest;
import models.User;
import org.testng.annotations.Test;
import steps.*;

public class Add_demo extends BaseTest {

    @Test
    public void addMilestones() {
        User user = new User.Builder()
                .withEmail("varvarukie@gmail.com")
                .withPassword("youwillbowtome")
                .build();
        Login logStep = new Login(browsersService);
        logStep.login(user);

        Dashboard dashboardStep = new Dashboard(browsersService);
        dashboardStep.addProject();

        AddProject addProjectStep = new AddProject(browsersService);
        addProjectStep.addNewProject("OMG!DAT IS DIPLOMA!", "Use a single repository for all cases (recommended)");
        dashboardStep.enterProject();

        AddMile addMilestonesStep = new AddMile(browsersService);
        addMilestonesStep.addMilestones();

    }
}

