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
        // ���� JFrame ʵ��
        JFrame frame = new JFrame("�ж���������״");
        // Setting the width and height of frame
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ������壬��������� HTML �� div ��ǩ
         
        JPanel panel = new JPanel();    
        // ������
        frame.add(panel);
        
        //�����û�����ķ����������������
         
        placeComponents(panel);

        // ���ý���ɼ�
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

   
        panel.setLayout(null);
        
        JLabel Title = new JLabel("��������������:");
        Title.setBounds(5,10,100,20);
        panel.add(Title);
        
        // ���� JLabel
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
        
        JLabel R = new JLabel("��״:");
        R.setBounds(10,110,80,25);
        panel.add(R);
       
        final JTextField RT = new JTextField(20);
        RT.setBounds(100,110,165,25);
        panel.add(RT);

        // ��ť
        JButton result = new JButton("�ж���״");
        result.setBounds(60, 150, 80, 25);
        panel.add(result);
        
        
        result.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("��ť�����....");
				//int a = Integer.parseInt( AT.getText().trim());
				//int b = Integer.parseInt( BT.getText().trim());
				//int c = Integer.parseInt( CT.getText().trim());
				String at = AT.getText();
				String bt = BT.getText();
				String ct = CT.getText();
				//System.out.println("��ť�����...."+a+b+c);
				try{
				    Integer.valueOf(at);
				    Integer.valueOf(bt);
				    Integer.valueOf(ct);
				    int a = Integer.parseInt( AT.getText().trim());
					int b = Integer.parseInt( BT.getText().trim());
					int c = Integer.parseInt( CT.getText().trim());
					if(a<1 || a >200 ||b<1 || b >200 || c<1 || c >200){
						RT.setText("�������볬��");
					}else{
						//����������ȷ����ʼ�ж���������״
						if((a+b<=c)||(a+c<=b)||(b+c<=a)){
							RT.setText("���ܹ���������");
							}else if(a==b && b==c){
								RT.setText("�ȱ�������");
							}else if(a==b||b==c||a==c){
								RT.setText("����������");
							}else{
								RT.setText("һ��������");
							}
					}
				}catch(Exception es){
				    RT.setText("��������Ƿ�");
				}
				
				
			}
        	
        });
        
        JButton reinput = new JButton("��������");
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