/**
 * The service implements of Specialty，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.government.statistics.specialty.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.government.statistics.specialty.dao.GovStaSpecialtyMapper;
import universityrecruit.government.statistics.specialty.entity.Specialty;
import universityrecruit.government.statistics.specialty.service.ISpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GovStaSpecialtyService")
public class GovStaSpecialtyServiceImpl extends BaseServiceImpl<Specialty> implements ISpecialtyService {

    private GovStaSpecialtyMapper oSpecialtyDao;

    @Autowired
    public GovStaSpecialtyServiceImpl(GovStaSpecialtyMapper oTempSpecialtyDao){
        this.oSpecialtyDao = oTempSpecialtyDao;
        this.baseDao = oSpecialtyDao;
    }
}
