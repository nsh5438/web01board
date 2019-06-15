package kr.hs.dgsw.board_back.Domain;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select id, account, username, email, created, updated from user")
    List<User> findAll();

    @Delete("delete from user where id=#{id}")
    int deleteById(@Param(("id")) Long id);

    User login(User user);
    Long addUser(User user);
    int modifyUser(User user);
    User findById(Long id);

}
