package hehe;

package hehe;
/*定义一个折扣的接口*/
public interface Discount {
	//打折后价格
	double getDiscountPrice(double price);
}
package hehe;
/*不打折*/
public class NoDiscountPrice implements Discount {

	public double getDiscountPrice(double price) {
		// TODO Auto-generated method stub
		return price;
	}

}
package hehe;

public class sixDiscount implements Discount {

	public double getDiscountPrice(double price) {
		// TODO Auto-generated method stub
		return price*0.7;
	}

}
package hehe;

public class CashBack implements Discount {

	public double getDiscountPrice(double price) {
		// TODO Auto-generated method stub
		if(price<100) {
			return price;
		}else if(price<200){
			return price-10;
		}else {
			return price-20;
		}
	}

}
package hehe;
/* 商品类*/
public class Goods {
	Discount discount;    //折扣
	double price;     //商品的价格

	//构造方法
	public Goods(double price,Discount discount) {
		super();
		this.price=price;
		this.discount=discount;
	}
	public double getPrice() {
		return discount.getDiscountPrice(price);
	}
}

package hehe;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//不打折
		Goods goods=new Goods(300,new NoDiscountPrice());
		System.out.println("应收："+goods.getPrice()+"元");
		//六折
		goods.discount=new sixDiscount();
		System.out.println("应收："+goods.getPrice()+"元");
		//满返
		goods.discount=new CashBack();
		System.out.println("应收："+goods.getPrice()+"元");
	}

}
