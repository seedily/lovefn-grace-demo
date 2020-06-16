package com.lovefn.demoproject.core.web;


import com.lovefn.demoproject.api.vo.request.DemoReqVo;
import com.lovefn.demoproject.api.vo.result.DemoResVo;
import com.lovefn.demoproject.api.service.DemoService;
import com.lovefn.grace.common.service.entity.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoController
 */
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    /**
     * test
     */
    @RequestMapping(path = "test", method = {RequestMethod.GET})
    public String test() {
        return "test"; //for test
    }

    /**
     * test
     */
    @RequestMapping(path = "test/service", method = {RequestMethod.GET})
    public Response<DemoResVo> testService() {
        DemoReqVo req = DemoReqVo.builder()
                .runtime("run on :" + System.currentTimeMillis())
                .build();
        return demoService.run(req);
    }
}
