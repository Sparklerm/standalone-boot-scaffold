package ${groupId}.dao.auth.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ${groupId}.dao.auth.po.ResourcePO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IResourceDao extends BaseMapper<ResourcePO> {

    /**
     * 查询全部资源
     */
    List<ResourcePO> selectAll();
}




