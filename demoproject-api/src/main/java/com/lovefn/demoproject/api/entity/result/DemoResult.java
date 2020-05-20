package com.lovefn.demoproject.api.entity.result;

import com.lovefn.grace.common.service.entity.BaseResult;
import lombok.Builder;
import lombok.Data;

/**
 * DemoResult
 */
@Data
@Builder
public class DemoResult extends BaseResult {

    private static final long serialVersionUID = 83526217681861L;

    private String runtime;
}
