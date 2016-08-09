import javax.swing.JOptionPane;


public class Elevator {
	public int currentFloor;//当前楼层
	public int destinatioFloor;//前往楼层
	public boolean up;//表示当电梯到达目的楼层是升还是降
	public boolean doorsOpen;//代表电梯门是开还是关
	
	/**开门*/
	public static void openDoors(boolean doorsOpen){
		if(doorsOpen == true){
			doorsOpen = true;
			JOptionPane.showMessageDialog(null, "正在开门！");
		}
	}
	
	/**关门*/
	public static void closeDoors(boolean doorsOpen){
		if(doorsOpen == false){
			doorsOpen = false;
			JOptionPane.showMessageDialog(null, "正在关门！");
		}
	}
	
	/**电梯向上*/
	public static void goingUp(boolean up){
		if(up == true){
			up = true;
			JOptionPane.showMessageDialog(null, "电梯正在上行！");
		}
	}
	
	/**电梯向下*/
	public static void goingDown(boolean up){
		if(up == false){
			up = false;
			JOptionPane.showMessageDialog(null, "电梯正在下行！");
		}
	}
	
	/**要去的楼层*/
	public void goToFloor(int destinatioFloor){
		System.out.println("你要去的楼层是："+this.destinatioFloor);
		if(this.currentFloor < this.destinatioFloor){
			goingUp(true);
		}
		else if(this.currentFloor > this.destinatioFloor){
			goingDown(false);
		}
		else{
			this.currentFloor = this.destinatioFloor;
		}
	}
}
