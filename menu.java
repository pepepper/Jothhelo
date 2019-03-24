import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

import java.awt.TextField;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import setting;
public class menu implements ActionListener{
    menu(){
        JFrame frame = new JFrame("設定");
        frame.setBounds(100, 100, 400, 300);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        JButton startbutton=new JButton("開始");
        JButton end=new JButton("終了");

        JCheckBox sizecheck = new JCheckBox("盤面サイズ(8まで 指定した数値の二倍の大きさ)");
        JTextField sizex=new JTextField();
        JTextField sizey=new JTextField();
        JTextField ip=new JTextField();
        JCheckBox passcheck = new JCheckBox("パスワード");
        JTextField pass=new TextField();
        JTextField room=new TextField();

        ButtonGroup mode=new ButtonGroup();
        JRadioButton offline=new JRadioButton("オフライン",true);
        JRadioButton online=new JRadioButton("オンライン");
        mode.add(offline);
        mode.add(online);

        ButtonGroup netmode = new ButtonGroup();
        JRadioButton host=new JRadioButton("ホスト",true);
        JRadioButton guest=new JRadioButton("ゲスト");
        netmode.add(host);
        netmode.add(guest);

        frame.setVisible(true);
    }
}