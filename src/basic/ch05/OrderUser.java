package basic.ch05;

public class OrderUser {

	public static void main(String[] args) {
		Order user1 = new Order();
		Order user2 = new Order();
		Order user3 = new Order();
		
		user1.name = "맥도날드 케찹 콜렉터";
		user1.addr = "기장";
		user1.food = "햄버거";
		user1.alcohol = "맥주";
		user1.age = 32;
		user1.price = 19500;
		user1.ordernum = 1;
		user1.ordermessage = "케찹 30개";
		
		user2.name = "공항도둑";
		user2.addr = "동래구";
		user2.food = "족발";
		user2.alcohol = "소주";
		user2.age = 28;
		user2.price = 39500;
		user2.ordernum = 2;
		user2.ordermessage = "왜 내 주문만 그러는데";
		
		user3.name = "자르반82세";
		user3.addr = "사하구";
		user3.food = "파전";
		user3.alcohol = "막걸리";
		user3.age = 82;
		user3.price = 25000;
		user3.ordernum = 3;
		user3.ordermessage = "....";
		
		System.out.println(user1.name);
		System.out.println(user1.addr);
		System.out.println(user1.age);
		System.out.println(user1.food);
		System.out.println(user1.alcohol);
		System.out.println(user1.price);
		System.out.println(user1.ordernum);
		System.out.println(user1.ordermessage);
		System.out.println("====================");
		System.out.println(user2.name);
		System.out.println(user2.addr);
		System.out.println(user2.age);
		System.out.println(user2.food);
		System.out.println(user2.alcohol);
		System.out.println(user2.price);
		System.out.println(user2.ordernum);
		System.out.println(user2.ordermessage);
		System.out.println("====================");
		System.out.println(user3.name);
		System.out.println(user3.addr);
		System.out.println(user3.age);
		System.out.println(user3.food);
		System.out.println(user3.alcohol);
		System.out.println(user3.price);
		System.out.println(user3.ordernum);
		System.out.println(user3.ordermessage);
		System.out.println("====================");
		
		
	}

}
