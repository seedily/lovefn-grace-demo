## 项目简介

## 功能特性

## 环境依赖

## 部署步骤

## 目录结构描述
    grace-demo      :   根目录
       |-api        :   对外接口数据类型，包括Vo、service接口
       |-core       :   核心业务逻辑（api模块的业务实现、web服务、定时任务），并作为部署包，包含相关配置，内部包说明见package-info.java
       |-dal        :   持久层数据类型（可选），包括Dao(如Mybatis的mapper)、Dto
       
    其中，core作为核心业务逻辑模块，里面又做了细致的包名划分，规则如下：
     * 根目录               :   指顶级包目录，如com.tencent.ard.xxx.core，仅存放SpringBoot的Application启动类
     * autoconfigure       :   系统的自定义配置
     * manager             :   主要业务逻辑类，建议再做细化分包，鼓励采用设计模式使代码具备灵活性
     * repository          :   持久层的二次封装，要求具备可重用性（可以考虑做cache）
     * service.impl        :   RPC接口的表层实现，建议把逻辑下放到manager包，并做好异常的捕捉
     * task                :   定时任务类的表层实现，建议把逻辑下放到service包
     * web                 :   http服务的表层接口实现，建议把逻辑下放到service包
    
## 版本内容更新
    注意：api层发生修改时，包括新增或者调整接口、参数，则需要调整系统的version，使产生新的依赖包，与旧的依赖包共存在mvn仓库中，避免覆盖
    