package com.teamnet.app.accountmanager.cucumber.stepdefs;

import com.teamnet.app.accountmanager.AccountmanagerApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AccountmanagerApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
