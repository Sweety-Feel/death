package app.bean.pojo;

public class Pet {
  private String name;
  private int age;
  private Pet friend;
  private int fetchCount;
  
  public String getName(){
  	return name;
  }
  public void setName(String name){
  	this.name=name;
  }
  public int getAge(){
  	return age;
  }
  public void setAge(int age){
  	this.age=age;
  }
  public Pet getFriend(){
  	return friend;
  }
  public void setFriend(Pet friend){
  	this.friend=friend;
  }
  public void onFetch(){
  	this.fetchCount++;
  }
  public int getFetchCount(){
  	return fetchCount;
  }
  public void setFetchCount(int fetchCount){
  	this.fetchCount=fetchCount;
  }
}
