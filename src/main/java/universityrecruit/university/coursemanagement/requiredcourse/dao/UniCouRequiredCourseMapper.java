/**
 * The dao of RequiredCourse，该文件继承于BaseMapper，基本的CURD方法采用基类中的方法，若无必要可不用重写
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.university.coursemanagement.requiredcourse.dao;

import com.each.common.base.dao.BaseMapper;
import java.util.Date;
import universityrecruit.university.coursemanagement.requiredcourse.entity.RequiredCourse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UniCouRequiredCourseMapper extends BaseMapper<RequiredCourse>{

}