
/*
 * �Ȭw�j�Ǹ�u�t@ csie.asia.edu.tw
 * �{���]�p(�@) 104021132 ���m�x
 * ���O����D2
 * #class
 * #constructor
 */
class Cbox {
	private int length;
	private int width;
	private int height;

	Cbox(int x, int y, int z) {
		length = x;
		width = y;
		height = z;
	}

	public int volume() {
		return length * width * height;
	}

	public int surfaceArea() {
		return 2 * length * width + 2 * height * width + 2 * length * height;
	}

	public void showData() {
		System.out.println("length= " + length + " width= " + width + " hieght= " + height);
	}

	public void showall() {
		showData();
		System.out.println("volume= " + volume() + " surfaceArea= " + surfaceArea());
	}
};



public class test02 {

	public static void main(String[] args) {
		Cbox c1 = new Cbox(1, 1, 1);
		c1.showall();

	}

}
/*
 * length= 1 width= 1 hieght= 1 
 * volume= 1 surfaceArea= 6
 */
