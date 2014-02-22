/**
 * main sort class
 * author alex
 * time 2014-2-21
 */
class BubbleSort{
	private int[] data = {3,10,2,99,76};
	// default desc is true
	private boolean desc = true;
	public BubbleSort(){
	}
	public BubbleSort(int[] data){
		this.data = data;
	}
	public int[] getData(){
		return this.data;
	}
	public boolean getDesc(){
		return this.desc;
	}
	public void setDesc(boolean n){
		this.desc = n;
	}
	/**
	 *冒泡排序
	 */
	public int[] sortData(int[] data){
		int total = data.length;
		for(int i=0; i<total; i++){
			for(int j=i+1; j<total; j++){
				if(this.desc){              /* default max to min */
					if(data[j]>data[i]){
						int temp = data[i];
						data[i] = data[j];
						data[j] = temp;
					}
				}else{
					if(data[j]<data[i]){
						int temp = data[j];
						data[j] = data[i];
						data[i] = temp;
					}
				}
			}
		}
		this.data = data;
		return data;
	}
	
	public void printData(int[] data){
		for(int i=0; i<data.length; i++){
			System.out.print(data[i] + " ");
		}
		System.out.println("\n");
	}
	
}

public class BubbleTest{
	public static void main(String[] args){
		//int[] data = {3,2,1,4,6,0};
		BubbleSort bs = new BubbleSort();
		System.out.println("Before sort: ");
		bs.printData(bs.getData());
		//bs.setDesc(false);
		bs.sortData(bs.getData());
		System.out.println("End sort:");
		bs.printData(bs.getData());
	}
}
