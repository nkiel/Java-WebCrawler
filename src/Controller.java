import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Controller {
	static JFrame mainFrame;
	static JPanel inputURLPanel;
	public static JTextField urlIN;
	static JButton search;
	static ControlActionListener listener;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initFrame();
	}

	public static void initFrame() {
		mainFrame = new JFrame("Java Web Crawler");
		mainFrame.getContentPane().setLayout(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(1000, 600);
		mainFrame.setLocation(250, 250);
		mainFrame.setResizable(false);
		inputURLPanel = new JPanel();
		mainFrame.add(inputURLPanel);
		inputURLPanel.setSize(900, 200);
		inputURLPanel.setLocation(50, 50);
		urlIN = new JTextField("URL HERE", 70);
		inputURLPanel.add(urlIN);
		search = new JButton("search");
		inputURLPanel.add(search);
		// search.setLocation(x, y);
		listener = new ControlActionListener();
		search.setActionCommand("search");
		search.addActionListener(listener);
//		urlIN
		search.requestFocus();
		mainFrame.setVisible(true);
	}
	
	public String getUrl(){
		return urlIN.getText();
	}
}

class ControlActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand() == "search" && Controller.urlIN.getText() != "URL HERE" && Controller.urlIN.getText() != ""){
			//enterSeacrch Command here also should probably add something to check the integrity of URL
		}
	}

}
