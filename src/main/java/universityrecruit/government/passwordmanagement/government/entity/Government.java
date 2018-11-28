/**
 * The entity of Government，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.government.passwordmanagement.government.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("Government")
public class Government implements Serializable {

	private Integer GovernmentID;
	private String Password;
	private String Manager;
	private String GovernmentName;
	private Integer ProvinceID;


	public Integer getGovernmentID() { return GovernmentID; } 
	public String getPassword() { return Password; } 
	public String getManager() { return Manager; } 
	public String getGovernmentName() { return GovernmentName; } 
	public Integer getProvinceID() { return ProvinceID; } 


	public void setGovernmentID( Integer pGovernmentID ) { this.GovernmentID = pGovernmentID; } 
	public void setPassword( String pPassword ) { this.Password = pPassword; } 
	public void setManager( String pManager ) { this.Manager = pManager; } 
	public void setGovernmentName( String pGovernmentName ) { this.GovernmentName = pGovernmentName; } 
	public void setProvinceID( Integer pProvinceID ) { this.ProvinceID = pProvinceID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", GovernmentID=").append(GovernmentID);
		sb.append(", Password=").append(Password);
		sb.append(", Manager=").append(Manager);
		sb.append(", GovernmentName=").append(GovernmentName);
		sb.append(", ProvinceID=").append(ProvinceID);
		sb.append("]");
		return sb.toString();
	}

}