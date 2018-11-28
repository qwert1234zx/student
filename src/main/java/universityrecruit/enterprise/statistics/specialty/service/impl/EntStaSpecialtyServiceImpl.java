/**
 * The service implements of Specialty，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.statistics.specialty.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.statistics.specialty.dao.EntStaSpecialtyMapper;
import universityrecruit.enterprise.statistics.specialty.entity.Specialty;
import universityrecruit.enterprise.statistics.specialty.service.ISpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStaSpecialtyService")
public class EntStaSpecialtyServiceImpl extends BaseServiceImpl<Specialty> implements ISpecialtyService {

    private EntStaSpecialtyMapper oSpecialtyDao;

    @Autowired
    public EntStaSpecialtyServiceImpl(EntStaSpecialtyMapper oTempSpecialtyDao){
        this.oSpecialtyDao = oTempSpecialtyDao;
        this.baseDao = oSpecialtyDao;
    }
}
