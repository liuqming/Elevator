import javax.swing.JOptionPane;


public class ElevatorPrograme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Elevator left = new Elevator();
		Elevator right = new Elevator();
		
		JOptionPane.showMessageDialog(null, "����������У�");
		left.openDoors(true);
		left.closeDoors(false);
		left.goingUp(true);
		left.goingDown(false);
		left.currentFloor = 20;//���������¥����0��
		left.destinatioFloor = Integer.parseInt(JOptionPane.showInputDialog("��������Ҫȥ��¥�㣺"));
		left.goToFloor(right.destinatioFloor);
		
		JOptionPane.showMessageDialog(null, "�ҵ��������У�");
		right.openDoors(true);
		right.closeDoors(false);
		right.goingUp(true);
		right.goingDown(false);
		right.currentFloor = 8;//�ҵ�������¥����8��
		right.destinatioFloor = Integer.parseInt(JOptionPane.showInputDialog("��������Ҫȥ��¥�㣺"));
		right.goToFloor(right.destinatioFloor);
	}

}
