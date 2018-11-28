/**
 * The service implements of Specialty，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.statistics.specialty.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.statistics.specialty.dao.UniStaSpecialtyMapper;
import universityrecruit.university.statistics.specialty.entity.Specialty;
import universityrecruit.university.statistics.specialty.service.ISpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniStaSpecialtyService")
public class UniStaSpecialtyServiceImpl extends BaseServiceImpl<Specialty> implements ISpecialtyService {

    private UniStaSpecialtyMapper oSpecialtyDao;

    @Autowired
    public UniStaSpecialtyServiceImpl(UniStaSpecialtyMapper oTempSpecialtyDao){
        this.oSpecialtyDao = oTempSpecialtyDao;
        this.baseDao = oSpecialtyDao;
    }
}
