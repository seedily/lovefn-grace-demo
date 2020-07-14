package com.lovefn.demoproject.api.vo.result;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * DemoResult
 */
@Data
@Builder
public class DemoResVo implements Serializable {

    private static final long serialVersionUID = 83526217681861L;

    private String runtime;
}
