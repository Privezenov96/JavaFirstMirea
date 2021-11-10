
package ru.mirea.task9.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Score extends JFrame
{
	private int milanScore = 0;
	private int madridScore = 0;
	JPanel[] pnl = new JPanel[4];
	public Score()
	{
		setSize(300,200);
		setLayout(new GridLayout(4,1));
		for(int i = 0 ; i < pnl.length ; i++)
		{
			int r = (int) (Math.random() * 150); // 150, а не 255, чтобы не было слишком светло
			int b = (int) (Math.random() * 150);
			int g = (int) (Math.random() * 150);
			pnl[i] = new JPanel();
			pnl[i].setBackground(new Color(r,g,b));
			add(pnl[i]);
		}
		JLabel resultLabel = new JLabel("Result: 0 X 0");
		resultLabel.setForeground(Color.WHITE);
		pnl[0].add(resultLabel);
		JLabel lastScorerLabel = new JLabel("Last Scorer: N/A");
		lastScorerLabel.setForeground(Color.WHITE);
		pnl[1].add(lastScorerLabel);
		JLabel winnerLabel = new JLabel("Winner: DRAW");
		winnerLabel.setForeground(Color.WHITE);
		pnl[2].add(winnerLabel);

		pnl[3].setLayout(new GridLayout(1, 2));

		int r = (int) (Math.random() * 150);
		int b = (int) (Math.random() * 150);
		int g = (int) (Math.random() * 150);
		JButton milan = new JButton("AC Milan");
		milan.setBackground(new Color(r,g,b));
		milan.setForeground(Color.WHITE);
		r = (int) (Math.random() * 150);
		b = (int) (Math.random() * 150);
		g = (int) (Math.random() * 150);
		JButton madrid = new JButton("Real Madrid");
		madrid.setBackground(new Color(r,g,b));
		madrid.setForeground(Color.WHITE);
		pnl[3].add(milan);
		pnl[3].add(madrid);
		milan.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				milanScore++;
				resultLabel.setText("Result: " + milanScore + " X " + madridScore);
				lastScorerLabel.setText("Last Scorer: AC Milan");
				if (milanScore > madridScore) {
					winnerLabel.setText("Winner: AC Milan");
				}
				else if (milanScore == madridScore) {
					winnerLabel.setText("Winner: DRAW");
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}
		});
		madrid.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				madridScore++;
				resultLabel.setText("Result: " + milanScore + " X " + madridScore);
				lastScorerLabel.setText("Last Scorer: Real Madrid");
				if (madridScore > milanScore) {
					winnerLabel.setText("Winner: Real Madrid");
				}
				else if (milanScore == madridScore) {
					winnerLabel.setText("Winner: DRAW");
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}
		});
	}
	public static void main(String[]args)
	{
		new Score().setVisible(true);
	}
}
