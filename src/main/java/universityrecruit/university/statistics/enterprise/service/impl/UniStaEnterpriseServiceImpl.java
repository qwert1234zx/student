/**
 * The service implements of Enterprise，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.statistics.enterprise.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.statistics.enterprise.dao.UniStaEnterpriseMapper;
import universityrecruit.university.statistics.enterprise.entity.Enterprise;
import universityrecruit.university.statistics.enterprise.service.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniStaEnterpriseService")
public class UniStaEnterpriseServiceImpl extends BaseServiceImpl<Enterprise> implements IEnterpriseService {

    private UniStaEnterpriseMapper oEnterpriseDao;

    @Autowired
    public UniStaEnterpriseServiceImpl(UniStaEnterpriseMapper oTempEnterpriseDao){
        this.oEnterpriseDao = oTempEnterpriseDao;
        this.baseDao = oEnterpriseDao;
    }
}
