import java.awt.event.*;
import java.nio.file.Path;
import java.awt.*;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import javax.swing.*;
/**
 * App
 */
public class App implements KeyListener{

        private static JFrame jFrame ;
        private static JPanel jp ;
        private static JLabel label ;
        private static Queue<Integer> qIndex;
        private static Queue<String> qString;
        private static JTextField text;
        String res = "";
        public App(){
             qIndex = new ArrayDeque<>();
             qString = new ArrayDeque<>();
        }

    public static void main(String[] args) {
        new App();
        jFrame = new JFrame();
        jp= new JPanel(new GridLayout(5, 5, 5, 5));
        
        label = new JLabel();
        text = new JTextField(10);
        App a = new App();
        text.addKeyListener(a);
        label.setText(generateLabel());
        jp.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
        jp.add(label);
        jp.add(text);
        jFrame.add(jp,0);
        jFrame.setBackground(Color.LIGHT_GRAY);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(! (e.getKeyChar() == ' ')){
            res+= e.getKeyChar();
            System.out.println(res);
        }else{
           if(res.equals(qString.peek())){
            System.out.println("Same");
            text.setText("");
            res ="";
           }
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
       
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        //
    }


    private static String generateLabel() {
        String para = "";
        int index;
        List<String> list = new EnglishWords(Path.of("words_alpha.txt"));
        Random r = new Random();
        
            for(int i=0;i<10;i++){
                index = r.nextInt(370106);
                qIndex.add(index);
                qString.add(list.get(qIndex.peek()));
                para+=list.get(index)+" ";
                }    

        return para;
    }

}