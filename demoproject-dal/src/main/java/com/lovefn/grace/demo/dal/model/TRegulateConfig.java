package com.lovefn.grace.demo.dal.model;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * table : t_regulate_config
 * Created by Mybatis Generator on 2020-08-18
 */
@SuppressWarnings("all")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TRegulateConfig implements Serializable {
    /**
     * 自增主键
     */
    private Integer fid;

    /**
     * 渠道ID
     */
    private Integer fchannelId;

    /**
     * 优先级
     */
    private Integer fpriority;

    /**
     * 是否生效：1-是，0否
     */
    private Integer factiveFlag;

    /**
     * 逻辑删除标记：1-是，0否
     */
    private Integer fdelFlag;

    /**
     * 历史累计改动次数
     */
    private Integer fmodCount;

    /**
     * 该管控渠道的哈希
     */
    private String fhash;

    /**
     * 创建人
     */
    private String fcreateUser;

    /**
     * 创建时间
     */
    private Date fcreateTime;

    /**
     * 修改人
     */
    private String fmodifyUser;

    /**
     * 修改时间
     */
    private Date fmodifyTime;

    /**
     * 修改详情
     */
    private String fmodifyDesc;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fid=").append(fid);
        sb.append(", fchannelId=").append(fchannelId);
        sb.append(", fpriority=").append(fpriority);
        sb.append(", factiveFlag=").append(factiveFlag);
        sb.append(", fdelFlag=").append(fdelFlag);
        sb.append(", fmodCount=").append(fmodCount);
        sb.append(", fhash=").append(fhash);
        sb.append(", fcreateUser=").append(fcreateUser);
        sb.append(", fcreateTime=").append(fcreateTime);
        sb.append(", fmodifyUser=").append(fmodifyUser);
        sb.append(", fmodifyTime=").append(fmodifyTime);
        sb.append(", fmodifyDesc=").append(fmodifyDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TRegulateConfig other = (TRegulateConfig) that;
        return (this.getFid() == null ? other.getFid() == null : this.getFid().equals(other.getFid()))
            && (this.getFchannelId() == null ? other.getFchannelId() == null : this.getFchannelId().equals(other.getFchannelId()))
            && (this.getFpriority() == null ? other.getFpriority() == null : this.getFpriority().equals(other.getFpriority()))
            && (this.getFactiveFlag() == null ? other.getFactiveFlag() == null : this.getFactiveFlag().equals(other.getFactiveFlag()))
            && (this.getFdelFlag() == null ? other.getFdelFlag() == null : this.getFdelFlag().equals(other.getFdelFlag()))
            && (this.getFmodCount() == null ? other.getFmodCount() == null : this.getFmodCount().equals(other.getFmodCount()))
            && (this.getFhash() == null ? other.getFhash() == null : this.getFhash().equals(other.getFhash()))
            && (this.getFcreateUser() == null ? other.getFcreateUser() == null : this.getFcreateUser().equals(other.getFcreateUser()))
            && (this.getFcreateTime() == null ? other.getFcreateTime() == null : this.getFcreateTime().equals(other.getFcreateTime()))
            && (this.getFmodifyUser() == null ? other.getFmodifyUser() == null : this.getFmodifyUser().equals(other.getFmodifyUser()))
            && (this.getFmodifyTime() == null ? other.getFmodifyTime() == null : this.getFmodifyTime().equals(other.getFmodifyTime()))
            && (this.getFmodifyDesc() == null ? other.getFmodifyDesc() == null : this.getFmodifyDesc().equals(other.getFmodifyDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFid() == null) ? 0 : getFid().hashCode());
        result = prime * result + ((getFchannelId() == null) ? 0 : getFchannelId().hashCode());
        result = prime * result + ((getFpriority() == null) ? 0 : getFpriority().hashCode());
        result = prime * result + ((getFactiveFlag() == null) ? 0 : getFactiveFlag().hashCode());
        result = prime * result + ((getFdelFlag() == null) ? 0 : getFdelFlag().hashCode());
        result = prime * result + ((getFmodCount() == null) ? 0 : getFmodCount().hashCode());
        result = prime * result + ((getFhash() == null) ? 0 : getFhash().hashCode());
        result = prime * result + ((getFcreateUser() == null) ? 0 : getFcreateUser().hashCode());
        result = prime * result + ((getFcreateTime() == null) ? 0 : getFcreateTime().hashCode());
        result = prime * result + ((getFmodifyUser() == null) ? 0 : getFmodifyUser().hashCode());
        result = prime * result + ((getFmodifyTime() == null) ? 0 : getFmodifyTime().hashCode());
        result = prime * result + ((getFmodifyDesc() == null) ? 0 : getFmodifyDesc().hashCode());
        return result;
    }
}