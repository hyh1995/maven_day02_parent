package cn.itcast.dao;

import cn.itcast.domain.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {

    /**
     * 按照id查询
     */
@Select("select * from user where id=#{id}")

    User findById(Integer id);


}
