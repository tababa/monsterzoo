public class Encount{
public void stationOrMonster(MonsterData monster,GetMonster getmonster,Items items,UserMonster usermonster,Egg eggdata){
	int flg1 = (int)(Math.random()*10);//0,1の場合はズーstation，7~9の場合はモンスター
	if(flg1<=1){
		station(items,eggdata);
	}else if(flg1>=7){
		int m = (int)(monster.monsterZukansize()*Math.random());//monsterZukanからランダムにモンスターを出す
		System.out.println(monster.monsterZukan(m)+"が現れた！");
		getmonster.throwItem(m,monster,items,usermonster);
	}
}
public void station(Items items,Egg eggdata){
	System.out.println("ズーstationを見つけた！");
	int b=(int)(Math.random()*3);//ball,fruits,eggがランダムに出る
	int f=(int)(Math.random()*2);
	int e=(int)(Math.random()*2);
	System.out.println("ボールを"+b+"個，"+"フルーツを"+f+"個"+"卵を"+e+"個Getした！");
	items.balladd(b);
	items.fruitadd(f);
	eggdata.eggSet(e);
}
}
