package universityrecruit.testfile.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import universityrecruit.testfile.entity.Picture;

/**
 * Created by dc on 2018/10/3.
 */
@Mapper
public interface TestFileDao {
    public Integer addfile(Picture picture);
    public Picture selectfile(@Param("uid") Integer uid);
}
