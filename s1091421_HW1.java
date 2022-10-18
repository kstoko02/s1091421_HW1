package com.test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;

public class s1091421_HW1 {
	static Boolean game=true;
	static int step=0;
	static int[] circle ={0,0,0,0,0,0,0,0,0};
	static int[] cross ={0,0,0,0,0,0,0,0,0};
	static Label le=new Label();
	static Frame frame = new Frame("chess");
	static final Dialog d2 = new Dialog(frame, "game over", true);
	
	static void win()
	{
		
		if(circle[0] == 1 && circle[1] == 1 && circle[2] == 1)//circle win
			game=false;
		else if(circle[3] == 1 && circle[4] == 1 && circle[5] == 1)
			game=false;
		else if(circle[6] == 1 && circle[7] == 1 && circle[8] == 1)
			game=false;
		else if(circle[0] == 1 && circle[3] == 1 && circle[6] == 1)
			game=false;
		else if(circle[1] == 1 && circle[4] == 1 && circle[7] == 1)
			game=false;
		else if(circle[2] == 1 && circle[5] == 1 && circle[8] == 1)
			game=false;
		else if(circle[0] == 1 && circle[4] == 1 && circle[8] == 1)
			game=false;
		else if(circle[2] == 1 && circle[4] == 1 && circle[6] == 1)
			game=false;
		
		if(cross[0] == 1 && cross[1] == 1 && cross[2] == 1)//cross win
			game=false;
		else if(cross[3] == 1 && cross[4] == 1 && cross[5] == 1)
			game=false;
		else if(cross[6] == 1 && cross[7] == 1 && cross[8] == 1)
			game=false;
		else if(cross[0] == 1 && cross[3] == 1 && cross[6] == 1)
			game=false;
		else if(cross[1] == 1 && cross[4] == 1 && cross[7] == 1)
			game=false;
		else if(cross[2] == 1 && cross[5] == 1 && cross[8] == 1)
			game=false;
		else if(cross[0] == 1 && cross[4] == 1 && cross[8] == 1)
			game=false;
		else if(cross[2] == 1 && cross[4] == 1 && cross[6] == 1)
			game=false;
		
		if (step%2==0)
			le.setText("circle win");
		else
			le.setText("cross win");
	}
	public static void main(String[] args) {
			
		d2.add(le);
		d2.setBounds(50,50,100,100);
        JButton[] block = new JButton[9];
		
		for(int i = 0 ; i < 9 ; i++)
		{
			block[i]=new JButton();	
		}	
		
		block[0].addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {
				if(game)
				{
					if(step%2==0&&circle[0]==0)
					{
						block[0].setText("O");
						circle[0]=1;
						win();
					    if(!game)
						   d2.setVisible(true);
					     step++;
					}
					else if(cross[0]==0)
					{
						block[0].setText("X");
						cross[0]=1;
					    win();
					    if(!game)
						    d2.setVisible(true);
					     step++;
					}
				}			
			}
        });
		block[1].addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {
			if(game)
				{
					if(step%2==0&&circle[1]==0)
					{
						block[1].setText("O");
						circle[1]=1;
						win();
					    if(!game)
						   d2.setVisible(true);
					     step++;
					}
					else if(cross[1]==0)
					{
						block[1].setText("X");
						cross[1]=1;
					    win();
					    if(!game)
						    d2.setVisible(true);
					     step++;
					}
				}
			}
        });
		block[2].addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {
				if(game)
				{
					if(step%2==0&&circle[2]==0)
					{
						block[2].setText("O");
						circle[2]=1;
						win();
					    if(!game)
						   d2.setVisible(true);
					     step++;
					}
					else if(cross[2]==0)
					{
						block[2].setText("X");
						cross[2]=1;
					    win();
					    if(!game)
						    d2.setVisible(true);
					     step++;
					}
				}
			}
        });
		block[3].addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {
				if(game)
				{
					if(step%2==0&&circle[3]==0)
					{
						block[3].setText("O");
						circle[3]=1;
						win();
					    if(!game)
						   d2.setVisible(true);
					     step++;
					}
					else if(cross[3]==0)
					{
						block[3].setText("X");
						cross[3]=1;
					    win();
					    if(!game)
						    d2.setVisible(true);
					     step++;
					}
				}
			}
        });
		block[4].addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {
				if(game)
				{
					if(step%2==0&&circle[4]==0)
					{
						block[4].setText("O");
						circle[4]=1;
						win();
					    if(!game)
						   d2.setVisible(true);
					     step++;
					}
					else if(cross[4]==0)
					{
						block[4].setText("X");
						cross[4]=1;
					    win();
					    if(!game)
						    d2.setVisible(true);
					     step++;
					}
				}
			}
        });
		block[5].addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {
				if(game)
				{
					if(step%2==0&&circle[5]==0)
					{
						block[5].setText("O");
						circle[5]=1;
						win();
					    if(!game)
						   d2.setVisible(true);
					     step++;
					}
					else if(cross[5]==0)
					{
						block[5].setText("X");
						cross[5]=1;
					    win();
					    if(!game)
						    d2.setVisible(true);
					     step++;
					}
				}
			}
        });
		block[6].addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {
				if(game)
				{
					if(step%2==0&&circle[6]==0)
					{
						block[6].setText("O");
						circle[6]=1;
						win();
					    if(!game)
						   d2.setVisible(true);
					     step++;
					}
					else if(cross[6]==0)
					{
						block[6].setText("X");
						cross[6]=1;
					    win();
					    if(!game)
						    d2.setVisible(true);
					     step++;
					}
				}
			}
        });
		block[7].addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {
				if(game)
				{
					if(step%2==0&&circle[7]==0)
					{
						block[7].setText("O");
						circle[7]=1;
						win();
					    if(!game)
						   d2.setVisible(true);
					     step++;
					}
					else if(cross[7]==0)
					{
						block[7].setText("X");
						cross[7]=1;
					    win();
					    if(!game)
						    d2.setVisible(true);
					     step++;
					}
				}
			}
        });
		block[8].addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {
				if(game)
				{
					if(step%2==0&&circle[8]==0)
					{
						block[8].setText("O");
						circle[8]=1;
						win();
					    if(!game)
						   d2.setVisible(true);
					     step++;
					}
					else if(cross[8]==0)
					{
						block[8].setText("X");
						cross[8]=1;
					    win();
					    if(!game)
						    d2.setVisible(true);
					     step++;
					}
				}
			}
        });
		
		frame.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent event) {
					System.exit(0);
				}
		});
		
		d2.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent event) {
					System.exit(0);
				}
		});
		
        frame.setLayout(new GridLayout(3,3));
        for(int i=0;i<9;i++)
		{
		    frame.add(block[i]);
		}
		
        frame.pack();
        frame.setVisible(true);
		frame.setSize(450,450);	
    }	
}