package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mule.tck.junit4.FunctionalTestCase;
import org.junit.Rule;
import org.mule.tck.junit4.rule.DynamicPort;
public class HelloMavenTest extends FunctionalTestCase {
	
	@Rule
	public DynamicPort myPort = new DynamicPort("http.port");
    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
    	System.out.println("\n\nIn Testcase-1 Http port user ---------> " + myPort.getNumber() + "\n\n");
        runFlowAndExpect("mavenFlow", "Hello Maven");
    }
    
    @Override
    protected String getConfigFile() {
        return "maven-project.xml";
    }

}
