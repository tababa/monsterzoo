public class GetMonster{
  public void throwItem(int m,MonsterData data,Items item,UserMonster usermonster){
		for(int i=0;i<3&&item.ballnum()>0;i++){//捕まえる or 3回ボールを投げるまで繰り返す
			int r = (int)(6*Math.random());//0~5までの数字をランダムに返す
			throwfruit(r,item);
			System.out.println(data.monsterZukan(m)+"にボールを投げた");
			item.ballsub();
			if(data.monsterRare(m)<=r){//monsterRare[m]の値がr以下の場合
				System.out.println(data.monsterZukan(m)+"を捕まえた！");
        usermonster.userMonsterAdd(data.monsterZukan(m));
				break;//ボール投げ終了
			}else{
				System.out.println(data.monsterZukan(m)+"に逃げられた！");
			}
		}
	}
  //フルーツなげ
  public void throwfruit(int r,Items item){
    if(item.fruitnum()>0){
      System.out.println("フルーツを投げた！捕まえやすさが倍になる！");
      item.fruitsub();
      r = r * 2;
    }
  }

}
