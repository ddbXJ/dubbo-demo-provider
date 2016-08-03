package com.lxj.filter;

import com.alibaba.dubbo.rpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lixuejiao on 16/8/3.
 */
public class AuthorityFilter implements Filter {
    Logger logger = LoggerFactory.getLogger(AuthorityFilter.class);

    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("AuthorityFilter");
        logger.info("AuthorityFilter");
        return invoker.invoke(invocation);
    }
}
