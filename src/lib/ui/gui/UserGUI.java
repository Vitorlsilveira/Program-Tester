package lib.ui.gui;

import java.io.File;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JRadioButton;
import lib.ui.IntUI;
import lib.userModule.IntUserFlow;
import lib.userModule.result.IntLiveResult;
import lib.userModule.result.IntLiveResultSet;
import lib.userModule.result.IntProgramState;
import static programtester.config.Configuration.TEST_PASS;

/**
 *
 * @author Parth Doshi
 */
public class UserGUI implements IntUI{

     private IntUserFlow uf;
     private List<? extends IntProgramState> ps;
          
     public UserGUI(IntUserFlow uf){
          this.uf=uf;
          this.uf.register(this);
          ps=uf.getAllProgramDetail();
          
     }
  public void display(long pid)
  {
       System.out.println("Inside display of UserGUI");
       IntProgramState ips = null;
       for (IntProgramState k : ps)
            if(k.getProgramID() == pid)
            {
                 ips = k;
                 break;
            }
    QuestionPage qqp=new QuestionPage(ips,this);
          
    
    }
     public void run(long pid){
        String cmd=null;
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("choosertitle");
        String fullPath = null;
        int option = chooser.showOpenDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            String sf = chooser.getSelectedFile().getName();
            File file = chooser.getCurrentDirectory();
            fullPath = file.getPath();
             JRadioButton jr1=new JRadioButton("C or C++");
             JRadioButton jr2=new JRadioButton("Java");
             JRadioButton jr3=new JRadioButton("Python");
             ButtonGroup bg=new ButtonGroup();
             bg.add(jr1);
             bg.add(jr2);
             bg.add(jr3);
             if(jr1.isSelected()){
                  cmd=fullPath;
             }
             else if(jr2.isSelected()){
                String dcmd = "java " + fullPath + "\\" + sf;
                StringTokenizer st = new StringTokenizer(dcmd,".");
                cmd = st.nextToken();     
             }
             else if(jr3.isSelected()){
                String dcmd = "python " + fullPath + "\\" + sf;
                StringTokenizer st = new StringTokenizer(dcmd,".");
                cmd = st.nextToken();
             }
            //System.out.println("The selected file's path is " + fullPath);
            //System.out.println("The selected file is " + sf);
            
        }
          IntLiveResultSet ilr = uf.execute(pid, cmd);
          ResultPage rrp=new ResultPage(ilr);
          
     }
     
     
     @Override
     public void showMessage(String message) {
          
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public void start() {
          System.out.println("ABC");
          StartPage sp=new StartPage(ps,this);
     }

     @Override
     public void close() {
          uf.close();
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public String Prompt(String message) {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }
     
}
/*
          int i=obj.getState();
          switch (i){
               case TEST_PASS://code
                    break;
          }
*/