package domain.team.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface TeamMapper {

    @Select("SELECT * FROM tb_team a LEFT JOIN tb_review b ON a.teamId = b.teamId;")
    List<?> teamReviewJoinData();

}