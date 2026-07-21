package com.wipro.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    TestStringConcat.class,
    TestSort.class,
    TestCheckPresence.class
})
public class TestSuite {

}