package com.sust.dao;

import com.sust.entity.PicUsers;
import com.sust.entity.PicUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface PicUsersMapper {
    int countByExample(PicUsersExample example);

    int deleteByExample(PicUsersExample example);

    int deleteByPrimaryKey(Integer usId);

    int insert(PicUsers record);

    int insertSelective(PicUsers record);

    List<PicUsers> selectByExampleWithRowbounds(PicUsersExample example, RowBounds rowBounds);

    List<PicUsers> selectByExample(PicUsersExample example);

    PicUsers selectByPrimaryKey(Integer usId);

    int updateByExampleSelective(@Param("record") PicUsers record, @Param("example") PicUsersExample example);

    int updateByExample(@Param("record") PicUsers record, @Param("example") PicUsersExample example);

    int updateByPrimaryKeySelective(PicUsers record);

    int updateByPrimaryKey(PicUsers record);

	int selectUsidByName(String name);
}