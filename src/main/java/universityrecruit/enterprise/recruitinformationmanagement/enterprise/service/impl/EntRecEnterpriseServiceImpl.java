/**
 * The service implements of Enterprise，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.recruitinformationmanagement.enterprise.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.recruitinformationmanagement.enterprise.dao.EntRecEnterpriseMapper;
import universityrecruit.enterprise.recruitinformationmanagement.enterprise.entity.Enterprise;
import universityrecruit.enterprise.recruitinformationmanagement.enterprise.service.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntRecEnterpriseService")
public class EntRecEnterpriseServiceImpl extends BaseServiceImpl<Enterprise> implements IEnterpriseService {

    private EntRecEnterpriseMapper oEnterpriseDao;

    @Autowired
    public EntRecEnterpriseServiceImpl(EntRecEnterpriseMapper oTempEnterpriseDao){
        this.oEnterpriseDao = oTempEnterpriseDao;
        this.baseDao = oEnterpriseDao;
    }
}
