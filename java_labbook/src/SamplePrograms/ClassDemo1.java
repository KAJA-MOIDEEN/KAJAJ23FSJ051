package SamplePrograms;


public class ClassDemo1 {
	public static void main(String[] args) {
		ShoeManufacturer sm=new BataShoeFactory();
		
		sm.produce();
	}
}
interface Manufacturer{
	public void produce();

	Shoe makeShoe();
}
interface ShoeManufacturer extends Manufacturer{
	public Shoe makeShoe();
}
class Shoe{}
abstract class ShoeFactory implements ShoeManufacturer{
	public abstract void purchaseRawMaterial();
	public void produce() {
		// TODO Auto-generated method stub
		
	}
	public Shoe makeShoe() {
		// TODO Auto-generated method stub
		return null;
	}
	final public void makingProcess() {
		System.out.println("following the age old process of making shoe...");
	}
}

class BataShoeFactory extends ShoeFactory{

	@Override
	public Shoe makeShoe() {
		// TODO Auto-generated method stub
		return new Shoe();
	}

	@Override
	public void produce() {
		purchaseRawMaterial();
		System.out.println(makeShoe());
	}

	@Override
	public void purchaseRawMaterial() {
		System.out.println("raw material purchased.....");
	}
	
}