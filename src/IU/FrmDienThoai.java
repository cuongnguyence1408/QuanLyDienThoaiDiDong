/**
 * 
 */
package IU;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Admin
 *
 */
public class FrmDienThoai extends JDialog implements ActionListener {
	
	private DefaultTableModel dataModel;
	private JScrollPane scroll;
	private JTable table;

	public FrmDienThoai(){
		setTitle("Điện Thoại Di Động");
		setSize(1000,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Box b,b1,b2,b3,b4,b5,b6,b7;
		
		add(b=Box.createVerticalBox());
		String[]tieude={"Mã điện thoại","Tên điện thoại","Cấu hình máy","Giá"};
		b.add(scroll=new JScrollPane(table=new JTable(dataModel=new DefaultTableModel(tieude,0))));
		scroll.setBorder(BorderFactory.createTitledBorder("Danh sách điện thoại"));
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
