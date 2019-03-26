package JOthhelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class Jothhelo implements ActionListener, MouseListener, WindowListener{
	private setting set = new setting();
	private setmenu menu = new setmenu(set, this);
	
	public static void main(String args[]){
		Jothhelo othhelo = new Jothhelo();
		othhelo.run();
	}
	
	private void run(){
		menu.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0){
		if(arg0.getSource() == menu.btnNewButton){
			if(menu.rdbtnNewRadioButton.isSelected()){
				set.button = 1;
				set.mode = 0;
				set.netmode = 0;
				if(menu.chckbxNewCheckBox.isSelected()){
					set.x = Integer.parseInt(menu.textField.getText());
					set.y = Integer.parseInt(menu.textField_1.getText());
				}
			}else if(menu.rdbtnNewRadioButton_1.isSelected()){
				set.mode = 1;
				set.ip = menu.textField_2.getText();
				set.room = menu.textField_3.getText();
				if(menu.chckbxNewCheckBox_1.isSelected()){
					set.pass = menu.textField_4.getText();
				}
				if(menu.rdbtnNewRadioButton_2.isSelected()){
					set.netmode = -1;
				}else if(menu.rdbtnNewRadioButton_3.isSelected()){
					set.netmode = 1;
				}
			}
		}else if(arg0.getSource() == menu.rdbtnNewRadioButton || arg0.getSource() == menu.rdbtnNewRadioButton_1){
			if(menu.rdbtnNewRadioButton_1.isSelected()){
				menu.rdbtnNewRadioButton_2.setEnabled(true);
				menu.rdbtnNewRadioButton_3.setEnabled(true);
				menu.textField_2.setEnabled(true);
				menu.textField_3.setEnabled(true);
				if(menu.chckbxNewCheckBox_1.isSelected()) menu.textField_4.setEnabled(true);
				menu.chckbxNewCheckBox_1.setEnabled(true);
			}else{
				menu.rdbtnNewRadioButton_2.setEnabled(false);
				menu.rdbtnNewRadioButton_3.setEnabled(false);
				menu.textField_2.setEnabled(false);
				menu.textField_3.setEnabled(false);
				menu.textField_4.setEnabled(false);
				menu.chckbxNewCheckBox_1.setEnabled(false);
				menu.chckbxNewCheckBox.setEnabled(true);
			}
		}else if(arg0.getSource() == menu.rdbtnNewRadioButton_2 || arg0.getSource() == menu.rdbtnNewRadioButton_3){
			if(menu.rdbtnNewRadioButton_2.isSelected()){
				menu.chckbxNewCheckBox.setEnabled(true);
			}else{
				menu.chckbxNewCheckBox.setEnabled(false);
			}
		}else if(arg0.getSource() == menu.chckbxNewCheckBox){
			if(menu.rdbtnNewRadioButton_2.isSelected()){
				menu.textField.setEnabled(true);
				menu.textField_1.setEnabled(true);
			}else{
				menu.textField.setEnabled(false);
				menu.textField_1.setEnabled(false);
			}
		}else if(arg0.getSource() == menu.chckbxNewCheckBox_1){
			if(menu.chckbxNewCheckBox_1.isSelected() || menu.rdbtnNewRadioButton_3.isSelected()){
				menu.textField_4.setEnabled(true);
			}else{
				menu.textField_4.setEnabled(false);
			}
		}
		if(arg0.getSource() == menu.btnNewButton_1) set.button = 0;
	}
	
	@Override
	public void mouseClicked(MouseEvent e){
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e){
		
	}
	
	@Override
	public void mouseExited(MouseEvent e){
		
	}
	
	@Override
	public void mousePressed(MouseEvent e){
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e){
		
	}
	
	@Override
	public void windowActivated(WindowEvent arg0){
		
	}
	
	@Override
	public void windowClosed(WindowEvent arg0){
		
	}
	
	@Override
	public void windowClosing(WindowEvent arg0){
		int selected = JOptionPane.showConfirmDialog(null, "終了しますか?", "確認", JOptionPane.YES_NO_OPTION);
		if(selected == JOptionPane.YES_OPTION) System.exit(0);
	}
	
	@Override
	public void windowDeactivated(WindowEvent arg0){
		
	}
	
	@Override
	public void windowDeiconified(WindowEvent arg0){
		
	}
	
	@Override
	public void windowIconified(WindowEvent arg0){
		
	}
	
	@Override
	public void windowOpened(WindowEvent arg0){
		
	}
}