package com.lovefn.demoproject.api.vo.request;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * DemoReq
 */
@Data

@Builder
public class DemoReqVo implements Serializable {

    private static final long serialVersionUID = 13526218681867L;

    private String runtime;
}
