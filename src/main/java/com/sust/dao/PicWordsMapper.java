package com.sust.dao;

import com.sust.entity.PicWords;
import com.sust.entity.PicWordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface PicWordsMapper {
    int countByExample(PicWordsExample example);

    int deleteByExample(PicWordsExample example);

    int deleteByPrimaryKey(Integer woId);

    int insert(PicWords record);

    int insertSelective(PicWords record);

    List<PicWords> selectByExampleWithRowbounds(PicWordsExample example, RowBounds rowBounds);

    List<PicWords> selectByExample(PicWordsExample example);

    PicWords selectByPrimaryKey(Integer woId);

    int updateByExampleSelective(@Param("record") PicWords record, @Param("example") PicWordsExample example);

    int updateByExample(@Param("record") PicWords record, @Param("example") PicWordsExample example);

    int updateByPrimaryKeySelective(PicWords record);

    int updateByPrimaryKey(PicWords record);
}