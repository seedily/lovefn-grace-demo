package com.lovefn.demoproject.core.manager;

import com.lovefn.demoproject.api.vo.request.DemoReqVo;
import com.lovefn.demoproject.api.vo.result.DemoResVo;
import com.lovefn.demoproject.core.repository.DemoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * create on 20190825
 */
@Slf4j
@Component
public class DemoManager {

    @Autowired
    private DemoRepository demoRepository;

    /**
     * 示例
     *
     * @return : 专注于结果对象<T>
     */
    public DemoResVo runDemoLogic(DemoReqVo demoReqVo) {
        DemoResVo demoResVo = DemoResVo.builder().runtime("" + System.currentTimeMillis()).build();
        return demoResVo;
    }

}
