/**
 * The service interface of University，该文件继承于IBaseService，其中insert、update、deleteByIdList、selectByID、selectByCondition可不用写
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.university.infomationmanagement.university.service;

import com.each.common.base.service.IBaseService;
import universityrecruit.university.infomationmanagement.university.entity.Degree;
import universityrecruit.university.infomationmanagement.university.entity.Province;
import universityrecruit.university.infomationmanagement.university.entity.Universityresult;

import java.util.List;

public interface IUniversityService extends IBaseService<Universityresult> {

    public List<Province> selectallprovince();
    public List<Degree> selectalldegree();
}
