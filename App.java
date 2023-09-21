package test_case.codes;

import java.net.MalformedURLException;

public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
        // TestCases tests = new TestCases(); // Initialize your test class
        AmazonSearch amazon = new AmazonSearch();
        // TODO: call your test case functions one after other here
        amazon.testCase01();
        // END Tests
        amazon.endTest(); // End your test by clearning connections and closing browser
        /*
         * CountHyperlinks count=new CountHyperlinks();
         * count.testcase02();
         * count.endTest();
         */
    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
}