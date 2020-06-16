package com.lovefn.demoproject.api.vo.result;

import com.lovefn.grace.common.service.entity.IBaseResultVo;
import lombok.Builder;
import lombok.Data;

/**
 * DemoResult
 */
@Data
@Builder
public class DemoResVo implements IBaseResultVo {

    private static final long serialVersionUID = 83526217681861L;

    private String runtime;
}
