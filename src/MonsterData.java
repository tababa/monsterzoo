
import java.util.ArrayList;

public class MonsterData{
  ArrayList<Monster> monsterdata = new ArrayList<Monster>();
  	private  void setMonsterZukan(){
      this.monsterdata.add(new Monster("イガキン",9));
      this.monsterdata.add(new Monster("ナマチュウ",3));
      this.monsterdata.add(new Monster("イノウエン",1));
      this.monsterdata.add(new Monster("リョージィ",2));
      this.monsterdata.add(new Monster("アキモトン",5));
      this.monsterdata.add(new Monster("ゴージマ",4));
      this.monsterdata.add(new Monster("チュウデン",6));
      this.monsterdata.add(new Monster("ヅカホン",8));
      this.monsterdata.add(new Monster("ニシムラー",7));
      this.monsterdata.add(new Monster("サコーデン",2));
      this.monsterdata.add(new Monster("ウッチー",5));
      this.monsterdata.add(new Monster("ハヤッシー",4));
      this.monsterdata.add(new Monster("キーチー",3));
      this.monsterdata.add(new Monster("リョクン",1));
      this.monsterdata.add(new Monster("デコポン",6));
      this.monsterdata.add(new Monster("カミサン",5));
      this.monsterdata.add(new Monster("シスイ",1));
      this.monsterdata.add(new Monster("ジョナ",7));
      this.monsterdata.add(new Monster("ギダギダ",2));
      this.monsterdata.add(new Monster("ミッツー",8));
      this.monsterdata.add(new Monster("ゾエサン",5));
      this.monsterdata.add(new Monster("キタバー",3));
}

  public String monsterZukan(int m){
    this.setMonsterZukan();
    return this.monsterdata.get(m).monstername;
  }
  public Integer monsterRare(int m){
    this.setMonsterZukan();
    return this.monsterdata.get(m).monsterrate;
  }
  public Integer monsterZukansize(){
    this.setMonsterZukan();
    return this.monsterdata.size();
  }

}
