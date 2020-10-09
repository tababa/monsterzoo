

public class Main {
	static MonsterZoo pz = new MonsterZoo();

	public static void main(String[] args) {

		//1000ミリ秒（1秒）ずつ止まりながらpz.move()を呼び出し続ける
		//手持ちのボールが無くなったら終了
		while(true){
			try {
				Thread.sleep(1000);
				if(pz.items.ballnum()>0){
					pz.move();
					System.out.println("手持ちのボールは"+pz.items.ballnum()+"個，フルーツは"+pz.items.fruitnum()+"個");
					System.out.println(pz.distance+"km歩いた．");
				}else{
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("ボールがなくなった！");

		for(int i=0;i<pz.usermonster.userMonsterSize();i++){
			if(pz.usermonster.userMonsterGet(i)!=null){
				System.out.println(pz.usermonster.userMonsterGet(i)+"を捕まえた．");
			}
		}
	}

}
