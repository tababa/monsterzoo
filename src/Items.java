public class Items{
  Integer balls=new Integer(10);//モンスターを捕まえられるボールの数
  Integer fruits=new Integer(0);//ぶつけるとモンスターが捕まえやすくなるフルーツ
  public Integer ballnum(){
    return this.balls;
  }
  public void balladd(Integer b){
    this.balls = this.balls + b;
  }
  public void ballsub(){
    this.balls--;
  }
  public Integer fruitnum(){
    return this.fruits;
  }
  public void fruitadd(Integer f){
    this.fruits = this.fruits + f;
  }
  public void fruitsub(){
    this.fruits--;
  }
}
