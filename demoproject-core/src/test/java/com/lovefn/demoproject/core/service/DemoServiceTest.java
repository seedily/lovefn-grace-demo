package com.lovefn.demoproject.core.service;

import com.lovefn.demoproject.api.entity.request.DemoReq;
import com.lovefn.demoproject.core.service.impl.DemoServiceImpl;
import com.lovefn.grace.common.service.template.ServiceTemplate;
import com.lovefn.grace.common.service.template.ServiceTemplateImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;


/**
 * DemoService
 */
@Slf4j
@RunWith(MockitoJUnitRunner.class)
public class DemoServiceTest {

    @InjectMocks
    private DemoServiceImpl demoService;

    @Before
    public void setUp() {
        ServiceTemplate serviceTemplate = new ServiceTemplateImpl();
        demoService.setServiceTemplate(serviceTemplate);
    }

    @Test
    public void testRun() {
        log.info("running testRun");
        String runtime = "12:00";
        DemoReq demoReq = DemoReq.builder().runtime(runtime).build();
        Assert.assertEquals(runtime, demoService.run(demoReq).getData().getRuntime());
    }

}
