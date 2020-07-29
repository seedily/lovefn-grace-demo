/**
 * 本目录为core目录，是系统的业务逻辑的主要实现
 * <p>
 * 以下为目录文件、子目录描述 ————
 * <p>
 * 根目录               :   SpringBoot的Application启动类，使自动扫描子路径的Spring配置类
 * autoconfigure       :   系统的自定义配置
 * manager             :   主要业务逻辑类，建议再做细化分包，鼓励采用设计模式使代码具备灵活性
 * repository          :   持久层的二次封装，要求具备可重用性（可以考虑做cache）
 * service.impl        :   RPC接口的表层实现，建议把逻辑下放到manager包，并做好异常的捕捉
 * task                :   定时任务类的表层实现，建议把逻辑下放到service包
 * web                 :   http服务的表层接口实现，建议把逻辑下放到service包
 */
package com.lovefn.demoproject.core;

