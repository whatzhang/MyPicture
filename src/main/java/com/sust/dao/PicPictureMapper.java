package com.sust.dao;

import com.sust.entity.PicPicture;
import com.sust.entity.PicPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface PicPictureMapper {
    int countByExample(PicPictureExample example);

    int deleteByExample(PicPictureExample example);

    int deleteByPrimaryKey(Integer piId);

    int insert(PicPicture record);

    int insertSelective(PicPicture record);

    List<PicPicture> selectByExampleWithRowbounds(PicPictureExample example, RowBounds rowBounds);

    List<PicPicture> selectByExample(PicPictureExample example);

    PicPicture selectByPrimaryKey(Integer piId);

    int updateByExampleSelective(@Param("record") PicPicture record, @Param("example") PicPictureExample example);

    int updateByExample(@Param("record") PicPicture record, @Param("example") PicPictureExample example);

    int updateByPrimaryKeySelective(PicPicture record);

    int updateByPrimaryKey(PicPicture record);
}