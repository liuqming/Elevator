import javax.swing.JOptionPane;


public class ElevatorPrograme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Elevator left = new Elevator();
		Elevator right = new Elevator();
		
		JOptionPane.showMessageDialog(null, "左电梯运行中！");
		left.openDoors(true);
		left.closeDoors(false);
		left.goingUp(true);
		left.goingDown(false);
		left.currentFloor = 20;//左电梯现在楼层是0层
		left.destinatioFloor = Integer.parseInt(JOptionPane.showInputDialog("请输入你要去的楼层："));
		left.goToFloor(right.destinatioFloor);
		
		JOptionPane.showMessageDialog(null, "右电梯运行中！");
		right.openDoors(true);
		right.closeDoors(false);
		right.goingUp(true);
		right.goingDown(false);
		right.currentFloor = 8;//右电梯现在楼层是8层
		right.destinatioFloor = Integer.parseInt(JOptionPane.showInputDialog("请输入你要去的楼层："));
		right.goToFloor(right.destinatioFloor);
	}

}
