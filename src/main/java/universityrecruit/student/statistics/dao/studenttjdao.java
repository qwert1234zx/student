package universityrecruit.student.statistics.dao;

import universityrecruit.student.statistics.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by sw on 2018/9/15.
 */
@Mapper
public interface studenttjdao {
    List<sorceResult1> getAllqy();
}
