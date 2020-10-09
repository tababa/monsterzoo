import java.util.ArrayList;
//プレイヤーが得たモンスターの情報
public class UserMonster{
  ArrayList<String> userMonster = new ArrayList<>();

  public Integer userMonsterSize(){
    return this.userMonster.size();
  }
  public void userMonsterAdd(String name){
    this.userMonster.add(name);
  }
  public String userMonsterGet(int i){
    return this.userMonster.get(i);
  }
}
