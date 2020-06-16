package com.lovefn.demoproject.api.service;


import com.lovefn.demoproject.api.vo.request.DemoReqVo;
import com.lovefn.demoproject.api.vo.result.DemoResVo;
import com.lovefn.grace.common.service.entity.Response;


public interface DemoService {

    /**
     * demoService
     *
     * @param demoReqVo
     * @return
     */
    Response<DemoResVo> run(DemoReqVo demoReqVo);

    Response<DemoResVo> runInLambda(DemoReqVo demoReqVo);

}
