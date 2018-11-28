/**
 * The dao of InterviewRecord，该文件继承于BaseMapper，基本的CURD方法采用基类中的方法，若无必要可不用重写
 * Created 2018/9/18
 * @author Howard
 */
package universityrecruit.student.interviewmanagement.interviewrecord.dao;

import com.each.common.base.dao.BaseMapper;
import java.util.Date;
import universityrecruit.student.interviewmanagement.interviewrecord.entity.InterviewRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StuIntInterviewRecordMapper extends BaseMapper<InterviewRecord>{

}