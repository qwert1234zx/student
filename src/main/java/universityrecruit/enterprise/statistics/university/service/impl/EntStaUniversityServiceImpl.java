/**
 * The service implements of University，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.statistics.university.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.statistics.university.dao.EntStaUniversityMapper;
import universityrecruit.enterprise.statistics.university.entity.University;
import universityrecruit.enterprise.statistics.university.service.IUniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStaUniversityService")
public class EntStaUniversityServiceImpl extends BaseServiceImpl<University> implements IUniversityService {

    private EntStaUniversityMapper oUniversityDao;

    @Autowired
    public EntStaUniversityServiceImpl(EntStaUniversityMapper oTempUniversityDao){
        this.oUniversityDao = oTempUniversityDao;
        this.baseDao = oUniversityDao;
    }
}
