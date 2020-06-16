package com.lovefn.demoproject.api.vo.request;

import com.lovefn.grace.common.service.entity.IBaseRequestVo;
import lombok.Builder;
import lombok.Data;

/**
 * DemoReq
 */
@Data

@Builder
public class DemoReqVo implements IBaseRequestVo {

    private static final long serialVersionUID = 13526218681867L;

    private String runtime;
}
