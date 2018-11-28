/**
 * The service interface of FeeRecord，该文件继承于IBaseService，其中insert、update、deleteByIdList、selectByID、selectByCondition可不用写
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.feemanagement.feerecord.service;

import com.each.common.base.service.IBaseService;
import java.util.Date;
import universityrecruit.enterprise.feemanagement.feerecord.entity.FeeRecord;

public interface IFeeRecordService extends IBaseService<FeeRecord> {

}
