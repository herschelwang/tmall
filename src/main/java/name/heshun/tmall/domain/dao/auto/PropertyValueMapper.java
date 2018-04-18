package name.heshun.tmall.domain.dao.auto;

import java.util.List;
import name.heshun.tmall.domain.dto.auto.PropertyValue;
import name.heshun.tmall.domain.dto.auto.PropertyValueExample;
import org.apache.ibatis.annotations.Param;

public interface PropertyValueMapper {
    long countByExample(PropertyValueExample example);

    int deleteByExample(PropertyValueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PropertyValue record);

    int insertSelective(PropertyValue record);

    List<PropertyValue> selectByExample(PropertyValueExample example);

    PropertyValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PropertyValue record, @Param("example") PropertyValueExample example);

    int updateByExample(@Param("record") PropertyValue record, @Param("example") PropertyValueExample example);

    int updateByPrimaryKeySelective(PropertyValue record);

    int updateByPrimaryKey(PropertyValue record);
}