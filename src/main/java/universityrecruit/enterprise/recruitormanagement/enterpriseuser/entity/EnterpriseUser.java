/**
 * The entity of EnterpriseUser，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.recruitormanagement.enterpriseuser.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("EnterpriseUser")
public class EnterpriseUser implements Serializable {

	private Integer EnterpriseUserID;
	private String Password;
	private String UserName;
	private Integer EnterpriseID;


	public Integer getEnterpriseUserID() { return EnterpriseUserID; } 
	public String getPassword() { return Password; } 
	public String getUserName() { return UserName; } 
	public Integer getEnterpriseID() { return EnterpriseID; } 


	public void setEnterpriseUserID( Integer pEnterpriseUserID ) { this.EnterpriseUserID = pEnterpriseUserID; } 
	public void setPassword( String pPassword ) { this.Password = pPassword; } 
	public void setUserName( String pUserName ) { this.UserName = pUserName; } 
	public void setEnterpriseID( Integer pEnterpriseID ) { this.EnterpriseID = pEnterpriseID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", EnterpriseUserID=").append(EnterpriseUserID);
		sb.append(", Password=").append(Password);
		sb.append(", UserName=").append(UserName);
		sb.append(", EnterpriseID=").append(EnterpriseID);
		sb.append("]");
		return sb.toString();
	}

}