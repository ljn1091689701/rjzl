
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class login {

    public static void main(String[] args) {
        // 创建 JFrame 实例
        JFrame frame = new JFrame("登录系统");
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

        JLabel Title = new JLabel("请输入登录信息:");
        Title.setBounds(5,10,100,20);
        panel.add(Title);

        // 创建 JLabel
        JLabel A = new JLabel("账号:");
        A.setBounds(10,40,80,25);
        panel.add(A);


        final JTextField AT = new JTextField(20);
        AT.setBounds(100,40,165,25);
        panel.add(AT);


        JLabel B = new JLabel("密码:");
        B.setBounds(10,80,80,25);
        panel.add(B);

        final JTextField BT = new JTextField(20);
        BT.setBounds(100,80,165,25);
        panel.add(BT);


        JLabel R = new JLabel("结果:");
        R.setBounds(10,110,80,25);
        panel.add(R);

        final JTextField RT = new JTextField(20);
        RT.setBounds(100,110,165,25);
        panel.add(RT);

        // 按钮
        JButton result = new JButton("登录");
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
                int lena = at.length(); //账号长度
                int lenb = bt.length(); //密码长度
                if(lena<6 || lena>10 || lenb!=6){
                    RT.setText("不合法");
                    return;
                }
                if(at.charAt(0)<'z' && at.charAt(0)>'a' || at.charAt(0)<'Z' && at.charAt(0)>'A' ) //字母
                {
                    //账号合法，判断密码


                        int mima = Integer.parseInt(bt); //若可转成数字，则正确
                        if(mima<=999999 && mima>=100000) {
                            System.out.println("e ....");
                            RT.setText("合法");
                        }


                }else{
                    RT.setText("不合法");
                    return;
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

            }
        });

    }

}