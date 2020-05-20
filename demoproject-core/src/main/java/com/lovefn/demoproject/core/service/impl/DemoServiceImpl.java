package com.lovefn.demoproject.core.service.impl;

import com.lovefn.demoproject.api.entity.request.DemoReq;
import com.lovefn.demoproject.api.entity.result.DemoResult;
import com.lovefn.demoproject.api.service.DemoService;
import com.lovefn.grace.common.service.entity.Response;
import com.lovefn.grace.common.service.template.ServiceTemplate;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * create on 20190825
 */
@Data
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private ServiceTemplate serviceTemplate;

    @Override
    public Response<DemoResult> run(DemoReq demoReq) {
        Response response = serviceTemplate.execute(() -> {
            DemoResult demoResult = DemoResult.builder().runtime(demoReq.getRuntime()).build();
            return demoResult;
        });
        return response;
    }
}
