package com.lovefn.grace.demo.dal.dao;

import com.lovefn.grace.demo.dal.model.TRegulateConfig;
import com.lovefn.grace.demo.dal.model.TRegulateConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * table : t_regulate_config
 * Created by Mybatis Generator on 2020-07-28
 */
@SuppressWarnings("all")
@Mapper
public interface TRegulateConfigMapper {
    long countByExample(TRegulateConfigExample example);

    int deleteByExample(TRegulateConfigExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(TRegulateConfig record);

    int insertSelective(TRegulateConfig record);

    List<TRegulateConfig> selectByExample(TRegulateConfigExample example);

    TRegulateConfig selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") TRegulateConfig record, @Param("example") TRegulateConfigExample example);

    int updateByExample(@Param("record") TRegulateConfig record, @Param("example") TRegulateConfigExample example);

    int updateByPrimaryKeySelective(TRegulateConfig record);

    int updateByPrimaryKey(TRegulateConfig record);

    int batchInsert(List<TRegulateConfig> records);

    int batchInsertSelective(@Param("records") List<TRegulateConfig> records, @Param("columns") String ... columns);
}