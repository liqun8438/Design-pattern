import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener{
	Data data;
	int a=2;
	public MyFrame(Data d)
	{
		data=d;
		JPanel p = new JPanel();
		JPanel pforb = new JPanel();
		JPanel p1 = new JPanel();
				
		CurveShow  cPanel = new CurveShow ( );
		data.attach(cPanel);
		NumericShow nPanel = new NumericShow();
		data.attach(nPanel);
		
		p1.setLayout(new GridLayout(1, 2));
		p1.add(	cPanel);
		p1.add(	nPanel);
		nPanel.setBackground(Color.LIGHT_GRAY);
		cPanel.setBackground(Color.yellow);
		
		p.setLayout(new BorderLayout());
		p.add(p1, "Center");		
		JButton b = new JButton("调整数据");
		b.setPreferredSize(new   Dimension(100,30)) ;
			
		b.addActionListener(this);
		pforb.add(b);
		p.add(pforb, "South");
		getContentPane().add(p);
		setSize(500,300);
		this.setVisible(true);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	/* （非 Javadoc）
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent arg0) {
		// TODO 自动生成方法存根
		data.changeData(a++);
		
	}

}
