package com.lovefn.demoproject.core.service.impl;

import com.lovefn.demoproject.api.service.DemoService;
import com.lovefn.demoproject.api.vo.request.DemoReqVo;
import com.lovefn.demoproject.api.vo.result.DemoResVo;
import com.lovefn.demoproject.core.manager.DemoManager;
import com.lovefn.grace.common.api.entity.Response;
import com.lovefn.grace.common.code.callback.ServiceCallback;
import com.lovefn.grace.common.code.exception.ServiceFailException;
import com.lovefn.grace.common.code.template.ServiceTemplate;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * create on 20190825
 */
@Data
@Slf4j
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoManager demoManager;

    @Override
    public Response<DemoResVo> run(DemoReqVo demoReqVo) {
        Response response = ServiceTemplate.execute(new ServiceCallback() {
            @Override
            public void lock() {
                log.info("run lock");
            }

            @Override
            public void unlock() {
                log.info("run unlock");
            }

            @Override
            public DemoResVo executeService() throws ServiceFailException {
                return demoManager.runDemoLogic(demoReqVo);
            }
        });
        return response;
    }


    @Override
    public Response<DemoResVo> runInLambda(DemoReqVo demoReqVo) {
        Response response = ServiceTemplate.execute(() -> {
            return demoManager.runDemoLogic(demoReqVo);
        });
        return response;
    }

    @Override
    public Response<DemoResVo> testErr(DemoReqVo demoReqVo) {
        Response response = ServiceTemplate.execute(() -> {
            throw new RuntimeException("testErr");
        });
        return response;
    }

}
