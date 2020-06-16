package com.lovefn.demoproject.core.service;

import com.lovefn.demoproject.api.vo.request.DemoReqVo;
import com.lovefn.demoproject.core.service.impl.DemoServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
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

    @Test
    public void testRun() {
        log.info("running testRun");
        String runtime = "12:00";
        DemoReqVo demoReqVo = DemoReqVo.builder().runtime(runtime).build();
        Assert.assertEquals(runtime, demoService.run(demoReqVo).getData().getRuntime());
    }

}
