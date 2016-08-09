import javax.swing.JOptionPane;


public class Elevator {
	public int currentFloor;//��ǰ¥��
	public int destinatioFloor;//ǰ��¥��
	public boolean up;//��ʾ�����ݵ���Ŀ��¥���������ǽ�
	public boolean doorsOpen;//����������ǿ����ǹ�
	
	/**����*/
	public static void openDoors(boolean doorsOpen){
		if(doorsOpen == true){
			doorsOpen = true;
			JOptionPane.showMessageDialog(null, "���ڿ��ţ�");
		}
	}
	
	/**����*/
	public static void closeDoors(boolean doorsOpen){
		if(doorsOpen == false){
			doorsOpen = false;
			JOptionPane.showMessageDialog(null, "���ڹ��ţ�");
		}
	}
	
	/**��������*/
	public static void goingUp(boolean up){
		if(up == true){
			up = true;
			JOptionPane.showMessageDialog(null, "�����������У�");
		}
	}
	
	/**��������*/
	public static void goingDown(boolean up){
		if(up == false){
			up = false;
			JOptionPane.showMessageDialog(null, "�����������У�");
		}
	}
	
	/**Ҫȥ��¥��*/
	public void goToFloor(int destinatioFloor){
		System.out.println("��Ҫȥ��¥���ǣ�"+this.destinatioFloor);
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
