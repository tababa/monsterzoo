

public class MonsterZoo {
	double distance=0.0;//歩いた距離
	static Egg eggdata = new Egg();
	static MonsterData monster = new MonsterData();
	static GetMonster getmonster = new GetMonster();
	static Items items = new Items();
	static UserMonster usermonster = new UserMonster();
	static Encount encount = new Encount();

	//呼び出すと1km distanceが増える
	void move(){
		this.distance++;
		//移動距離更新
		eggdata.newEggDist();
		//stationかモンスター捕まえる
		encount.stationOrMonster(monster,getmonster,items,usermonster,eggdata);
		//卵孵化
		eggdata.bornEgg(monster,usermonster);
	}
}
