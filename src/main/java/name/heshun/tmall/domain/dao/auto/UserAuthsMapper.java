package name.heshun.tmall.domain.dao.auto;

import java.util.List;
import name.heshun.tmall.domain.dto.auto.UserAuths;
import name.heshun.tmall.domain.dto.auto.UserAuthsExample;
import org.apache.ibatis.annotations.Param;

public interface UserAuthsMapper {
    long countByExample(UserAuthsExample example);

    int deleteByExample(UserAuthsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserAuths record);

    int insertSelective(UserAuths record);

    List<UserAuths> selectByExample(UserAuthsExample example);

    UserAuths selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserAuths record, @Param("example") UserAuthsExample example);

    int updateByExample(@Param("record") UserAuths record, @Param("example") UserAuthsExample example);

    int updateByPrimaryKeySelective(UserAuths record);

    int updateByPrimaryKey(UserAuths record);
}