package puzzlegame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Font;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JSeparator;
import javax.swing.JDesktopPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSplitPane;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import java.awt.Component;
import java.awt.GridBagConstraints;
import javax.swing.JTable;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PuzzleInter extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PuzzleInter frame = new PuzzleInter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PuzzleInter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		toolBar.setFont(new Font("Lucida Sans Unicode", Font.ITALIC, 18));
		toolBar.setMargin(new Insets(5, 13, 0, 13));
		toolBar.setForeground(Color.WHITE);
		toolBar.setBackground(SystemColor.activeCaption);
		
		JMenuBar menuBar = new JMenuBar();
		toolBar.add(menuBar);
		
		JButton btnNewButton_1 = new JButton("\u65B0\u589E");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		menuBar.add(btnNewButton_1);
		
		JButton btnNewButton_5 = new JButton("\u5132\u5B58");
		menuBar.add(btnNewButton_5);
		
		JButton btnNewButton_3 = new JButton("\u5DE5\u5177");
		menuBar.add(btnNewButton_3);
		
		JInternalFrame internalFrame = new JInternalFrame("\u5730\u5716\u7DE8\u8F2F");
		contentPane.add(internalFrame, BorderLayout.CENTER);
		
		textField = new JTextField();
		textField.setBackground(Color.RED);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\u65B9\u584A");
		textField.setPreferredSize(new Dimension(15, 15));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.CYAN);
		textField_1.setText("\u65B9\u584A");
		textField_1.setPreferredSize(new Dimension(15, 15));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.WHITE);
		textField_2.setText("\u65B9\u584A");
		textField_2.setPreferredSize(new Dimension(15, 15));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("\u65B9\u584A");
		textField_3.setPreferredSize(new Dimension(15, 15));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setText("\u65B9\u584A");
		textField_4.setPreferredSize(new Dimension(15, 15));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText("\u65B9\u584A");
		textField_5.setPreferredSize(new Dimension(15, 15));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setText("\u65B9\u584A");
		textField_6.setPreferredSize(new Dimension(15, 15));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setText("\u65B9\u584A");
		textField_7.setPreferredSize(new Dimension(15, 15));
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setText("\u65B9\u584A");
		textField_8.setPreferredSize(new Dimension(15, 15));
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setText("\u65B9\u584A");
		textField_9.setPreferredSize(new Dimension(15, 15));
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setText("\u65B9\u584A");
		textField_10.setPreferredSize(new Dimension(15, 15));
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setText("\u65B9\u584A");
		textField_11.setPreferredSize(new Dimension(15, 15));
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setText("\u65B9\u584A");
		textField_12.setPreferredSize(new Dimension(15, 15));
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setText("\u65B9\u584A");
		textField_13.setPreferredSize(new Dimension(15, 15));
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setText("\u65B9\u584A");
		textField_14.setPreferredSize(new Dimension(15, 15));
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setText("\u65B9\u584A");
		textField_15.setPreferredSize(new Dimension(15, 15));
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setText("\u65B9\u584A");
		textField_16.setPreferredSize(new Dimension(15, 15));
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setText("\u65B9\u584A");
		textField_17.setPreferredSize(new Dimension(15, 15));
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setText("\u65B9\u584A");
		textField_18.setPreferredSize(new Dimension(15, 15));
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setText("\u65B9\u584A");
		textField_19.setPreferredSize(new Dimension(15, 15));
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setText("\u65B9\u584A");
		textField_20.setPreferredSize(new Dimension(15, 15));
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setText("\u65B9\u584A");
		textField_21.setPreferredSize(new Dimension(15, 15));
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setText("\u65B9\u584A");
		textField_22.setPreferredSize(new Dimension(15, 15));
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setText("\u65B9\u584A");
		textField_23.setPreferredSize(new Dimension(15, 15));
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setText("\u65B9\u584A");
		textField_24.setPreferredSize(new Dimension(15, 15));
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(internalFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(185, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(43, Short.MAX_VALUE))
		);
		internalFrame.getContentPane().setLayout(groupLayout);
		
		JInternalFrame internalFrame_1 = new JInternalFrame("New JInternalFrame");
		contentPane.add(internalFrame_1, BorderLayout.WEST);
		
		JMenuBar menuBar_1 = new JMenuBar();
		internalFrame_1.setJMenuBar(menuBar_1);
		
		JButton btnNewButton = new JButton("\u65B9\u584A");
		menuBar_1.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("\u4EBA\u7269");
		btnNewButton_2.setActionCommand("\u4EBA\u7269");
		menuBar_1.add(btnNewButton_2);
		
		textField_25 = new JTextField();
		textField_25.setText("\u65B9\u584A");
		textField_25.setPreferredSize(new Dimension(15, 15));
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setColumns(10);
		textField_25.setBackground(Color.RED);
		
		textField_26 = new JTextField();
		textField_26.setText("\u65B9\u584A");
		textField_26.setPreferredSize(new Dimension(15, 15));
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setColumns(10);
		textField_26.setBackground(Color.CYAN);
		
		textField_27 = new JTextField();
		textField_27.setText("\u65B9\u584A");
		textField_27.setPreferredSize(new Dimension(15, 15));
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setColumns(10);
		textField_27.setBackground(Color.GREEN);
		GroupLayout groupLayout_1 = new GroupLayout(internalFrame_1.getContentPane());
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_1.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(123, Short.MAX_VALUE))
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(180, Short.MAX_VALUE))
		);
		internalFrame_1.getContentPane().setLayout(groupLayout_1);
		internalFrame_1.setVisible(true);
		internalFrame.setVisible(true);
	}
}
