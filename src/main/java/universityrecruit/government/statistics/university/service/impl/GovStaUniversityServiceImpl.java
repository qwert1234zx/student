/**
 * The service implements of University，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.government.statistics.university.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.government.statistics.university.dao.GovStaUniversityMapper;
import universityrecruit.government.statistics.university.entity.University;
import universityrecruit.government.statistics.university.service.IUniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GovStaUniversityService")
public class GovStaUniversityServiceImpl extends BaseServiceImpl<University> implements IUniversityService {

    private GovStaUniversityMapper oUniversityDao;

    @Autowired
    public GovStaUniversityServiceImpl(GovStaUniversityMapper oTempUniversityDao){
        this.oUniversityDao = oTempUniversityDao;
        this.baseDao = oUniversityDao;
    }
}
