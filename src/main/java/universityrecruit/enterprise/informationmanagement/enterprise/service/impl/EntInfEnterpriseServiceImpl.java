/**
 * The service implements of Enterprise，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.informationmanagement.enterprise.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.informationmanagement.enterprise.dao.EntInfEnterpriseMapper;
import universityrecruit.enterprise.informationmanagement.enterprise.entity.Enterprise;
import universityrecruit.enterprise.informationmanagement.enterprise.service.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntInfEnterpriseService")
public class EntInfEnterpriseServiceImpl extends BaseServiceImpl<Enterprise> implements IEnterpriseService {

    private EntInfEnterpriseMapper oEnterpriseDao;

    @Autowired
    public EntInfEnterpriseServiceImpl(EntInfEnterpriseMapper oTempEnterpriseDao){
        this.oEnterpriseDao = oTempEnterpriseDao;
        this.baseDao = oEnterpriseDao;
    }
}
