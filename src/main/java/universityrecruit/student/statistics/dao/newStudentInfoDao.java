package universityrecruit.student.statistics.dao;

import universityrecruit.student.statistics.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface newStudentInfoDao {
   List<sorceResult> getAllStudent();

}
