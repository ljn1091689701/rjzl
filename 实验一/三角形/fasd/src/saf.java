import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class saf {
    
    public static void main(String[] args) {    
        // 创建 JFrame 实例
        JFrame frame = new JFrame("判断三角形形状");
        // Setting the width and height of frame
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建面板，这个类似于 HTML 的 div 标签
         
        JPanel panel = new JPanel();    
        // 添加面板
        frame.add(panel);
        
        //调用用户定义的方法并添加组件到面板
         
        placeComponents(panel);

        // 设置界面可见
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

   
        panel.setLayout(null);
        
        JLabel Title = new JLabel("请输入三个整数:");
        Title.setBounds(5,10,100,20);
        panel.add(Title);
        
        // 创建 JLabel
        JLabel A = new JLabel("A:");
        A.setBounds(10,20,80,25);
        panel.add(A);

        
        final JTextField AT = new JTextField(20);
        AT.setBounds(100,20,165,25);
        panel.add(AT);

        
        JLabel B = new JLabel("B:");
        B.setBounds(10,50,80,25);
        panel.add(B);
        
        final JTextField BT = new JTextField(20);
        BT.setBounds(100,50,165,25);
        panel.add(BT);
        
        JLabel C = new JLabel("C:");
        C.setBounds(10,80,80,25);
        panel.add(C);
       
        final JTextField CT = new JTextField(20);
        CT.setBounds(100,80,165,25);
        panel.add(CT);
        
        JLabel R = new JLabel("形状:");
        R.setBounds(10,110,80,25);
        panel.add(R);
       
        final JTextField RT = new JTextField(20);
        RT.setBounds(100,110,165,25);
        panel.add(RT);

        // 按钮
        JButton result = new JButton("判断形状");
        result.setBounds(60, 150, 80, 25);
        panel.add(result);
        
        
        result.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("按钮被点击....");
				//int a = Integer.parseInt( AT.getText().trim());
				//int b = Integer.parseInt( BT.getText().trim());
				//int c = Integer.parseInt( CT.getText().trim());
				String at = AT.getText();
				String bt = BT.getText();
				String ct = CT.getText();
				//System.out.println("按钮被点击...."+a+b+c);
				try{
				    Integer.valueOf(at);
				    Integer.valueOf(bt);
				    Integer.valueOf(ct);
				    int a = Integer.parseInt( AT.getText().trim());
					int b = Integer.parseInt( BT.getText().trim());
					int c = Integer.parseInt( CT.getText().trim());
					if(a<1 || a >200 ||b<1 || b >200 || c<1 || c >200){
						RT.setText("参数输入超限");
					}else{
						//输入数据正确，开始判断三角形形状
						if((a+b<=c)||(a+c<=b)||(b+c<=a)){
							RT.setText("不能构成三角形");
							}else if(a==b && b==c){
								RT.setText("等边三角形");
							}else if(a==b||b==c||a==c){
								RT.setText("等腰三角形");
							}else{
								RT.setText("一般三角形");
							}
					}
				}catch(Exception es){
				    RT.setText("参数输入非法");
				}
				
				
			}
        	
        });
        
        JButton reinput = new JButton("重新输入");
        reinput.setBounds(150, 150, 80, 25);
        panel.add(reinput);
        
        reinput.addActionListener(new ActionListener(){

     			public void actionPerformed(ActionEvent e) {
     				// TODO Auto-generated method stub
     				
     				RT.setText("");
     				AT.setText("");
     				BT.setText("");
     				CT.setText("");
     			} 	
       });
        
    }

}