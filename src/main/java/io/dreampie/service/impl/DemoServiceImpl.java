package io.dreampie.service.impl;

import io.dreampie.service.DemoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wangrenhui on 2017/2/28.
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Transactional
    public void test() {
        System.out.println("Test");
    }
}
