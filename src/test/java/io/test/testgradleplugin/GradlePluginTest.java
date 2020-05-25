package io.test.testgradleplugin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class GradlePluginTest {

    private static final Logger LOG = LoggerFactory.getLogger(GradlePluginTest.class);

    @Test
    public void wrongSyntaxTest() {
        LOG.info("wrongSyntaxTest");
    }
}
