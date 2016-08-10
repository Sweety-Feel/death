package app.bean.pojo;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

@Table("user")
public class User {
	@Id
	private int id;
	@Column
	private String username;
  @Column
  private String password;
  public int getId(){
  	return id;
  }
  private void setId(int id) {
    this.id=id;
	}
  public String getUsernmae(){
  	return username;
  }
  public void setUsername(String username){
  	this.username=username;
  }
  public String getPassword(){
  	return password;
  }
  public void setPassword(String password){
  	this.password=password;
  }
}
