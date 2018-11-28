/**
 * The service implements of EnterpriseUser，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.recruitormanagement.enterpriseuser.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.recruitormanagement.enterpriseuser.dao.EntRecEnterpriseUserMapper;
import universityrecruit.enterprise.recruitormanagement.enterpriseuser.entity.EnterpriseUser;
import universityrecruit.enterprise.recruitormanagement.enterpriseuser.service.IEnterpriseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntRecEnterpriseUserService")
public class EntRecEnterpriseUserServiceImpl extends BaseServiceImpl<EnterpriseUser> implements IEnterpriseUserService {

    private EntRecEnterpriseUserMapper oEnterpriseUserDao;

    @Autowired
    public EntRecEnterpriseUserServiceImpl(EntRecEnterpriseUserMapper oTempEnterpriseUserDao){
        this.oEnterpriseUserDao = oTempEnterpriseUserDao;
        this.baseDao = oEnterpriseUserDao;
    }
}
