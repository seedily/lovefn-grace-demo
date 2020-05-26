package com.lovefn.demoproject.api.entity.request;

import com.lovefn.grace.common.service.entity.BaseRequest;
import lombok.Builder;
import lombok.Data;

/**
 * DemoReq
 */
@Data

@Builder
public class DemoReq extends BaseRequest {

    private static final long serialVersionUID = 13526218681867L;

    private String runtime;
}
