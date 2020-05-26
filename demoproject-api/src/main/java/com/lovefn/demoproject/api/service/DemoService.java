package com.lovefn.demoproject.api.service;


import com.lovefn.demoproject.api.entity.request.DemoReq;
import com.lovefn.demoproject.api.entity.result.DemoResult;
import com.lovefn.grace.common.service.entity.Response;


public interface DemoService {

    /**
     * demoService
     *
     * @param demoReq
     * @return
     */
    Response<DemoResult> run(DemoReq demoReq);

}
