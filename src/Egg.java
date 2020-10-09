public class Egg{
  //卵は最大9個まで持てる．卵を取得するとeggにtrueが代入され，
  //移動するたびに,eggDistanceに1.0kmずつ加算される．
  //3km移動するとランダムでモンスターが孵る
  double eggDistance[] = new double[9];
  boolean egg[] = new boolean[9];

  //卵を孵す
  public void bornEgg(MonsterData monster,UserMonster usermonster){
    for(int i=0;i<this.egg.length;i++){
      if(this.egg[i]==true&&this.eggDistance[i]>=3){
        System.out.println("卵が孵った！");
        int m = (int)(monster.monsterZukansize()*Math.random());
        System.out.println(monster.monsterZukan(m)+"が産まれた！");
        usermonster.userMonsterAdd(monster.monsterZukan(m));
        this.egg[i]=false;
        this.eggDistance[i]=0.0;
      }
    }
  }

  //新しい卵データをセット
  public void eggSet(int e){
    if(e>=1){//卵を1つ以上Getしたら
      //egg[]に10個以上卵がない場合は新しい卵データをセットする
      for(int i=0;i<this.eggDistance.length;i++){
        if(this.egg[i]==false){
          this.egg[i]=true;
          this.eggDistance[i]=0.0;
          break;
        }
      }
    }
  }
  //卵移動距離更新
  public void newEggDist(){
    for(int i=0;i<this.egg.length;i++){//卵は移動距離が進むと孵化するため，何km移動したかを更新する
      if(this.egg[i]==true){
        this.eggDistance[i]++;
      }
    }
  }

}
