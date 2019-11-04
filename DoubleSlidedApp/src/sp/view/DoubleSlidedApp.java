package sp.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sp.controller.FlipController;
import sp.controller.ResetController;
import sp.model.Model;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class DoubleSlidedApp extends JFrame {

	private JPanel contentPane;
	
	PuzzleView panel;
	Model model;
	FlipController fc;
	
	public JLabel numberMovesLabel;
	
	public PuzzleView getDrawingPanel() { return panel; }

	/**
	 * Create the frame.
	 */
	public DoubleSlidedApp(Model model) {
		this.model = model;
		setTitle("Double Slided App");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 519, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		panel = new PuzzleView(model);
		
		fc = new FlipController(this, model);
		panel.addMouseListener(fc);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ResetController(this, model, fc)); 
		
		JLabel lblNumberOfMoves = new JLabel("Number of Moves:");
		lblNumberOfMoves.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		numberMovesLabel = new JLabel("");
		numberMovesLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(lblNumberOfMoves)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(numberMovesLabel))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
					.addGap(92)
					.addComponent(btnReset)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumberOfMoves)
						.addComponent(numberMovesLabel)
						.addComponent(btnReset))
					.addGap(109))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
