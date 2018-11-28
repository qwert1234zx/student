/**
 * The service implements of Enterprise，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.register.enterprise.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.register.enterprise.dao.EntRegEnterpriseMapper;
import universityrecruit.enterprise.register.enterprise.entity.Enterprise;
import universityrecruit.enterprise.register.enterprise.service.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntRegEnterpriseService")
public class EntRegEnterpriseServiceImpl extends BaseServiceImpl<Enterprise> implements IEnterpriseService {

    private EntRegEnterpriseMapper oEnterpriseDao;

    @Autowired
    public EntRegEnterpriseServiceImpl(EntRegEnterpriseMapper oTempEnterpriseDao){
        this.oEnterpriseDao = oTempEnterpriseDao;
        this.baseDao = oEnterpriseDao;
    }
}
