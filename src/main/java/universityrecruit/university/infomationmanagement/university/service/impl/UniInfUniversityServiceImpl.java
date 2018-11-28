/**
 * The service implements of University，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.infomationmanagement.university.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import java.util.List;

import universityrecruit.university.infomationmanagement.university.dao.UniInfUniversityMapper;
import universityrecruit.university.infomationmanagement.university.entity.Degree;
import universityrecruit.university.infomationmanagement.university.entity.Province;
import universityrecruit.university.infomationmanagement.university.entity.University;
import universityrecruit.university.infomationmanagement.university.entity.Universityresult;
import universityrecruit.university.infomationmanagement.university.service.IUniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniInfUniversityService")
public class UniInfUniversityServiceImpl extends BaseServiceImpl<Universityresult> implements IUniversityService {

    private UniInfUniversityMapper oUniversityDao;

    @Autowired
    public UniInfUniversityServiceImpl(UniInfUniversityMapper oTempUniversityDao){
        this.oUniversityDao = oTempUniversityDao;
        this.baseDao = oUniversityDao;
    }

    public List<Province> selectallprovince(){
        return oUniversityDao.selectallprovince();
    }
    public List<Degree> selectalldegree(){
        return oUniversityDao.selectalldegree();
    }
}
