/**
 * The dao of University，该文件继承于BaseMapper，基本的CURD方法采用基类中的方法，若无必要可不用重写
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.university.infomationmanagement.university.dao;

import com.each.common.base.dao.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import universityrecruit.university.infomationmanagement.university.entity.Degree;
import universityrecruit.university.infomationmanagement.university.entity.Province;
import universityrecruit.university.infomationmanagement.university.entity.Universityresult;

import java.util.List;

@Mapper
public interface UniInfUniversityMapper extends BaseMapper<Universityresult>{

    public List<Province> selectallprovince();
    public List<Degree> selectalldegree();
}